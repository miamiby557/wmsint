package com.lnet.wmsint.jh.gwallwms;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * 
 * @author Administrator
 *
 */
@XmlRootElement(name = "request")
public class CreateSaleOrderRequest {

	private static final long serialVersionUID = 1L;

	private List<CreateSaleOrderBean> saleOrderList;
    @XmlElement(name = "orderInfo")
	public List<CreateSaleOrderBean> getSaleOrderList() {
		return saleOrderList;
	}

	public void setSaleOrderList(List<CreateSaleOrderBean> saleOrderList) {
		this.saleOrderList = saleOrderList;
	}
	
	
}
