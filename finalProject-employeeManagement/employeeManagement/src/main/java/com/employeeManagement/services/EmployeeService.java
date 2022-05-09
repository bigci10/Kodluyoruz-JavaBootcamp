package com.employeeManagement.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeManagement.entities.Employee;
import com.employeeManagement.repos.EmployeeRepository;


@Service
public class EmployeeService implements IEmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee addEmployee(Employee employee) throws Exception {
		try {
			return employeeRepository.save(employee);
		}catch (Exception e){
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public Iterable<Employee> viewAllEmployees() {
		
		return 	employeeRepository.findAll();
	}

	@Override
	public Employee viewEmployeeById(int employeeId) {
		Optional<Employee> findByEmployeeId = employeeRepository.findById(employeeId);
		if (findByEmployeeId.isPresent()) {
			return findByEmployeeId.get();
		}
		return null;
	}

	@Override
	public Employee modifyEmployee(Employee employee) {
		Optional<Employee> findByEmployeeId = employeeRepository.findById(employee.getID());
		if (findByEmployeeId.isPresent()) {
			employeeRepository.save(employee);
			return employee;
		}
		return null;
	}

	@Override
	public boolean removeEmployee(int employeeId) {
		Optional<Employee> findByEmployeeId = employeeRepository.findById(employeeId);
		if (findByEmployeeId.isPresent()) {
			employeeRepository.deleteById(employeeId);
			return true;
		}
		return false;
	}
	

	

}
