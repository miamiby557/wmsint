package com.lnet.wmsint.jh.filter;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.phase.PhaseInterceptorChain;
import org.apache.cxf.transport.http.AbstractHTTPDestination;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.WebServiceContext;
import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2015/9/8.
 */
public class CXFInFilter extends AbstractPhaseInterceptor<SoapMessage> {


    public CXFInFilter(String phase) {
        super(Phase.RECEIVE);
    }

    @Override
    public void handleMessage(SoapMessage soapMessage) throws Fault {
        HttpServletRequest request = (HttpServletRequest) soapMessage.get(
                AbstractHTTPDestination.HTTP_REQUEST);//这句可以获取到request
        try {
            request.setCharacterEncoding("GB2312");
            System.out.println("contentType:"+request.getContentType());

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
