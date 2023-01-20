package cl.duoc.integracionwebpayamb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class IntegracionWebpayAmbApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegracionWebpayAmbApplication.class, args);
	}

	
}
