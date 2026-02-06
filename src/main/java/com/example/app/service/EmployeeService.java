package com.example.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.app.entity.Employee;
import com.example.app.repository.EmployeeRepo;

@Service
public class EmployeeService {
EmployeeRepo employeeRepo;

public EmployeeService(EmployeeRepo employeeRepo) {
	super();
	this.employeeRepo = employeeRepo;
}


public List<Employee> getAllEmployee(){
	return employeeRepo.findAll();
}

public Employee getEmployee(int id) {
	return employeeRepo.findById(id).orElse(null);
}

public Employee addEmployee(Employee ref) {
	return employeeRepo.save(ref);
}


public void deleteEmployee(Employee ref) {
	employeeRepo.delete(ref);
	
}
 
}
