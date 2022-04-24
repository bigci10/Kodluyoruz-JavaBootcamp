package com.flightReservation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightReservation.entities.Flight;
import com.flightReservation.services.FlightService;



@RestController

public class FlightController {
	
    @Autowired
    FlightService flightService;

    @GetMapping("/flights")
    private List getAllFlights() {
        return flightService.getAllFlights();
    }

    @GetMapping("/flight/{id}")
    private Flight getFlight(@PathVariable("id") int id) {
        return flightService.getFlightById(id);
    }

    @DeleteMapping("/delFlights/{id}")
    private void deleteFlight(@PathVariable("id") int id) {
        flightService.delete(id);
    }

    @PostMapping("/addFlight")
    private int saveFlight(@RequestBody Flight flight) {
        flightService.saveOrUpdate(flight);
        return flight.getId();
    }

	
	
}
