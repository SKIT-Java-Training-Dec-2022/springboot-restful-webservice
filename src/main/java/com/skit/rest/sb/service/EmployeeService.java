package com.skit.rest.sb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skit.rest.sb.model.Employee;
import com.skit.rest.sb.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	//getAll Employees
	public List<Employee> getAllEmployees(){
		return (List<Employee>) employeeRepository.findAll();
	}

	public void saveEmployee(Employee employee) {		
		employeeRepository.save(employee);
	}

	public void updateEmployee(int id, Employee employee) {
		employeeRepository.save(employee);
		// TODO Auto-generated method stub
		
	}

	public Employee getEmployeeWithId(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> empOptional = employeeRepository.findById(id);
		return empOptional.get();
	}

	public void deleteEmployee(int id) {
		 employeeRepository.deleteById(id);
	}

}
