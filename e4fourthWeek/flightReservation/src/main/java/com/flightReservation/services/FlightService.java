package com.flightReservation.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.flightReservation.entities.Flight;
import com.flightReservation.repos.FlightDao;


@Service
public class FlightService {
    
	
	
	@Autowired
    FlightDao flightdao;

	public List getAllFlights() {
        List flights = new ArrayList();
        flightdao.findAll().forEach(flight -> flights.add(flight));
        return flights;
    }
    public Flight getFlightById(int id) {
        return flightdao.findById(id).get();
    }

    public void saveOrUpdate(Flight flight) {
        flightdao.save(flight);
    }

    public void delete(int id) {
        flightdao.deleteById(id);
    }
	
}

