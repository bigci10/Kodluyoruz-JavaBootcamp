package com.flightReservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flightReservation.entities.Plane;
import com.flightReservation.services.IPlaneService;

@RestController
public class PlaneController {
	
	@Autowired(required = true)
	IPlaneService planeService;
	
	@PostMapping("/addPlane")
	public Plane addPlane(@RequestBody Plane plane) throws Exception {
		return planeService.addPlane(plane);
	}
	
	@GetMapping("/allPlanes")
	public Iterable<Plane> viewAllPlanes() {
		return planeService.viewAllPlanes();
	}
	
	@GetMapping("/viewPlane/{id}")
	public Plane viewPassenger(@PathVariable("id") int planeId) {
		return planeService.viewPlaneById(planeId);
		
	}
	
	@DeleteMapping("/deletePlane/{id}")
	public void removePassenger(@PathVariable("id") int planeId) {
		planeService.removePlane(planeId);
	}
	

}
