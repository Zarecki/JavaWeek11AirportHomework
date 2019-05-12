import java.util.ArrayList;

public class Airport {

    private ArrayList<Plane> hangar;
    private AirportCodeType airportCode;

    public Airport(AirportCodeType airportCode){
        this.hangar = new ArrayList<>();
        this.airportCode = airportCode;
    }

    public int getHangarSize() {
        return this.hangar.size();
    }

    public String getAirportCode(){
        return this.airportCode.getValue();
    }

    public void addPlaneToHangar(Plane plane) {
        this.hangar.add(plane);
    }

    public Flight createNewFlight(Plane plane) {
        Flight flight = new Flight(plane, 102, AirportCodeType.TOKYO);
        return flight;
    }

    public void sellTicket(Flight flight, int i) {
        if (flight.checkTicketsSold() < flight.checkFlightCapacity())
        flight.addBooking(i);
    }

    public void checkTicketsSold(Flight flight){
        flight.checkTicketsSold();
    }

    public void checkInForFlight(Flight flight){
        flight.boardPassenger();
    }
}
