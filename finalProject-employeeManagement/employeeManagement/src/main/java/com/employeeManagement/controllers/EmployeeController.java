package com.employeeManagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employeeManagement.entities.Employee;
import com.employeeManagement.services.IEmployeeService;

@RestController
public class EmployeeController {

	@Autowired(required = true)
	IEmployeeService employeeService;
	
	
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) throws Exception {
		return employeeService.addEmployee(employee);
		
	}
	
	@GetMapping("/allEmployees")
	public Iterable<Employee> viewAllEmployees() {
		return employeeService.viewAllEmployees();
	}
	
	@GetMapping("/viewEmployee/{id}")
	public Employee viewEmployee(@PathVariable("id") int employeeId) {
		return employeeService.viewEmployeeById(employeeId);
	}
	
	@PutMapping("/updateEmployee")
	public void modifyEmployee(@RequestBody Employee employee) {
		employeeService.modifyEmployee(employee);
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public void removeEmployee(@PathVariable("id") int employeeId) {
		employeeService.removeEmployee(employeeId);
	}
}
