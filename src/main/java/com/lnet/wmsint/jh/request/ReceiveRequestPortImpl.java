
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.lnet.wmsint.jh.request;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.0
 * 2015-06-02T20:19:16.018+08:00
 * Generated source version: 3.1.0
 */

@WebService(
        serviceName = "ReceiveRequestService",
        portName = "ReceiveRequestPort",
        targetNamespace = "http://changhongit.com/")

public class ReceiveRequestPortImpl implements ReceiveRequest {

    private static final Logger LOG = Logger.getLogger(ReceiveRequestPortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.lnet.wsmint.jh.request.ReceiveRequest#requestReceiveTask(java.lang.String  arg0 ,)java.lang.String  arg1 )*
     */
    public String requestReceiveTask(String arg0, String arg1) {
        LOG.info("Executing operation requestReceiveTask");
        System.out.println(arg0);
        System.out.println(arg1);
        try {
            String _return = "";
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
