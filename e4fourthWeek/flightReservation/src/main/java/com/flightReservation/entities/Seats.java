package com.flightReservation.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table
@Data
public class Seats {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String seatNumber;
    
    	private int planeFk;
    
    	private int passengerFk;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public int getPlaneFk() {
		return planeFk;
	}

	public void setPlaneFk(int planeFk) {
		this.planeFk = planeFk;
	}

	public int getPassengerFk() {
		return passengerFk;
	}

	public void setPassengerFk(int passengerFk) {
		this.passengerFk = passengerFk;
	}

}




