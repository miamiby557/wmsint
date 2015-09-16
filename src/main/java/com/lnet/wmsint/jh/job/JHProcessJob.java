package com.lnet.wmsint.jh.job;

import com.lnet.wmsint.jh.gwallwms.CreateSaleOrderRequest;
import com.lnet.wmsint.jh.gwallwms.SaleOrderManager;
import com.lnet.wmsint.jh.receive.JHSalesOrder;
import com.lnet.wmsint.jh.receive.JmsSender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Map;

public class JHProcessJob implements MessageListener {

    private static final Logger logger = LoggerFactory.getLogger(JHProcessJob.class);

    @Autowired
    @Qualifier("jhErrorSender")
    private JmsSender jmsSender;

    @Autowired
    private SaleOrderManager saleOrderManager;


    @Override
    public void onMessage(Message message) {
        logger.info("得到队列信息...");
        if (message instanceof MapMessage) {
            MapMessage mapMessage = (MapMessage) message;
            String content = null;
            try {
                content = mapMessage.getString("content");
                logger.info(content);

                //转换成JH接收Bean
                JAXBContext jaxbContext = JAXBContext.newInstance(JHSalesOrder.class);
                Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
                JHSalesOrder jhSalesOrder = (JHSalesOrder)unmarshaller.unmarshal(new StringReader(content));

                //验证数据格式，必要信息是否存在
                ValidateMessage validateMessage = SaleOrderValidator.validate(jhSalesOrder);
                if(validateMessage.isResult()){
                    jmsSender.Send(content,0);
                }else{
                    //将JH接收Bean转换为GwallWMS出库Bean
                    CreateSaleOrderRequest request = SaleOrderTransfer.transfer(jhSalesOrder);
                    //TODO 检查是否存在商品档案


                    //调用GwallWMS插入出库单
                    saleOrderManager.createSaleOrder(request);
                }
            } catch (JMSException e) {
                e.printStackTrace();
            } catch (JAXBException e) {
                e.printStackTrace();
                logger.info("XML To Bean 异常...");
            }
        }

    }
}
