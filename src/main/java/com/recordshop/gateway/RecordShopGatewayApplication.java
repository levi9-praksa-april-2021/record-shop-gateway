package com.recordshop.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RecordShopGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecordShopGatewayApplication.class, args);
	}

}
