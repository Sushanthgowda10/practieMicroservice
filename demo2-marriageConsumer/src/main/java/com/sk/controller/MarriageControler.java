package com.sk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sk.client.IShoppingController;

@RestController
@RequestMapping("/month")
public class MarriageControler {
	
	@Autowired
	private IShoppingController marry;
	
	@GetMapping("/day")
	public String marriagefetch() {
		
		System.out.println("succesfull done"+ marry.getClass());
		return "marriage is succesfull"+marry.Marriage();
	}
	
	



}
