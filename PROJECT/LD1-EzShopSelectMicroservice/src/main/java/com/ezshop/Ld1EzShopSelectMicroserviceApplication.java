package com.ezshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class Ld1EzShopSelectMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ld1EzShopSelectMicroserviceApplication.class, args);
	}

}
