package com.flightReservation.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightReservation.entities.Booking;
import com.flightReservation.entities.Seats;
import com.flightReservation.repos.SeatsRepository;

@Service
public class SeatsService implements ISeatsService {
	
	@Autowired
	SeatsRepository seatsRepository;

	@Override
	public Iterable<Seats> getSeatsByPassengerId(int passengerId) {
		return seatsRepository.findAll();
	}

	@Override
	public Seats modifySeats(Seats seats) {
		Optional<Seats> findById = seatsRepository.findById(seats.getId());
		if (findById.isPresent()) {
			seatsRepository.save(seats);
			return seats;
		}
		return null;
	}

	@Override
	public Iterable<Seats> viewAllSeats() {
		return seatsRepository.findAll();
	}

	@Override
	public Seats addSeat(Seats seat) throws Exception {
		try {
			
			seatsRepository.save(seat);
			
		}catch (Exception e){
			throw new Exception("Exception => " + e.getMessage());
		}
		return seat;		
	}

}
