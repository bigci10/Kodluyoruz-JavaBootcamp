package com.employeeManagement.entities;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


import lombok.Data;

@Entity
@Table
@Data
public class Department  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;

	private String deptName;


	public Department(){

	}

	public Department(int ID,String deptName){
		super();
		this.ID = ID;
		this.deptName = deptName;
	}


	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "departmentFK", referencedColumnName = "ID")
	List<Employee> employees = new ArrayList<>();
}
