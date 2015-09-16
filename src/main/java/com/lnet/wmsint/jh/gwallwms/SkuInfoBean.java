package com.lnet.wmsint.jh.gwallwms;


import java.util.List;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "skuInfo")
public class SkuInfoBean {
	
	private static final long serialVersionUID = 1L;

	private String goodsCode;	

	private String goodsName;	

	private String goodsAbbreviation;	

	private String seasonCode;

	private String seasonName;

	private String brandCode;	

	private String brandName;	

	private String goodsType;	

	private List<SkuInfoDetailBean> skuInfoLists;
	public String getGoodsCode() {
		return goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsAbbreviation() {
		return goodsAbbreviation;
	}
	public void setGoodsAbbreviation(String goodsAbbreviation) {
		this.goodsAbbreviation = goodsAbbreviation;
	}
	public String getSeasonCode() {
		return seasonCode;
	}
	public void setSeasonCode(String seasonCode) {
		this.seasonCode = seasonCode;
	}
	public String getSeasonName() {
		return seasonName;
	}
	public void setSeasonName(String seasonName) {
		this.seasonName = seasonName;
	}
	public String getBrandCode() {
		return brandCode;
	}
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getGoodsType() {
		return goodsType;
	}
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}
	public List<SkuInfoDetailBean> getSkuInfoLists() {
		return skuInfoLists;
	}
	public void setSkuInfoLists(List<SkuInfoDetailBean> skuInfoLists) {
		this.skuInfoLists = skuInfoLists;
	}
	
}

