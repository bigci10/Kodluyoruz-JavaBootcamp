package com.flightReservation.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightReservation.entities.Booking;

import com.flightReservation.repos.BookingRepository;


@Service
public class BookingService implements IBookingService{
	
	@Autowired
	BookingRepository bookingRepository;
	

	@Override
	public Booking addBooking(Booking booking) throws Exception {
		// TODO Auto-generated method stub
		try {
			return bookingRepository.save(booking);
		}catch (Exception e){
			throw new Exception("Exception => " + e.getMessage());
		}		
	}
	

	@Override
	public Iterable<Booking> viewAllBookings() {
		// TODO Auto-generated method stub
		return bookingRepository.findAll();
	}

	@Override
	public Booking viewBookingById(int bookingId) {
		Optional<Booking> findByBookingId = bookingRepository.findById(bookingId);
		if (findByBookingId.isPresent()) {
			return findByBookingId.get();
		}
		return null;
	}

	@Override
	public Booking modifyBooking(Booking booking) {
		Optional<Booking> findById = bookingRepository.findById(booking.getId());
		if (findById.isPresent()) {
			bookingRepository.save(booking);
			return booking;
		}
		return null;
	
	}

	@Override
	public boolean removeBooking(int bookingId) {
		Optional<Booking> findById = bookingRepository.findById(bookingId);
		if (findById.isPresent()) {
			bookingRepository.deleteById(bookingId);
			return true;
		}
		return false;
	}



	

}
