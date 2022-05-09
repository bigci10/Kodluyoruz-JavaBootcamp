package com.employeeManagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.employeeManagement.entities.Department;



public interface DepartmentRepository extends CrudRepository<Department, Integer> {



}
