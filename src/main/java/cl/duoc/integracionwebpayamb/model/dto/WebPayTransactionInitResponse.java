package cl.duoc.integracionwebpayamb.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WebPayTransactionInitResponse {
    
    @JsonProperty("token")
    private String token;
    @JsonProperty("url")
    private String url;
    
    public WebPayTransactionInitResponse() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    
    
}
