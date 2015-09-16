package com.lnet.wmsint.jh.receive;

import org.apache.cxf.jaxws.context.WrappedMessageContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.servlet.ServletRequest;
import javax.xml.bind.JAXBException;
import javax.xml.ws.WebServiceContext;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;

@WebService(endpointInterface = "com.lnet.wmsint.jh.receive.ReceiveService")
public class ReceiveServiceImpl implements ReceiveService {

    private static final Logger logger = LoggerFactory.getLogger(ReceiveServiceImpl.class);

    @Autowired
    @Qualifier("jhIncomingSender")
    private JmsSender jmsSender;

    /*@Resource
    WebServiceContext wsContext;*/

    @Override
    public void receiveOutputData(final String orig, String sign) {
        logger.info("佳华返回XML:\n" + orig);
        jmsSender.Send(orig,0);  //0 为xml插到队列，处理次数为0
    }


    @Override
    public void receiveConfirm(String orig, String sign) {
        logger.info(orig);
    }
}
