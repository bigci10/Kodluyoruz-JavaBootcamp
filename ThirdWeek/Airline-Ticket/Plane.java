public class Plane {
    public String model;
    public int seat;

    public Plane(String model,int seat){
        this.model = model;
        this.seat = seat;
    }

    public String toString(){
        return "Model: "+model + " " + "with: "+seat+" seats";
    }
}
