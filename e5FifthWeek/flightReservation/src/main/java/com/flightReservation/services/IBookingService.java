package com.flightReservation.services;

import com.flightReservation.entities.Booking;


public interface IBookingService {
	
	
	public Booking addBooking(Booking booking) throws Exception;

	public Iterable<Booking> viewAllBookings();

	public Booking viewBookingById(int bookingId);

	public Booking modifyBooking(Booking booking);

	public boolean removeBooking(int bookingId);

}
