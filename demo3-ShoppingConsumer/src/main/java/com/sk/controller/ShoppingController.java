package com.sk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sk.client.Ishopping;
import com.sk.entity.Shopping;

@RestController
@RequestMapping("/get")
public class ShoppingController {
	@Autowired
	private Ishopping customer;
	
	
	@GetMapping("/price")
	public String Shoppingfetch() {
		
		System.out.println("ShoppingController::customer comp name::"+customer.getClass());
		
		return "Shopping Done"+customer.getShopping();
		
		
	}
//	@GetMapping("/findAll")
//	public ResponseEntity<?> ShoppingFindAll() {
//		
//	try {
//		 List<Shopping> disply = customer.getDisply();
//		 return new ResponseEntity<List<Shopping>>(disply,HttpStatus.OK);
//	} catch (Exception e) {
//		return new ResponseEntity<String>("prbm",HttpStatus.INTERNAL_SERVER_ERROR);
//	}
//	 
//	}
	

}
