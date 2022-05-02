package com.flightReservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightReservation.entities.Flight;

import com.flightReservation.services.IFlightService;

@RestController
@RequestMapping("/flight")
public class FlightController {
	@Autowired(required = true)
	IFlightService flightService;

	@PostMapping("/addFlight")
	public Flight addFlight(@RequestBody Flight flight) throws Exception {
		return flightService.addFlight(flight);
	}

	@GetMapping("/allFlights")
	public Iterable<Flight> viewAllFlight() {
		return flightService.viewAllFlight();
	}

	@GetMapping("/viewFlight/{id}")
	public Flight viewFlight(@PathVariable("id") int flightId) {
		return flightService.viewFlightById(flightId);
	}

	@PutMapping("/updateFlight")
	public void modifyFlight(@RequestBody Flight flight) {
		flightService.modifyFlight(flight);
	}

	@DeleteMapping("/deleteFlight/{id}")
	public void removeFlight(@PathVariable("id") int flightId) {
		flightService.removeFlight(flightId);
	}
}