package com.flightReservation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



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
	public Iterable<Seats> viewSeats(boolean isAvailable, boolean isBusines) {
		return null;
	}

	@Override
	public Seats modifySeats(Seats seats) {
		return null;
	}

	@Override
	public Iterable<Seats> viewAllSeats() {
		return null;
	}

	@Override
	public Seats addSeat(Seats seat) throws Exception {
		try {
			if (seatsRepository.findByIdAndSeatNumber(seat.getId(), seat.getSeatNumber()) != null) {
				seatsRepository.save(seat);
			}
			else {
				System.out.print("This Seat Already Taken");
			}
			
		}catch (Exception e){
			throw new Exception("Exception => " + e.getMessage());
		}
		return seat;		
	}

}
