import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Airline {
    public String name;
    private  Map<String,Plane> planes;
    private Map<String,Flight> flights;

    public Airline(String name){
        this.name = name;
        this.planes = new HashMap<String,Plane>();
        this.flights = new HashMap<String,Flight>();

    }
    public Map<String,Flight> getFlights() {
        return this.flights;
    }
    public Flight getFlight(String code) {
        return flights.get(code);
    }

    public Plane getPlane(String name) {
        return planes.get(name);
    }

    public String addFlight(Plane plane,String dateAndTime){
        Flight tempFlight = new Flight(plane,dateAndTime);
        flights.put(tempFlight.code,tempFlight);
        main.flights.put(tempFlight.code,tempFlight);
        return tempFlight.code;

    }

    public void addPlane(Plane plane){
        this.planes.put(plane.model, plane);
        main.planes.put(plane.model, plane);
    }
}
