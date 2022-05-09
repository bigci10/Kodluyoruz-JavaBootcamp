package com.employeeManagement.services;

import com.employeeManagement.entities.Employee;

public interface IEmployeeService {

	public Employee addEmployee(Employee employee) throws Exception;
	
	public Iterable<Employee> viewAllEmployees();
	
	public Employee viewEmployeeById(int employeeId);

	public Employee modifyEmployee(Employee employee);

	public boolean removeEmployee(int employeeId);

}
