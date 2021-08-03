package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CapitalServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapitalServiceApplication.class, args);
	}

}
