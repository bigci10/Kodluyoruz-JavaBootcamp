import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class main {
    public static Map<String,Airline> airlines = new HashMap<String,Airline>();
    public static Map<String,Flight> flights = new HashMap<String,Flight>();
    public static Map<String,Plane> planes = new HashMap<String,Plane>();
    public static Map<String,Passenger> passengers = new HashMap<String,Passenger>();


    public static void main(String[] args) {
        addAirline("Ryanair");
        addAirline("Pegasus");

        addPlane("Boeing 495",200);
        addPassenger("Fatihcan Yıldız","10" , 5);
        addPassenger("Utku Kantekin","11" , 5);
        addPassenger("Güner Fıçıcı","12" , 5);
        addPassenger("Bilel İğci","13" , 5);

        String code = addFlight("Ryanair","Boeing 495", "1 Oct 2001");
        String code2 = addFlight("Pegasus","Boeing 495", "2 Oct 2020");
        System.out.println(code);
        System.out.println(code2);


        buyTicket(code,"10",15);
        buyTicket(code,"10",17);
        buyTicket(code,"10",18);
        buyTicket(code2,"13",15);
        buyTicket(code,"11",16);
        buyTicket(code2,"12",16);

        System.out.println(getAirline("Pegasus").getFlight(code2).getSeat(15).getStatus());
        System.out.println(getAirline("Pegasus").getFlight(code2).getSeat(16).getStatus());
        System.out.println(getAirline("Ryanair").getFlight(code).getSeat(15).getStatus());
        System.out.println(getAirline("Ryanair").getFlight(code).getSeat(16).getStatus());

        System.out.println(getPassenger("10").getSeats());

        refund("10",code,17);
        refund("10",code,18);

        System.out.println(getPassenger("10").getSeats());


    }

    public static void addPlane(String model,int seat){
        planes.put(model,new Plane(model,seat));
    }
    private static Plane getPlane(String model) {
        return planes.get(model);
    }

    public static Airline getAirline(String name){
        return airlines.get(name);
    }
    public static void addAirline(String name){
        airlines.put(name,new Airline(name));
    }

    public static String addFlight(String airlane,String plane,String date){
        return getAirline(airlane).addFlight(getPlane(plane),date);
    }

    public static Flight getFlight(String code){
        return flights.get(code);
    }

    public static void addPassenger(String name, String id, int age){
        Passenger tempPassenger = new Passenger(name,id,age);
        passengers.put(tempPassenger.getId(),tempPassenger);
    }
    public static Passenger getPassenger(String id){
        return passengers.get(id);
    }
    //Ticket Operations
    public static void buyTicket(String flight,String id,int seatNumber){
        Flight fl = getFlight(flight);
        Seat st = fl.getSeat(seatNumber);
        if (st.getStatus()=="Available"){
            st.setStatus("Taken");
            getPassenger(id).addSeats(st);
        }
        else System.out.println("Seat is taken!");

    }

    public static Seat getSeat(String flightCode,int seatNumber) {
        return getFlight(flightCode).seats[seatNumber];
    }

    public static void refund(String id,String flightCode,int seatNumber) {
        getSeat(flightCode,seatNumber).setStatus("Available");
        getPassenger(id).refundSeats(getSeat(flightCode,seatNumber));
        System.out.println("Refunded");
    }

}
