package com.sk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sk.entity.Shopping;
import com.sk.repo.ShoppingRepo;
import com.sk.service.ShoppingService;

@RestController
@RequestMapping("/shop")
public class ShoppingController {
	
	@GetMapping("/buy")
	public String getShopping() {
	return "success";
	}
	@Autowired
	private ShoppingService ser;
	@Autowired
	private ShoppingRepo repo;
  
	@GetMapping("/findAll")
    public ResponseEntity<?>getDisply() {
		try {
			List<Shopping> disply = ser.disply();
			System.out.println(disply);
			return new ResponseEntity<List<Shopping>>(disply,HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<String>("No responce found",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
