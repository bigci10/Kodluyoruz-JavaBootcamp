package com.flightReservation.services;

import com.flightReservation.entities.Passenger;

public interface IPassengerService {
	
	public Passenger addPassenger(Passenger passenger) throws Exception;
	
	public Iterable<Passenger> viewAllPassengers();
	
	public Passenger viewPassenger(int Id);
	
	public Passenger modifyPassenger(Passenger passenger);
	
	public boolean removePassenger(int Id);

}
