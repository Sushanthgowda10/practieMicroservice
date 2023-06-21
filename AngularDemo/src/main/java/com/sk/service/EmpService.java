package com.sk.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sk.entity.Employee;
import com.sk.repo.EmployeeRepository;


@Service
public class EmpService implements IEmployeeService{
	@Autowired
	private EmployeeRepository employeeRepo;	
	

	@Override
//	public List<Employee> getAllEmployee() {
//		// TODO Auto-generated method stub
//		return employee.findAll();
//		
//		
	//}
	public List<Employee> fetchAllEmployee() {
		List<Employee> list = employeeRepo.findAll();
		return list;
}


	@Override
	public Optional<Employee> fetchEmployeeById(Integer Eid) {
		Optional<Employee> list = employeeRepo.findById(Eid);
		return list;
	}
}