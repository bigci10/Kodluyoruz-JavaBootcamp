package com.employeeManagement.services;

import com.employeeManagement.entities.Department;

public interface IDepartmentService {
	
	
	public Department addDepartment(Department department) throws Exception;
	
	public Iterable<Department> viewAllDepartments();
	
	public Department viewDepartmentById(int departmentId);
	
	public Department modifyDepartment(Department department);
	
	public boolean removeDepartment(int departmentId);

}
