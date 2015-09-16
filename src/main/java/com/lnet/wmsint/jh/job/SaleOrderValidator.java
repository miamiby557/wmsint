package com.lnet.wmsint.jh.job;

import com.lnet.wmsint.jh.receive.JHSalesOrder;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class SaleOrderValidator {

    public static ValidateMessage validate(JHSalesOrder order) {

        ValidateMessage message = new ValidateMessage();
        if(StringUtils.isEmpty(order.getHeader().getBillCode())){
            message.setResult(true);
            message.getMessages().put("billCode","billCode is empty...");
        }
        if(order.getLines().size()==0){
            message.setResult(true);
            message.getMessages().put("line","LINE is empty...");
        }
        //TODO 验证仓库
        String wareHouseId = order.getHeader().getWareHouseId();

        return message;
    }



}
class ValidateMessage {
    private boolean result = false;
    private Map<String, String> messages = new HashMap<>();

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public Map<String, String> getMessages() {
        return messages;
    }

}
