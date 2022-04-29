package com.flightReservation.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Plane {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;

	private String planeModel;
	
	public int getId() {
		return id;
	}
	
	public String getModel() {
		return this.planeModel;
	}

	public void setModel(String planeModel) {
		this.planeModel = planeModel;
	}
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "planeFk", referencedColumnName = "id")
	List<Flight> flights = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "planeFk", referencedColumnName = "id")
	List<Seats> seats = new ArrayList<>();
	
}
