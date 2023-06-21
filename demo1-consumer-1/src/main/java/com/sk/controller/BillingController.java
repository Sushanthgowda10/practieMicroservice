package com.sk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sk.client.IBillingController;

@RestController
@RequestMapping("/info")
public class BillingController {
	
	@Autowired
	private IBillingController client;
	
	@GetMapping("/complete")
	public String qwee()  {
		System.out.println("BillingController::client comp name::"+ client.getClass());
		return" diwali Bill" + client.abc();
	}

}