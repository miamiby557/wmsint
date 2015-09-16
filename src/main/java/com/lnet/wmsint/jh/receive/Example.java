package com.lnet.wmsint.jh.receive;

import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * Created by lenovo on 2015/5/8.
 */
public class Example {
    public  static  void main(String[] args) {
    }

    @Test
    public void testObj() throws JAXBException {
        JHSalesOrder request = new JHSalesOrder();
        JHSalesOrderHeader header = new JHSalesOrderHeader("1234","1234","22","33","44","23","23","23","23","23","23","23","23","23","23","23","23","23","23","2","2","3","3","3","4","4","5","5","6");
        JHSalesOrderLine line = new JHSalesOrderLine("1","2","3","4","5","6","7","8","9","0","00");
        request.setHeader(header);
        request.getLines().add(line);
        JAXBContext jaxbContext = JAXBContext.newInstance(JHSalesOrder.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        StringWriter writer = new StringWriter();
        marshaller.marshal(request,writer);
        System.out.println(writer.toString());
    }

    @Test
    public void testXml() throws JAXBException {

        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                    "<XML>\n" +
                    "    <HEADER>\n" +
                    "        <HEADER_ID>1234</HEADER_ID>\n" +
                    "        <TRANSACTION_TYPE>1234</TRANSACTION_TYPE>\n" +
                    "        <OUT_TYPE>22</OUT_TYPE>\n" +
                    "        <BILL_CODE>33</BILL_CODE>\n" +
                    "        <ORDER_NO>44</ORDER_NO>\n" +
                    "        <CUSTOMER_ID>23</CUSTOMER_ID>\n" +
                    "        <CUSTOMER_NAME>23</CUSTOMER_NAME>\n" +
                    "        <WAREHOUSE_ID>23</WAREHOUSE_ID>\n" +
                    "        <WAREHOUSE_NAME>23</WAREHOUSE_NAME>\n" +
                    "        <BILL_DATE>23</BILL_DATE>\n" +
                    "        <DELIVERY_ADDRESS>23</DELIVERY_ADDRESS>\n" +
                    "        <CONTACT>23</CONTACT>\n" +
                    "        <CONTACT_PHONE>23</CONTACT_PHONE>\n" +
                    "        <SHIPING_INSTRUCTION>23</SHIPING_INSTRUCTION>\n" +
                    "        <OPERATOR>23</OPERATOR>\n" +
                    "        <DEPARTMENT>23</DEPARTMENT>\n" +
                    "        <TRANSPORT_METHOD>23</TRANSPORT_METHOD>\n" +
                    "        <DELIVERY_CITY>23</DELIVERY_CITY>\n" +
                    "        <TRANSPORT_TYPE>23</TRANSPORT_TYPE>\n" +
                    "        <TRANSPORT_REGION>2</TRANSPORT_REGION>\n" +
                    "        <DELIVERY_FOR_INFORM>2</DELIVERY_FOR_INFORM>\n" +
                    "        <SALES_PERSON>3</SALES_PERSON>\n" +
                    "        <DELIVERY_METHOD>3</DELIVERY_METHOD>\n" +
                    "        <SHIPMENT_TYPE>3</SHIPMENT_TYPE>\n" +
                    "        <SHIFOU_FAPIAO>4</SHIFOU_FAPIAO>\n" +
                    "        <SHIFOU_SHANGMEN>4</SHIFOU_SHANGMEN>\n" +
                    "        <SHIFOU_DAISHOU>5</SHIFOU_DAISHOU>\n" +
                    "        <COMPANY_CODE>5</COMPANY_CODE>\n" +
                    "        <RETURN_URL>6</RETURN_URL>\n" +
                    "    </HEADER>\n" +
                    "    <LINE>\n" +
                    "        <LINE_ID>1</LINE_ID>\n" +
                    "        <ITEM_ID>2</ITEM_ID>\n" +
                    "        <ITEM_NAME>3</ITEM_NAME>\n" +
                    "        <ITEM_DESCRIPTION>4</ITEM_DESCRIPTION>\n" +
                    "        <ITEM_NUMBER>5</ITEM_NUMBER>\n" +
                    "        <LOT_NUMBER>6</LOT_NUMBER>\n" +
                    "        <SUBINVENTORY_CODE>7</SUBINVENTORY_CODE>\n" +
                    "        <LOCATOR>8</LOCATOR>\n" +
                    "        <ITEM_CATE>9</ITEM_CATE>\n" +
                    "        <SN_CONTROL>0</SN_CONTROL>\n" +
                    "        <UNIT_PRICE>00</UNIT_PRICE>\n" +
                    "    </LINE>\n" +
                    "</XML>";

        String xml1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><XML><HEADER><HEADER_ID>1056104</HEADER_ID><TRANSACTION_TYPE>CHH</TRANSACTION_TYPE><OUT_TYPE>销售出库</OUT_TYPE><BILL_CODE>1643847</BILL_CODE><ORDER_NO>3023051051</ORDER_NO><CUSTOMER_ID>25464</CUSTOMER_ID><CUSTOMER_NAME>福州鑫蓝克计算机技术工程有限公司</CUSTOMER_NAME><WAREHOUSE_ID>2248</WAREHOUSE_ID><WAREHOUSE_NAME>信产福州库</WAREHOUSE_NAME><BILL_DATE>2015-05-11</BILL_DATE><DELIVERY_ADDRESS>福州市台江区五一中路169号大利嘉城写字楼11层A8单元      阮晓勇/0591-83352855/13860677114</DELIVERY_ADDRESS><CONTACT></CONTACT><CONTACT_PHONE></CONTACT_PHONE><SHIPING_INSTRUCTION></SHIPING_INSTRUCTION><OPERATOR>周洋</OPERATOR><DEPARTMENT>互联网应用事业部</DEPARTMENT><TRANSPORT_METHOD>1公路运输</TRANSPORT_METHOD><DELIVERY_CITY>福建省.福州市.台江区</DELIVERY_CITY><TRANSPORT_TYPE>市内</TRANSPORT_TYPE><TRANSPORT_REGION>正常运输</TRANSPORT_REGION><DELIVERY_FOR_INFORM>0</DELIVERY_FOR_INFORM><SALES_PERSON>陈祝炜</SALES_PERSON><DELIVERY_METHOD>门到门/货运公司是否收支票:否/还款日期:25-06-15/还款类型:帐期</DELIVERY_METHOD><SHIPMENT_TYPE>正常--库房操作</SHIPMENT_TYPE><SHIFOU_FAPIAO></SHIFOU_FAPIAO><SHIFOU_SHANGMEN></SHIFOU_SHANGMEN><SHIFOU_DAISHOU></SHIFOU_DAISHOU><COMPANY_CODE>ED5DF71410840886</COMPANY_CODE><RETURN_URL>http://103.245.130.51:8080/EDISend/ReceiveReturnConfirmService?wsdl</RETURN_URL></HEADER><LINE><LINE_ID>2951878</LINE_ID><ITEM_ID>177056</ITEM_ID><ITEM_NAME>NI7001W</ITEM_NAME><ITEM_DESCRIPTION>DI-7001W   企业路由器</ITEM_DESCRIPTION><ITEM_NUMBER>10</ITEM_NUMBER><LOT_NUMBER>20150508033D150506H-6-0506</LOT_NUMBER><SUBINVENTORY_CODE>良品库</SUBINVENTORY_CODE><LOCATOR>...</LOCATOR><ITEM_CATE>DLINK-其他</ITEM_CATE><SN_CONTROL>1</SN_CONTROL><UNIT_PRICE></UNIT_PRICE></LINE></XML>";
        JAXBContext jaxbContext = JAXBContext.newInstance(JHSalesOrder.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        JHSalesOrder jhSalesOrder = (JHSalesOrder)unmarshaller.unmarshal(new StringReader(xml1));
        System.out.println(jhSalesOrder.getHeader().getCustomerName());
    }
}
