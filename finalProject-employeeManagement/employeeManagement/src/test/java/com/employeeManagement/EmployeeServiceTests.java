 package com.employeeManagement;






import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.employeeManagement.entities.Department;
import com.employeeManagement.repos.DepartmentRepository;
import com.employeeManagement.repos.EmployeeRepository;
import com.employeeManagement.services.DepartmentService;


@ExtendWith(MockitoExtension.class)
class EmployeeServiceTests {
	
	
	@InjectMocks
    Department department;

	@Mock
	private DepartmentService departmentService;
	
	@Mock
	private DepartmentRepository departmentRepository;
	
	@Test
	void departmentEquals() throws Exception {
		 Department department = new Department(1,"Engineers");

		 Department department1 = new Department(2,"Engineers");
		 
		 assertTrue(department.equals(department1));
		 
	 }
	
	
			
		

	

}
