package com.example.people.service;

import java.util.List;
import java.util.Optional;

import com.example.people.model.Employee;

public interface EmployeeService {
	Optional<Employee> getEmployeeById(long id);
	List<Employee> getAllEmployees();
}
