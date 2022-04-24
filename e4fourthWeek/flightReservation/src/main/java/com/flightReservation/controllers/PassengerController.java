package com.flightReservation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.flightReservation.entities.Flight;
import com.flightReservation.entities.Passenger;
import com.flightReservation.services.FlightService;
import com.flightReservation.services.PassengerService;

public class PassengerController {
	
	@Autowired
	PassengerService passengerService;

    @GetMapping("/passenger")
    private List getAllPassenger() {
        return passengerService.getAllPassenger();
    }

    @GetMapping("/passenger/{id}")
    private Passenger getPassenger(@PathVariable("id") int id) {
        return passengerService.getPassengerById(id);
    }

    @DeleteMapping("/delPassenger/{id}")
    private void deleteFlight(@PathVariable("id") int id) {
        passengerService.delete(id);
    }

    @PostMapping("/addPassenger")
    private int saveFlight(@RequestBody Passenger passenger) {
        passengerService.saveOrUpdate(passenger);
        return passenger.getId();
    }


}
