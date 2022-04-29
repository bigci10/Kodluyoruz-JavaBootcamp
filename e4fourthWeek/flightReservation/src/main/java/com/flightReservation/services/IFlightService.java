package com.flightReservation.services;

import com.flightReservation.entities.Flight;

public interface IFlightService {
	
	public Flight addFlight(Flight flight) throws Exception;

	public Iterable<Flight> viewAllFlight();

	public Flight viewFlightById(int flightId);

	public Flight modifyFlight(Flight flight);

	public boolean removeFlight(int flightId);
	
	
}
