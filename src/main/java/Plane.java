public class Plane {

    private PlaneType type;
    private Airline airline;
    private int passengers;
    private int capacity;

    public Plane(PlaneType type, Airline airline, int passengers){
        this.type = type;
        this.airline = airline;
        this.passengers = passengers;
        this.capacity = type.getCapacity();
    }

    public PlaneType getType() {
        return this.type;
    }

    public Airline getAirline() {
        return this.airline;
    }

    public int getPassengers() {
        return this.passengers;
    }

    public Plane makeNewPlane() {
        Plane plane2 = new Plane(PlaneType.values()[0], Airline.values()[3], 0);
        return plane2;
    }

    public void addPassenger() {
        if (this.passengers < this.capacity)
        this.passengers += 1;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
