package com.flightReservation.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.flightReservation.entities.Passenger;

import com.flightReservation.repos.PassengerDao;

public class PassengerService {
	
	@Autowired
    PassengerDao passengerdao;

	public List getAllPassenger() {
        List passenger = new ArrayList();
        passengerdao.findAll().forEach(flight -> passenger.add(passenger));
        return passenger;
    }
    public Passenger getPassengerById(int id) {
        return passengerdao.findById(id).get();
    }

    public void saveOrUpdate(Passenger passenger) {
        passengerdao.save(passenger);
    }

    public void delete(int id) {
        passengerdao.deleteById(id);
    }

}
