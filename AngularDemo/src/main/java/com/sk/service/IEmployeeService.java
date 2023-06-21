package com.sk.service;

import java.util.List;
import java.util.Optional;

import com.sk.entity.Employee;

public interface IEmployeeService {

	 List<Employee> fetchAllEmployee();
	 
	 Optional<Employee> fetchEmployeeById(Integer Eid ) ;
}
