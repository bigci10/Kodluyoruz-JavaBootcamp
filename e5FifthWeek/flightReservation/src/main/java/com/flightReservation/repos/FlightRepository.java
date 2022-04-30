package com.flightReservation.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flightReservation.entities.Flight;

@Repository
public interface FlightRepository extends CrudRepository<Flight, Integer> {

}
