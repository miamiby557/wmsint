package com.lnet.wmsint.jh.receive;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
public class JHSalesOrderLine {
	@XmlElement(name = "LINE_ID")
	private String lineId;
    @XmlElement(name = "ITEM_ID")
	private String itemId;
    @XmlElement(name = "ITEM_NAME")
	private String itemName;
    @XmlElement(name = "ITEM_DESCRIPTION")
	private String itemDescription;
    @XmlElement(name = "ITEM_NUMBER")
	private String itemNumber;
    @XmlElement(name = "LOT_NUMBER")
	private String lotNumber;
    @XmlElement(name = "SUBINVENTORY_CODE")
	private String subInventoryCode;
    @XmlElement(name = "LOCATOR")
    private String locator;
    @XmlElement(name = "ITEM_CATE")
    private String itemCate;
    @XmlElement(name = "SN_CONTROL")
    private String snControl;
    @XmlElement(name = "UNIT_PRICE")
    private String unitPrice;

    public JHSalesOrderLine() {
    }

    public JHSalesOrderLine(String lineId, String itemId, String itemName, String itemDescription, String itemNumber, String lotNumber, String subInventoryCode, String locator, String itemCate, String snControl, String unitPrice) {
        this.lineId = lineId;
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemNumber = itemNumber;
        this.lotNumber = lotNumber;
        this.subInventoryCode = subInventoryCode;
        this.locator = locator;
        this.itemCate = itemCate;
        this.snControl = snControl;
        this.unitPrice = unitPrice;
    }

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public String getSubInventoryCode() {
        return subInventoryCode;
    }

    public void setSubInventoryCode(String subInventoryCode) {
        this.subInventoryCode = subInventoryCode;
    }

    public String getLocator() {
        return locator;
    }

    public void setLocator(String locator) {
        this.locator = locator;
    }

    public String getItemCate() {
        return itemCate;
    }

    public void setItemCate(String itemCate) {
        this.itemCate = itemCate;
    }

    public String getSnControl() {
        return snControl;
    }

    public void setSnControl(String snControl) {
        this.snControl = snControl;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }
}
