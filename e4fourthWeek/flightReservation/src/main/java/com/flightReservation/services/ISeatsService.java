package com.flightReservation.services;

import com.flightReservation.entities.Seats;


public interface ISeatsService {
	public Iterable<Seats> getSeatsByPassengerId(int passengerId);
	
	public Iterable<Seats> viewAllSeats();
	
	public Iterable<Seats> viewSeats(boolean isAvailable, boolean isBusiness);
	
	public Seats modifySeats(Seats seats);

	public Seats addSeat(Seats seat) throws Exception;

}
