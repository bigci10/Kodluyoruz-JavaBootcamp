package com.flightReservation.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flightReservation.entities.Passenger;

@Repository
public interface PassengerRepository extends CrudRepository<Passenger, Integer> {

}
