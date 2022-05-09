package com.employeeManagement.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeManagement.entities.Department;
import com.employeeManagement.entities.Employee;
import com.employeeManagement.repos.DepartmentRepository;

@Service
public class DepartmentService implements IDepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepository;

	@Override
	public Department addDepartment(Department department) throws Exception {
		
		try {
			return departmentRepository.save(department);
		}catch (Exception e){
			throw new Exception(e.getMessage());
		}
	}


	@Override
	public Iterable<Department> viewAllDepartments() {
		return departmentRepository.findAll();
	}

	@Override
	public Department viewDepartmentById(int departmentId) {
		Optional<Department> findByDepartmentById = departmentRepository.findById(departmentId);
		if (findByDepartmentById.isPresent()) {
			return findByDepartmentById.get();
		}
		return null;
	}

	@Override
	public Department modifyDepartment(Department department) {
		Optional<Department> findByDepartmentId = departmentRepository.findById(department.getID());
		if (findByDepartmentId.isPresent()) {
			departmentRepository.save(department);
			return department;
		}
		return null;
	}

	@Override
	public boolean removeDepartment(int departmentId) {
		Optional<Department> findByDepartmentId = departmentRepository.findById(departmentId);
		if (findByDepartmentId.isPresent()) {
			departmentRepository.deleteById(departmentId);
			return true;
		}
		return false;
	}

}
