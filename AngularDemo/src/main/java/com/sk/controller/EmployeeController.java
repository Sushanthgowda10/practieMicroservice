package com.sk.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sk.entity.Employee;
import com.sk.service.IEmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private IEmployeeService EmpService;

	@GetMapping("/findAll")
	public ResponseEntity<?> displayEmployee() {
		try {
			List<Employee> list = EmpService.fetchAllEmployee();
			return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Problem in fetching....", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/findAll/{id}")
	public ResponseEntity<?> displayEmployeeId(@PathVariable Integer id) {
		try {
			Optional<Employee> fetchEmployeeById = EmpService.fetchEmployeeById(id);
			return new ResponseEntity <Optional<Employee>>(fetchEmployeeById, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Problem in fetching....", HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
}
