package com.example.people.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.people.model.Employee;
import com.example.people.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public List<Employee> getEmployees() {
		return employeeService.getAllEmployees();
	}

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public Optional<Employee> getEmployee(@PathVariable("id") long id) {
		return employeeService.getEmployeeById(id);
	}
}