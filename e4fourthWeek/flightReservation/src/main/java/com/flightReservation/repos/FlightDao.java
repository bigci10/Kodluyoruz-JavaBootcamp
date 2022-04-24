package com.flightReservation.repos;


import org.springframework.data.repository.CrudRepository;

import com.flightReservation.entities.Flight;


public interface FlightDao extends CrudRepository<Flight,Integer>{

}