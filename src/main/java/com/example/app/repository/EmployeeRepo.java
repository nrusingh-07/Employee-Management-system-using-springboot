package com.example.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.app.entity.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
