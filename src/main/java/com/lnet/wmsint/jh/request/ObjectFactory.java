
package com.lnet.wmsint.jh.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lnet.wsmint.jh.request package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RequestReceiveTaskArg0_QNAME = new QName("", "arg0");
    private final static QName _RequestReceiveTaskArg1_QNAME = new QName("", "arg1");
    private final static QName _RequestReceiveTaskResponseReturn_QNAME = new QName("", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lnet.wsmint.jh.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestReceiveTask }
     * 
     */
    public RequestReceiveTask createRequestReceiveTask() {
        return new RequestReceiveTask();
    }

    /**
     * Create an instance of {@link RequestReceiveTaskResponse }
     * 
     */
    public RequestReceiveTaskResponse createRequestReceiveTaskResponse() {
        return new RequestReceiveTaskResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "arg0", scope = RequestReceiveTask.class)
    public JAXBElement<String> createRequestReceiveTaskArg0(String value) {
        return new JAXBElement<String>(_RequestReceiveTaskArg0_QNAME, String.class, RequestReceiveTask.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "arg1", scope = RequestReceiveTask.class)
    public JAXBElement<String> createRequestReceiveTaskArg1(String value) {
        return new JAXBElement<String>(_RequestReceiveTaskArg1_QNAME, String.class, RequestReceiveTask.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = RequestReceiveTaskResponse.class)
    public JAXBElement<String> createRequestReceiveTaskResponseReturn(String value) {
        return new JAXBElement<String>(_RequestReceiveTaskResponseReturn_QNAME, String.class, RequestReceiveTaskResponse.class, value);
    }

}
