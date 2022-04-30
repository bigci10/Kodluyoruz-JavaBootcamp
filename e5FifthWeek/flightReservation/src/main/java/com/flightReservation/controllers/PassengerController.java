package com.flightReservation.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.flightReservation.entities.Passenger;
import com.flightReservation.services.IPassengerService;

@RestController
public class PassengerController {
	@Autowired(required = true)
	IPassengerService passengerService;

	
	@PostMapping("/addPassenger")
	public Passenger addPassenger(@RequestBody Passenger passenger) throws Exception {
		return passengerService.addPassenger(passenger);
	}
	
	@GetMapping("/allPassengers")
	public Iterable<Passenger> viewAllPassengers() {
		return passengerService.viewAllPassengers();
	}
	
	@GetMapping("/viewPassenger/{id}")
	public Passenger viewPassenger(@PathVariable("id") int passengerId) {
		return passengerService.viewPassenger(passengerId);
		
	}
	
	@PutMapping("/updatePassenger")
	public void modifyPassenger(@RequestBody Passenger passenger) {
		passengerService.modifyPassenger(passenger);
		
	}
	
	@DeleteMapping("/deletePassenger/{id}")
	public void removePassenger(@PathVariable("id") int passengerId) {
		passengerService.removePassenger(passengerId);
	}
	
}
