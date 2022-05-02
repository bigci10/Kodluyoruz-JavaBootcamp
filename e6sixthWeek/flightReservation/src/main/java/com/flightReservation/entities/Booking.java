package com.flightReservation.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private int flightFk;
	
	private int passengerFk;
	
	private boolean isBusiness;
	
	Booking(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFlightFk() {
		return flightFk;
	}

	public void setFlightFk(int flightFk) {
		this.flightFk = flightFk;
	}

	public int getPassengerFk() {
		return passengerFk;
	}

	public void setPassengerFk(int passengerFk) {
		this.passengerFk = passengerFk;
	}

	public boolean isBusiness() {
		return isBusiness;
	}

	public void setBusiness(boolean isBusiness) {
		this.isBusiness = isBusiness;
	}
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "bookingFk", referencedColumnName = "id")
	private Passenger passenger;

}
