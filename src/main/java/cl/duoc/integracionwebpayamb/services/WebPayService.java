package cl.duoc.integracionwebpayamb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import cl.duoc.integracionwebpayamb.clients.WebPayFeignClient;
import cl.duoc.integracionwebpayamb.model.dto.WebPayTransactionInitRequest;
import cl.duoc.integracionwebpayamb.model.dto.WebPayTransactionInitResponse;

@Service
public class WebPayService {
    
    @Autowired
    WebPayFeignClient webPayFeignClient;

    @Value("${webpay.headers.api-key-id}")
    private String webPayApiKeyId;

    @Value("${webpay-headers.api-key-secret}")
    private String webPayApiKeySecret;

    public WebPayTransactionInitResponse initTransaction(WebPayTransactionInitRequest request){
        return webPayFeignClient.initTransaction(webPayApiKeyId, webPayApiKeySecret, request);
        
    }
}
