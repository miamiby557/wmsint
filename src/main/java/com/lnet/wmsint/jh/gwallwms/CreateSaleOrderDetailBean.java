package com.lnet.wmsint.jh.gwallwms;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class CreateSaleOrderDetailBean {
	
	private String sku;
	private String qty;
	private String gwf1;
	private String gwf2;
	private String gwf3;
	private String gwf4;
	private String gwf5;
	
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public String getGwf1() {
		return gwf1;
	}
	public void setGwf1(String gwf1) {
		this.gwf1 = gwf1;
	}
	
	public String getGwf2() {
		return gwf2;
	}
	public void setGwf2(String gwf2) {
		this.gwf2 = gwf2;
	}
	
	public String getGwf3() {
		return gwf3;
	}
	public void setGwf3(String gwf3) {
		this.gwf3 = gwf3;
	}
	public String getGwf4() {
		return gwf4;
	}
	public void setGwf4(String gwf4) {
		this.gwf4 = gwf4;
	}
	public String getGwf5() {
		return gwf5;
	}
	public void setGwf5(String gwf5) {
		this.gwf5 = gwf5;
	}
}
