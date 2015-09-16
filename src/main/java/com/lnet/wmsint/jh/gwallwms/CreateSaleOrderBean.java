package com.lnet.wmsint.jh.gwallwms;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;
@XmlAccessorType(XmlAccessType.FIELD)
public class CreateSaleOrderBean {
	private String orderCode;	
	private String warehouseCode;	
	private String goodsOwner;
	private String fromType;	
	private String fromCode;		
	private String isUrgency;	
	private String downDate;	
	private String logisticsCompanyCode;
	private String logisticsCompanyName;
	private String orderWaveCount;
	private String signType;
	private String consignee;	
	private String postCode;	
	private String provinceName;	
	private String cityName;	
	private String areaName;	
	private String address;	
	private String mobile;	
	private String tel;	
	private String sellersMessage;	
	private String buyerMessage;	
	private String merchantMessage;	
	private String totalPrice;
	private String gwf1;
	private String gwf2;
	private String gwf3;
	private String gwf4;
	private String gwf5;

    @XmlElement(name = "itemInfo")
    private List<CreateSaleOrderDetailBean> items;
	
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getWarehouseCode() {
		return warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}
	public String getFromType() {
		return fromType;
	}
	public void setFromType(String fromType) {
		this.fromType = fromType;
	}
	public String getFromCode() {
		return fromCode;
	}
	public void setFromCode(String fromCode) {
		this.fromCode = fromCode;
	}
	public String getIsUrgency() {
		return isUrgency;
	}
	public void setIsUrgency(String isUrgency) {
		this.isUrgency = isUrgency;
	}
	public String getDownDate() {
		return downDate;
	}
	public void setDownDate(String downDate) {
		this.downDate = downDate;
	}
	public String getLogisticsCompanyCode() {
		return logisticsCompanyCode;
	}
	public void setLogisticsCompanyCode(String logisticsCompanyCode) {
		this.logisticsCompanyCode = logisticsCompanyCode;
	}
	public String getLogisticsCompanyName() {
		return logisticsCompanyName;
	}
	public void setLogisticsCompanyName(String logisticsCompanyName) {
		this.logisticsCompanyName = logisticsCompanyName;
	}

	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getSellersMessage() {
		return sellersMessage;
	}
	public void setSellersMessage(String sellersMessage) {
		this.sellersMessage = sellersMessage;
	}
	public String getBuyerMessage() {
		return buyerMessage;
	}
	public void setBuyerMessage(String buyerMessage) {
		this.buyerMessage = buyerMessage;
	}
	public String getMerchantMessage() {
		return merchantMessage;
	}
	public void setMerchantMessage(String merchantMessage) {
		this.merchantMessage = merchantMessage;
	}
	public List<CreateSaleOrderDetailBean> getItems() {
		return items;
	}

	public void setItems(List<CreateSaleOrderDetailBean> items) {
		this.items = items;
	}

	public String getGoodsOwner() {
		return goodsOwner;
	}
	public void setGoodsOwner(String goodsOwner) {
		this.goodsOwner = goodsOwner;
	}
	public String getOrderWaveCount() {
		return orderWaveCount;
	}
	public void setOrderWaveCount(String orderWaveCount) {
		this.orderWaveCount = orderWaveCount;
	}
	public String getSignType() {
		return signType;
	}
	public void setSignType(String signType) {
		this.signType = signType;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
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
