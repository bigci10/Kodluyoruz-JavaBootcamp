import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private String name;
    private String id;
    private int age;
    private List<Seat> seats = new ArrayList<>();

    public Passenger(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getId() {
        return id;
    }
    public void addSeats(Seat seat){
        seats.add(seat);
    }
    public void refundSeats(Seat seat){
        seats.remove(seat);
    }


    public List<Seat> getSeats() {
        return seats;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", seats=" + seats +
                '}';
    }
}
