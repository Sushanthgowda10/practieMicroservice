package com.sk.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Provider-Service")
public interface IBillingController {
	
	@GetMapping("/shopping/shop")
	public String abc();
	

}
