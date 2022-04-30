package com.flightReservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flightReservation.entities.Booking;

import com.flightReservation.services.IBookingService;


@RestController
public class BookingController {
	
	@Autowired(required = true)
	IBookingService bookingService;

	@PostMapping("/addBooking")
	public Booking addBooking(@RequestBody Booking booking) throws Exception {
		return bookingService.addBooking(booking);
	}
	
	@GetMapping("/allBookings")
	public Iterable<Booking> viewAllBookings() {
		return bookingService.viewAllBookings();
	}
	
	@GetMapping("/viewBooking/{id}")
	public Booking viewBooking(@PathVariable("id") int bookingId) {
		return bookingService.viewBookingById(bookingId);
	}
	
	@PutMapping("/updateBooking")
	public void modifyBooking(@RequestBody Booking booking) {
		bookingService.modifyBooking(booking);
	}
	
	@DeleteMapping("/deleteBooking/{id}")
	public void removeBooking(@PathVariable("id") int bookingId) {
		bookingService.removeBooking(bookingId);
	}
}
