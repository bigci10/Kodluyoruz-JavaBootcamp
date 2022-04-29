package com.flightReservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.flightReservation.entities.Seats;
import com.flightReservation.services.ISeatsService;


@RestController
public class SeatsController {
	@Autowired(required = true)
	ISeatsService seatsService;
	
	@PostMapping("/addSeat")
	public Seats addSeat(@RequestBody Seats seat) throws Exception {
		return seatsService.addSeat(seat);
	}

}
