package com.sk.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Shopping_table")
@Data
public class Shopping {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pid;

	private String name;

	private String gender;

	private String shopName;

	private double amount;

	private Date date;

}
