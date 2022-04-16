public class Seat {
    private Flight flight;
    private int seatNumber;
    private String status = "Available";

    public Seat(Flight flight, int seatNumber){
        this.flight = flight;
        this.seatNumber = seatNumber;

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "flight=" + flight +
                ", seatNumber=" + seatNumber +
                ", status='" + status + '\'' +
                '}';
    }

    public Flight getFlight() {
        return flight;
    }

}
