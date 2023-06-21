package com.sk.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="shoppingApp")
@Data
public class Shopping {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pid;

	private String name;
	
	private String price;


}
