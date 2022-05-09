package com.employeeManagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.employeeManagement.entities.Employee;



public interface EmployeeRepository extends CrudRepository<Employee, Integer> {



}
