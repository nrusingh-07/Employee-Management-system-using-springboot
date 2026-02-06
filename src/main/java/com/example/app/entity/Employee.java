package com.example.app.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "employeemanagement")
public class Employee {
@Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;
@Column
String name;
@Column
int salary;
@Column
String gender;

public Employee() {

}

public Employee(int id, String name, int salary, String gender) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.gender = gender;
}

public Employee(String name, int salary, String gender) {
	super();
	this.name = name;
	this.salary = salary;
	this.gender = gender;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", gender=" + gender + "]";
}

@Override
public int hashCode() {
	return Objects.hash(gender, id, name, salary);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return Objects.equals(gender, other.gender) && id == other.id && Objects.equals(name, other.name)
			&& salary == other.salary;
}


}
