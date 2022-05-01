package com.flightReservation.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exceptions.ExceptionHandlingFlightReservation;
import com.flightReservation.entities.Flight;
import com.flightReservation.entities.Plane;
import com.flightReservation.repos.FlightRepository;
import com.flightReservation.repos.PlaneRepository;

@Service
public class FlightService implements IFlightService {

	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	PlaneRepository planeRepository;
	

	
	
	@Override
	public Flight addFlight(Flight flight) throws ExceptionHandlingFlightReservation {
		try {
			
			return flightRepository.save(flight);
		

			
		}catch (Exception e){
			throw new ExceptionHandlingFlightReservation("Plane is not found");
		}		
	}

	@Override
	public Iterable<Flight> viewAllFlight() {
		return flightRepository.findAll();
	}

	@Override
	public Flight viewFlightById(int flightId) {
		Optional<Flight> findByFlightId = flightRepository.findById(flightId);
		if (findByFlightId.isPresent()) {
			return findByFlightId.get();
		}
		return null;
	}

	@Override
	public Flight modifyFlight(Flight flight) {
		Optional<Flight> findById = flightRepository.findById(flight.getId());
		if (findById.isPresent()) {
			flightRepository.save(flight);
			return flight;
		}
		return null;
	}

	@Override
	public boolean removeFlight(int flightId) {
		Optional<Flight> findById = flightRepository.findById(flightId);
		if (findById.isPresent()) {
			flightRepository.deleteById(flightId);
			return true;
		}
		return false;
	}

}
