package com.flightReservation.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Passenger {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
    private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

    
    

}
