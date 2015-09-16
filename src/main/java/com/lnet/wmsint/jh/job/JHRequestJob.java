package com.lnet.wmsint.jh.job;

import com.lnet.wmsint.jh.request.ReceiveRequest;
import com.lnet.wmsint.jh.request.ReceiveRequestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.net.MalformedURLException;
import java.net.URL;

public class JHRequestJob {

    private static final Logger logger = LoggerFactory.getLogger(JHRequestJob.class);

    private String companyCode;
    private String returnUrl;
    private String wsdlURL;

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getWsdlURL() {
        return wsdlURL;
    }

    public void setWsdlURL(String wsdlURL) {
        this.wsdlURL = wsdlURL;
    }

    public void work() throws MalformedURLException {

        logger.info("佳华出库请求:"+returnUrl);
        ReceiveRequestService ss = StringUtils.isEmpty(wsdlURL) ?
                new ReceiveRequestService() : new ReceiveRequestService(new URL(wsdlURL));

        ReceiveRequest port = ss.getReceiveRequestPort();
        String messageString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><XML><param><COMPANY_CODE>" + companyCode + "</COMPANY_CODE><RETURN_URL>" + returnUrl + "</RETURN_URL></param></XML>";
        String result = port.requestReceiveTask(messageString, messageString);
        System.out.println(result);
        logger.info("佳华出库请求完成");

    }


}
