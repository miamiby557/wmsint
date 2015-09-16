package com.lnet.wmsint.jh.receive;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://localhost:8080/services/jh")
public interface ReceiveService {

    //佳华6种出库
    @WebMethod()
    public void receiveOutputData(@WebParam(name = "orig") String orig, @WebParam(name = "sign") String sign);

    //佳华出库信息接受反馈
    public void receiveConfirm(@WebParam(name = "orig") String orig, @WebParam(name = "sign") String sign);
}
