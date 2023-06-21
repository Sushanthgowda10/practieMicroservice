package com.sk.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sk.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
