package com.flightReservation.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightReservation.entities.Passenger;
import com.flightReservation.repos.PassengerRepository;

@Service
public class PassengerService implements IPassengerService {
	
	@Autowired
	PassengerRepository passengerRepository;
	
	
	@Override
	public Passenger addPassenger(Passenger passenger) throws Exception {
		try {
			return passengerRepository.save(passenger);
		}catch (Exception e){
			throw new Exception("Exception => " + e.getMessage());
		}		
	}

	@Override
	public Iterable<Passenger> viewAllPassengers() {
		// TODO Auto-generated method stub
		return passengerRepository.findAll();
	}

	@Override
	public Passenger viewPassenger(int passengerId) {
		Optional<Passenger> findByPassengerId = passengerRepository.findById(passengerId);
		if (findByPassengerId.isPresent()) {
			return findByPassengerId.get();
		}
		return null;
	}

	@Override
	public Passenger modifyPassenger(Passenger passenger) {
		Optional<Passenger> findById = passengerRepository.findById(passenger.getId());
		if (findById.isPresent()) {
			passengerRepository.save(passenger);
			return passenger;
		}
		return null;
	}

	@Override
	public boolean removePassenger(int passengerId) {
		Optional<Passenger> findById = passengerRepository.findById(passengerId);
		if (findById.isPresent()) {
			passengerRepository.deleteById(passengerId);
			return true;
		}
		return false;
	}

}
