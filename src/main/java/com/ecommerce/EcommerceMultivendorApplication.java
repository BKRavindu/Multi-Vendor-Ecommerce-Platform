package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@EntityScan(basePackages = "com.ecommerce.modal")
public class EcommerceMultivendorApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceMultivendorApplication.class, args);
	}

}
