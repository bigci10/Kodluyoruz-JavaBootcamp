package com.flightReservation.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flightReservation.entities.Plane;


@Repository
public interface PlaneRepository extends CrudRepository<Plane, Integer>{

}
