package com.lnet.wmsint.jh.receive;

import com.lnet.wmsint.jh.gwallwms.CreateSaleOrderRequest;
import com.lnet.wmsint.jh.gwallwms.SaleOrderManager;
import com.lnet.wmsint.jh.salesOrder.*;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Administrator
 *
 */
@XmlRootElement(name = "XML")
public class JHSalesOrder {

	private static final long serialVersionUID = 1L;

	private JHSalesOrderHeader header;

    private List<JHSalesOrderLine> lines = new ArrayList<>();

    @XmlElement(name = "HEADER")
    public JHSalesOrderHeader getHeader() {
        return header;
    }

    public void setHeader(JHSalesOrderHeader header) {
        this.header = header;
    }


    @XmlElement(name = "LINE")
    public List<JHSalesOrderLine> getLines() {
        return lines;
    }

    public void setLines(List<JHSalesOrderLine> lines) {
        this.lines = lines;
    }
}
