package com.lnet.wmsint.jh.job;

import com.lnet.wmsint.jh.gwallwms.CreateSaleOrderRequest;
import com.lnet.wmsint.jh.gwallwms.SaleOrderManager;
import com.lnet.wmsint.jh.receive.JHSalesOrder;
import com.lnet.wmsint.jh.receive.JmsSender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.jms.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

/**
 * Created by admin on 2015/6/8.
 */
public class JHExceptionProcessJob implements MessageListener{
    private static final Logger logger = LoggerFactory.getLogger(JHExceptionProcessJob.class);

    @Autowired
    @Qualifier("jhErrorSender")
    private JmsSender jmsSender;

    @Autowired
    private SaleOrderManager saleOrderManager;

    private int count = 4;
    @Override
    public void onMessage(Message message) {
        logger.info("得到队列异常信息...");
        if(message instanceof MapMessage){
            MapMessage mapMessage = (MapMessage) message;
            String content = null;
            try {
                int count = mapMessage.getInt("processedCount");
                if(count<4){
                    content = mapMessage.getString("content");
                    logger.info(content);

                    //转换成JH接收Bean
                    JAXBContext jaxbContext = JAXBContext.newInstance(JHSalesOrder.class);
                    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
                    JHSalesOrder jhSalesOrder = (JHSalesOrder)unmarshaller.unmarshal(new StringReader(content));

                    //验证数据格式，必要信息是否存在
                    ValidateMessage validateMessage = SaleOrderValidator.validate(jhSalesOrder);
                    if(validateMessage.isResult()){
                        jmsSender.Send(content,++count);
                    }else{

                        //将JH接收Bean转换为GwallWMS出库Bean
                        CreateSaleOrderRequest request = SaleOrderTransfer.transfer(jhSalesOrder);
                        //TODO 检查是否存在商品档案

                        //调用GwallWMS插入出库单
                        saleOrderManager.createSaleOrder(request);
                    }
                }
                logger.info("处理异常信息完毕...");
            } catch (JMSException e) {
                e.printStackTrace();
            } catch (JAXBException e) {
                e.printStackTrace();
            }
        }
    }
}
