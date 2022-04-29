package com.flightReservation.repos;

import org.springframework.data.repository.CrudRepository;

import com.flightReservation.entities.Booking;


public interface BookingRepository extends CrudRepository<Booking, Integer> {

}
