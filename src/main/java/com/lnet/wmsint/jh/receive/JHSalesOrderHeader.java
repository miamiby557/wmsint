package com.lnet.wmsint.jh.receive;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class JHSalesOrderHeader {
    @XmlElement(name = "HEADER_ID")
	private String headerId;
    @XmlElement(name = "TRANSACTION_TYPE")
	private String transactionType;
    @XmlElement(name = "OUT_TYPE")
	private String outType;
    @XmlElement(name = "BILL_CODE")
	private String billCode;
    @XmlElement(name = "ORDER_NO")
	private String orderNo;
    @XmlElement(name = "CUSTOMER_ID")
	private String customerId;
    @XmlElement(name = "CUSTOMER_NAME")
	private String customerName;
    @XmlElement(name = "WAREHOUSE_ID")
	private String wareHouseId;
    @XmlElement(name = "WAREHOUSE_NAME")
	private String wareHouseName;
    @XmlElement(name = "BILL_DATE")
	private String billDate;
    @XmlElement(name = "DELIVERY_ADDRESS")
	private String deliveryAddress;
    @XmlElement(name = "CONTACT")
	private String contact;
    @XmlElement(name = "CONTACT_PHONE")
	private String contactPhone;
    @XmlElement(name = "SHIPING_INSTRUCTION")
	private String shipingIstruction;
    @XmlElement(name = "OPERATOR")
	private String operator;
    @XmlElement(name = "DEPARTMENT")
	private String department;
    @XmlElement(name = "TRANSPORT_METHOD")
	private String transportMethod;
    @XmlElement(name = "DELIVERY_CITY")
	private String deliveryCity;
    @XmlElement(name = "TRANSPORT_TYPE")
	private String transportType;
    @XmlElement(name = "TRANSPORT_REGION")
	private String transportRegion;
    @XmlElement(name = "DELIVERY_FOR_INFORM")
	private String deliveryForInform;
    @XmlElement(name = "SALES_PERSON")
	private String salesPerson;
    @XmlElement(name = "DELIVERY_METHOD")
	private String deliveryMethod;
    @XmlElement(name = "SHIPMENT_TYPE")
	private String shipmentType;
    @XmlElement(name = "SHIFOU_FAPIAO")
	private String shifouFapiao;
    @XmlElement(name = "SHIFOU_SHANGMEN")
	private String shifouShangmen;
    @XmlElement(name = "SHIFOU_DAISHOU")
	private String shifouDaishou;
    @XmlElement(name = "COMPANY_CODE")
	private String companyCode;
    @XmlElement(name = "RETURN_URL")
    private String returnUrl;

    public JHSalesOrderHeader() {
    }

    public JHSalesOrderHeader(String headerId, String transactionType, String outType, String billCode, String orderNo, String customerId, String customerName, String wareHouseId, String wareHouseName, String billDate, String deliveryAddress, String contact, String contactPhone, String shipingIstruction, String operator, String department, String transportMethod, String deliveryCity, String transportType, String transportRegion, String deliveryForInform, String salesPerson, String deliveryMethod, String shipmentType, String shifouFapiao, String shifouShangmen, String shifouDaishou, String companyCode, String returnUrl) {
        this.headerId = headerId;
        this.transactionType = transactionType;
        this.outType = outType;
        this.billCode = billCode;
        this.orderNo = orderNo;
        this.customerId = customerId;
        this.customerName = customerName;
        this.wareHouseId = wareHouseId;
        this.wareHouseName = wareHouseName;
        this.billDate = billDate;
        this.deliveryAddress = deliveryAddress;
        this.contact = contact;
        this.contactPhone = contactPhone;
        this.shipingIstruction = shipingIstruction;
        this.operator = operator;
        this.department = department;
        this.transportMethod = transportMethod;
        this.deliveryCity = deliveryCity;
        this.transportType = transportType;
        this.transportRegion = transportRegion;
        this.deliveryForInform = deliveryForInform;
        this.salesPerson = salesPerson;
        this.deliveryMethod = deliveryMethod;
        this.shipmentType = shipmentType;
        this.shifouFapiao = shifouFapiao;
        this.shifouShangmen = shifouShangmen;
        this.shifouDaishou = shifouDaishou;
        this.companyCode = companyCode;
        this.returnUrl = returnUrl;
    }

    public String getHeaderId() {
        return headerId;
    }

    public void setHeaderId(String headerId) {
        this.headerId = headerId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getOutType() {
        return outType;
    }

    public void setOutType(String outType) {
        this.outType = outType;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getWareHouseId() {
        return wareHouseId;
    }

    public void setWareHouseId(String wareHouseId) {
        this.wareHouseId = wareHouseId;
    }

    public String getWareHouseName() {
        return wareHouseName;
    }

    public void setWareHouseName(String wareHouseName) {
        this.wareHouseName = wareHouseName;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getShipingIstruction() {
        return shipingIstruction;
    }

    public void setShipingIstruction(String shipingIstruction) {
        this.shipingIstruction = shipingIstruction;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTransportMethod() {
        return transportMethod;
    }

    public void setTransportMethod(String transportMethod) {
        this.transportMethod = transportMethod;
    }

    public String getDeliveryCity() {
        return deliveryCity;
    }

    public void setDeliveryCity(String deliveryCity) {
        this.deliveryCity = deliveryCity;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public String getTransportRegion() {
        return transportRegion;
    }

    public void setTransportRegion(String transportRegion) {
        this.transportRegion = transportRegion;
    }

    public String getDeliveryForInform() {
        return deliveryForInform;
    }

    public void setDeliveryForInform(String deliveryForInform) {
        this.deliveryForInform = deliveryForInform;
    }

    public String getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(String salesPerson) {
        this.salesPerson = salesPerson;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public String getShipmentType() {
        return shipmentType;
    }

    public void setShipmentType(String shipmentType) {
        this.shipmentType = shipmentType;
    }

    public String getShifouFapiao() {
        return shifouFapiao;
    }

    public void setShifouFapiao(String shifouFapiao) {
        this.shifouFapiao = shifouFapiao;
    }

    public String getShifouShangmen() {
        return shifouShangmen;
    }

    public void setShifouShangmen(String shifouShangmen) {
        this.shifouShangmen = shifouShangmen;
    }

    public String getShifouDaishou() {
        return shifouDaishou;
    }

    public void setShifouDaishou(String shifouDaishou) {
        this.shifouDaishou = shifouDaishou;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }
}
