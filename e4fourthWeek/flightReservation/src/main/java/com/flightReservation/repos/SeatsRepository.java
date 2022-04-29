package com.flightReservation.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flightReservation.entities.Seats;


@Repository
public interface SeatsRepository extends CrudRepository<Seats, Integer> {

	Iterable<Seats> findByIdAndSeatNumber(int id, String seatNumber);
	
}
