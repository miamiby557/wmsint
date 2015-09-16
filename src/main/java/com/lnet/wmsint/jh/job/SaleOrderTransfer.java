package com.lnet.wmsint.jh.job;

import com.lnet.wmsint.jh.gwallwms.CreateSaleOrderBean;
import com.lnet.wmsint.jh.gwallwms.CreateSaleOrderDetailBean;
import com.lnet.wmsint.jh.gwallwms.CreateSaleOrderRequest;
import com.lnet.wmsint.jh.receive.JHSalesOrder;
import com.lnet.wmsint.jh.receive.JHSalesOrderLine;
import org.dom4j.Element;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SaleOrderTransfer {

    public static CreateSaleOrderRequest transfer(JHSalesOrder order){
        CreateSaleOrderRequest request = new CreateSaleOrderRequest();
        List<CreateSaleOrderBean> saleOrderList = new ArrayList<CreateSaleOrderBean>();
        CreateSaleOrderBean mbean = new CreateSaleOrderBean();
        mbean.setOrderCode(order.getHeader().getBillCode());
        //TODO warehouseCode
        mbean.setWarehouseCode("");
        mbean.setGoodsOwner(order.getHeader().getCustomerName());
        String transactionType = order.getHeader().getTransactionType();
        if("CHD".equalsIgnoreCase(transactionType)){
            mbean.setFromType("调拔出库");
        }else if("CHH".equalsIgnoreCase(transactionType)){
            mbean.setFromType("销售出库");
        }else if("CHJ".equalsIgnoreCase(transactionType)){
            mbean.setFromType("借物出库");
        }else if("CHQ".equalsIgnoreCase(transactionType)){
            mbean.setFromType("其他出库");
        }else if("CHT".equalsIgnoreCase(transactionType)){
            mbean.setFromType("采购退货");
        }else if("CHX".equalsIgnoreCase(transactionType)){
            mbean.setFromType("代销出库");
        }
        mbean.setFromCode(order.getHeader().getBillCode());
        mbean.setIsUrgency("0");
        mbean.setDownDate(order.getHeader().getBillDate());
        mbean.setLogisticsCompanyCode("123");
        mbean.setLogisticsCompanyName(order.getHeader().getTransportMethod());
        mbean.setOrderWaveCount("1");
        mbean.setSignType("线下订单");
        mbean.setConsignee("");
        mbean.setPostCode("");
        mbean.setProvinceName("");
        mbean.setCityName("");
        mbean.setAreaName("");
        mbean.setAddress(order.getHeader().getDeliveryAddress());
        mbean.setMobile(order.getHeader().getContactPhone());
        mbean.setTel(order.getHeader().getContact());
        mbean.setSellersMessage("");
        mbean.setBuyerMessage("");
        mbean.setMerchantMessage("");
        mbean.setTotalPrice("");

        // 获取行信息
        List<CreateSaleOrderDetailBean> detailBeanList = new ArrayList<>();
        List<JHSalesOrderLine> orderLineList = order.getLines();
        for(JHSalesOrderLine line : orderLineList){
            CreateSaleOrderDetailBean dbean = new CreateSaleOrderDetailBean();
            dbean.setSku(line.getItemName());
            dbean.setQty(line.getItemNumber());
            dbean.setGwf1(line.getLineId());
            dbean.setGwf2(line.getItemId());
            dbean.setGwf3(line.getLotNumber());
            dbean.setGwf4(line.getSubInventoryCode());
            dbean.setGwf5(line.getItemCate());
            detailBeanList.add(dbean);
        }
        saleOrderList.add(mbean);
        mbean.setItems(detailBeanList);
        request.setSaleOrderList(saleOrderList);
        return request;
    }
}
