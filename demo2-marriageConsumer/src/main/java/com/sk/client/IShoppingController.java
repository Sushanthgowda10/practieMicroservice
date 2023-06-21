package com.sk.client;

import javax.ws.rs.GET;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Provider-Service")
public interface IShoppingController {
	 
	@GetMapping("/date/year")
	public String Marriage();

}
