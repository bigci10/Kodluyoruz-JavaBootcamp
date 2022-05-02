package com.flightReservation;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.flightReservation.entities.Flight;
import com.flightReservation.repos.FlightRepository;
import com.flightReservation.services.FlightService;


@ExtendWith(MockitoExtension.class)
public class FlightTest {
	
	
	@InjectMocks
	Flight flight;
	
	@Mock
	private FlightService flightService;
	
	@Mock
	private FlightRepository flightRepository;
	
	
	@Test
	public void testFlight()
	{
		Flight flight=new Flight();
		flight.setAirline("THY");
		flight.setDepartureLocation("ISTANBUL");
		flight.setDestinationLocation("GERMANY");
		flight.setFlightId(1);
		flight.setPlaneFk(1);;
		flight.setDepartureTime("21:00:00");
		flight.setDateOfDeparture("21-09-2022");
	
		assertEquals(1,flight.getId());
		assertEquals(1,flight.getPlaneFk());
		assertEquals("ISTANBUL",flight.getDepartureLocation());
		assertEquals("GERMANY",flight.getDestinationLocation());
		assertEquals("21:00:00",flight.getDepartureTime());
		assertEquals("21-09-2022",flight.getDateOfDeparture());
	}
	

}
