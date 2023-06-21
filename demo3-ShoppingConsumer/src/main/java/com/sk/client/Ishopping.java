package com.sk.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.sk.entity.Shopping;

@FeignClient("Provider-Service")
public interface Ishopping {
	@GetMapping("/shop/buy")
	public String getShopping();
	
	@GetMapping("/shop/findAll")
	public List<Shopping> getDisply();

	//public String getDisply();
	

}
