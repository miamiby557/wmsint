package com.lnet.wmsint.jh.gwallwms;


import com.google.gson.Gson;
import com.lnet.wmsint.jh.util.HashUtils;
import com.lnet.wmsint.jh.util.HttpClient;
import com.lnet.wmsint.jh.util.MD5;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.StringWriter;


public class SaleOrderManager {

    private String serviceName;
    private String serviceUrl;
    private String format;
    private String appKey;
    private String appSecret;
    private int encrypt;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public int getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(int encrypt) {
        this.encrypt = encrypt;
    }

    public void createSaleOrder(CreateSaleOrderRequest request) throws JAXBException {
        String content = null;
        String secret = "";

        if ("XML".equals(format)) {
            StringWriter writer = new StringWriter();
            JAXBContext.newInstance(CreateSaleOrderRequest.class).createMarshaller().marshal(request, writer);
            content = writer.toString();
        } else {
            Gson gson = new Gson();
            content = gson.toJson(request);
        }

        String baseContent = null;
        if (this.encrypt == 1) {
            try {
                baseContent = HashUtils.encryptBASE64(content.getBytes());
            } catch (Exception e) {
                e.printStackTrace();
            }
            secret = new MD5().getMD5ofStr(baseContent + this.appSecret);
        } else {
            baseContent = content;
        }

        HttpClient client = new HttpClient();
        String param = "appkey=" + this.appKey + "&service=" + this.serviceName + "&format=" + this.format + "&encrypt=" + this.encrypt + "&content=" + baseContent + "&secret=" + secret;
        String result = client.pub(this.serviceUrl, param);

        System.out.println(result);
    }
}
