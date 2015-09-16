package com.lnet.wmsint.jh.request;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.0
 * 2015-06-02T20:19:16.043+08:00
 * Generated source version: 3.1.0
 */
@WebServiceClient(name = "ReceiveRequestService", targetNamespace = "http://changhongit.com/")
public class ReceiveRequestService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://changhongit.com/", "ReceiveRequestService");
    public final static QName ReceiveRequestPort = new QName("http://changhongit.com/", "ReceiveRequestPort");

    static {
        URL url = null;
        try {
            url = new URL("classpath:jh_request_wsdl.xml");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ReceiveRequestService.class.getName())
                    .log(java.util.logging.Level.INFO,
                            "Can not initialize the default wsdl from {0}", "classpath:jh_request_wsdl.xml");
        }
        WSDL_LOCATION = url;
    }

    public ReceiveRequestService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ReceiveRequestService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReceiveRequestService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ReceiveRequestService(WebServiceFeature... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ReceiveRequestService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ReceiveRequestService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }


    /**
     * @return returns ReceiveRequest
     */
    @WebEndpoint(name = "ReceiveRequestPort")
    public ReceiveRequest getReceiveRequestPort() {
        return super.getPort(ReceiveRequestPort, ReceiveRequest.class);
    }

    /**
     * @param features A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return returns ReceiveRequest
     */
    @WebEndpoint(name = "ReceiveRequestPort")
    public ReceiveRequest getReceiveRequestPort(WebServiceFeature... features) {
        return super.getPort(ReceiveRequestPort, ReceiveRequest.class, features);
    }

}
