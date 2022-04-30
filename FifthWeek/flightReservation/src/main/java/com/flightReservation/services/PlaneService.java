package com.flightReservation.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightReservation.entities.Flight;
import com.flightReservation.entities.Plane;
import com.flightReservation.repos.PlaneRepository;

@Service
public class PlaneService implements IPlaneService {

	@Autowired
	PlaneRepository planeRepository;
	
	
	
	@Override
	public Plane addPlane(Plane plane) throws Exception {
		// TODO Auto-generated method stub
		try {
			return planeRepository.save(plane);
		}catch (Exception e){
			throw new Exception("Exception => " + e.getMessage());
		}		
	}

	@Override
	public Iterable<Plane> viewAllPlanes() {
		// TODO Auto-generated method stub
		return planeRepository.findAll();
	}

	@Override
	public Plane viewPlaneById(int Id) {
		// TODO Auto-generated method stub
		Optional<Plane> findByPlaneId = planeRepository.findById(Id);
		if (findByPlaneId.isPresent()) {
			return findByPlaneId.get();
		}
		return null;
	}

	@Override
	public boolean removePlane(int id) {
		Optional<Plane> findById = planeRepository.findById(id);
		if (findById.isPresent()) {
			planeRepository.deleteById(id);
			return true;
		}
		return false;
	}
	
	@Override
	public Plane modifyPlane(Plane plane) {
		Optional<Plane> findById = planeRepository.findById(plane.getId());
		if (findById.isPresent()) {
			planeRepository.save(plane);
			return plane;
		}
		return null;
	}

}
