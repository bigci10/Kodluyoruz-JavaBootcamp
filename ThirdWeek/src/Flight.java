import java.util.Arrays;

public class Flight {
    String departure;
    String destination;
    String code;
    Plane plane;
    String dateAndTime;
    Seat[] seats ;
    static int lastCode = 1000;

    public Flight(Plane plane,String dateAndTime){

        this.code = "FLT-" + lastCode;
        lastCode++;
        this.dateAndTime = dateAndTime;
        this.plane = plane;
        this.seats = new Seat[plane.seat];
        for (int i=0;i<plane.seat;i++){
            this.seats[i]= new Seat(this,i);
        }

    }

    public String toString(){
        return "Flight: "+plane + " " + "Time:"+dateAndTime ;
    }

    public Seat getSeat(int number) {
        return seats[number];
    }
}
