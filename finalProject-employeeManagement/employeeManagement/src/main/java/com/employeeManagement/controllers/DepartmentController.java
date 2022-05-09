package com.employeeManagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employeeManagement.entities.Department;
import com.employeeManagement.services.IDepartmentService;

@RestController

public class DepartmentController {
	
	@Autowired
	IDepartmentService departmentService;
	
	@PostMapping("/addDepartment")
	public Department addDepartment(@RequestBody Department department) throws Exception{
		return departmentService.addDepartment(department);
	}
	@GetMapping("/allDepartments")
	public Iterable<Department> viewAllDepartments() {
		return departmentService.viewAllDepartments();
	}
	@GetMapping("/viewDepartment/{id}")
	public Department viewDepartment(@PathVariable("id") int departmentId) {
		return departmentService.viewDepartmentById(departmentId);
	}
	
	@PutMapping("/updateDepartment")
	public void modifyDepartment(@RequestBody Department department) {
		departmentService.modifyDepartment(department);
	}
	
	@DeleteMapping("/deleteDepartment/{id}")
	public void removeDepartment(@PathVariable("id") int departmentId) {
		departmentService.removeDepartment(departmentId);
	}
}
