package com.sk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sk.entity.Shopping;
import com.sk.repo.ShoppingRepo;

@Service
public class ShoppingService {
	
	@Autowired
	private ShoppingRepo repo;
	
	public List<Shopping> disply() {
		List<Shopping> findAll = repo.findAll();
		
		return findAll;
	}

}
