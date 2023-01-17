package com.skit.rest.sb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skit.rest.sb.model.Employee;
import com.skit.rest.sb.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	//get all employee
	@GetMapping("employees")
	public List<Employee> getEmployees() {
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("employees/{id}")
	public Employee getEmployees( @PathVariable int id) {
		return employeeService.getEmployeeWithId(id);
	}
	
	@PostMapping("saveEmployee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
		return employee;
	}
	
	@PutMapping("updateEmployee/{id}")
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable int id) {
		employeeService.updateEmployee(id, employee);
		return employee;
	}
	
	
	@DeleteMapping("employees/{id}")
	public int deleteEmployee( @PathVariable int id) {
		employeeService.deleteEmployee(id);
		return id;
	}

}
