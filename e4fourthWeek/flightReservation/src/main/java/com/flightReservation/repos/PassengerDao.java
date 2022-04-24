package com.flightReservation.repos;


import org.springframework.data.repository.CrudRepository;

import com.flightReservation.entities.Flight;
import com.flightReservation.entities.Passenger;

public interface PassengerDao extends CrudRepository<Passenger,Integer>{


}
