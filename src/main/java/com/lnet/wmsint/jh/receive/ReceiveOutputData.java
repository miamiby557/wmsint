
package com.lnet.wmsint.jh.receive;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receiveOutputData", propOrder = {
    "orig",
    "sign"
})
public class ReceiveOutputData {

    protected String orig;
    protected String sign;


    public String getOrig() {
        return orig;
    }


    public void setOrig(String value) {
        this.orig = value;
    }


    public String getSign() {
        return sign;
    }


    public void setSign(String value) {
        this.sign = value;
    }

}
