package com.flightReservation.services;




import com.flightReservation.entities.Flight;
import com.flightReservation.entities.Plane;



public interface IPlaneService {
	
	
	public Plane addPlane(Plane plane) throws Exception;
	
	public Iterable<Plane> viewAllPlanes();
	
	public Plane viewPlaneById(int Id);
		
	public boolean removePlane(int planeId);
	
	public Plane modifyPlane(Plane plane);

	
	
	

}
