package com.lnet.wmsint.jh.gwallwms;


import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "request")
public class GoodsCreateOrUpadteRequest {
    /*
     * ��Ʒ�б���
     */
    private List<SkuInfoBean> skuInfos;

    public List<SkuInfoBean> getSkuInfos() {
        return skuInfos;
    }

    public void setSkuInfos(List<SkuInfoBean> skuInfo) {
        this.skuInfos = skuInfo;
    }
}
