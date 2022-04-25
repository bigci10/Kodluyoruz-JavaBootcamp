package com.flightReservation.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.asm.Advice.This;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;


import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table
@Data

public class Flight {



	@Id
	@GeneratedValue

    private int id;
	
	
	
    
    private String airline;

   
    private String departureLocation;

 
    private String destinationLocation;

  
    private int numberOfSeats;

  
    private int numberOfBusinessSeats;



    private String flightDateAndTime ;
    
    
    
    
    
    
    
    
    
    
    

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getDepartureLocation() {
		return departureLocation;
	}

	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}

	public String getDestinationLocation() {
		return destinationLocation;
	}

	public void setDestinationLocation(String destinationLocation) {
		this.destinationLocation = destinationLocation;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getNumberOfBusinessSeats() {
		return numberOfBusinessSeats;
	}

	public void setNumberOfBusinessSeats(int numberOfBusinessSeats) {
		this.numberOfBusinessSeats = numberOfBusinessSeats;
	}

	public String getFlightDateAndTime() {
		return flightDateAndTime;
	}

	public void setFlightDateAndTime(String flightDateAndTime) {
		this.flightDateAndTime = flightDateAndTime;
	}


   
    
 
	
	
	
	   
}
