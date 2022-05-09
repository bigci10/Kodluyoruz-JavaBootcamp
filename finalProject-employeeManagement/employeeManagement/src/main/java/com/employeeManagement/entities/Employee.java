package com.employeeManagement.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;



@Entity
@Table
@Data
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	
	private String firstName;
	
	private String lastName;
	
	private String email;

	private int departmentFK;
	
	public Employee() {
		
	}


}
