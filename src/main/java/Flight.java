public class Flight {

    private Plane plane;
    private int flightnumber;
    private AirportCodeType destination;

    public Flight(Plane plane, int flightnumber, AirportCodeType destination){
        this.plane = plane;
        this.flightnumber = flightnumber;
        this.destination = destination;
    }

    public PlaneType getPlane(){
        return this.plane.getType();
    }

    public int getFlightNumber(){
        return this.flightnumber;
    }

    public String getDestination(){
        return this.destination.getValue();
    }

    public int getNumberOFPassengers() {
        return this.plane.getPassengers();
    }

    public void addPassengers(int i) {
        this.plane.addPassengers(i);
    }

    public int checkTicketsSold() {
        return this.plane.getPassengers();
    }
}
