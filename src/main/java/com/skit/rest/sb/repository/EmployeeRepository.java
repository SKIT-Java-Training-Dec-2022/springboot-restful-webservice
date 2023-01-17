package com.skit.rest.sb.repository;

import org.springframework.data.repository.CrudRepository;

import com.skit.rest.sb.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
