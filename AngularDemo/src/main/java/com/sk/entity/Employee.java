package com.sk.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name="EMPLOYEE")
@Data


public class Employee {
	
	@Column(name="Emp_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer aid;
	@Column(name = "Emp_NAME")
    private String aname;
	@Column(name=" CATEGORY" )
    private String category;
	@Column(name="MOBILENO")
    private Long mobileNo;

}
