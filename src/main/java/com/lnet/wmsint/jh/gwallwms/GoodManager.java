package com.lnet.wmsint.jh.gwallwms;

import com.google.gson.Gson;
import com.lnet.wmsint.jh.util.HashUtils;
import com.lnet.wmsint.jh.util.HttpClient;
import com.lnet.wmsint.jh.util.MD5;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.StringWriter;

/**
 * Created by admin on 2015/6/16.
 */
public class GoodManager {
    private String serviceName;
    private String serviceUrl;
    private String format;
    private String appKey;
    private String appSecret;
    private int encrypt;

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public void setEncrypt(int encrypt) {
        this.encrypt = encrypt;
    }

    public void createOrUpdateGood(GoodsCreateOrUpadteRequest request) throws JAXBException {
        String content = null;
        String secret = "";
        if ("XML".equals(format)) {
            StringWriter writer = new StringWriter();
            JAXBContext.newInstance(GoodsCreateOrUpadteRequest.class).createMarshaller().marshal(request,writer);
            content = writer.toString();
        } else {
            Gson gson = new Gson();
            content = gson.toJson(request);
        }

        //base64编码
        String baseContent = null;
        if (1==encrypt) {
            try {
                baseContent = HashUtils.encryptBASE64(content.getBytes());
            } catch (Exception e) {
                e.printStackTrace();
            }
            //md5加密
            secret = new MD5().getMD5ofStr(baseContent + appSecret);
        } else {
            baseContent = content;
        }

        //请求服务
        HttpClient client = new HttpClient();
        String param = "appkey=" + appKey + "&service=" + serviceName + "&format=" + format + "&encrypt=" + encrypt + "&content=" + baseContent + "&secret=" + secret;
        String result = client.pub(serviceUrl, param);
    }
}
