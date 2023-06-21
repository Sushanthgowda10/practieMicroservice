package com.sk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class Demo2MarriageConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo2MarriageConsumerApplication.class, args);
	}

}
