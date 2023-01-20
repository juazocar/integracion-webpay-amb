package cl.duoc.integracionwebpayamb.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WebPayTransactionInitRequest {
    
    @JsonProperty("buy_order")
    private String buyOrder;
    @JsonProperty("session_id")
    private String sessionId;
    @JsonProperty("amount")
    private int    amount;
    @JsonProperty("return_url")
    private String returnUrl;

    public WebPayTransactionInitRequest() {
    }
    public String getBuyOrder() {
        return buyOrder;
    }
    public void setBuyOrder(String buyOrder) {
        this.buyOrder = buyOrder;
    }
    public String getSessionId() {
        return sessionId;
    }
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public String getReturnUrl() {
        return returnUrl;
    }
    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    
}
