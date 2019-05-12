public class Flight {

    private Plane plane;
    private int flightnumber;
    private AirportCodeType destination;
    private int bookings;

    public Flight(Plane plane, int flightnumber, AirportCodeType destination){
        this.plane = plane;
        this.flightnumber = flightnumber;
        this.destination = destination;
        this.bookings = 0;
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

    public void addBooking(int i) {
        this.bookings += i;
    }

    public int checkTicketsSold() {
        return this.bookings;
    }

    public int checkFlightCapacity() {
       return this.plane.getCapacity();
    }

    public void boardPassenger() {
        this.plane.addPassenger();
    }
}
