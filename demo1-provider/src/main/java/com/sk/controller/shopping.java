package com.sk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shopping")
public class shopping {
	
	@GetMapping("/shop")
	public String abc(){
		return " Sushanth";
	}
	

}
