package com.example.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.entity.Employee;
import com.example.app.service.EmployeeService;

@RestController
@RequestMapping("/empapi")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployee(id);
    }

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee ref) {
        return employeeService.addEmployee(ref);
    }

    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee ref) {
        Employee existing = employeeService.getEmployee(ref.getId());
        if (existing != null) {
            existing.setName(ref.getName());
            existing.setSalary(ref.getSalary());
            existing.setGender(ref.getGender());
            return employeeService.addEmployee(existing);
        }
        return null;
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable int id) {
        Employee ref = employeeService.getEmployee(id);
        if (ref != null) {
            employeeService.deleteEmployee(Employee ref)
            return "Employee deleted successfully";
        }
        return "Employee with id: " + id + " does not exist";
    }
}

