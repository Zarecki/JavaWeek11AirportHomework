import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestAirport {

    Airport airport;
    Plane plane;
    Flight flight;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747, Airline.BRUTISHAIRWAYS, 1);
        airport = new Airport(AirportCodeType.EDINBURGH);
    }

    @Test
    public void canGetHangarSize(){
        assertEquals(0, airport.getHangarSize());
    }

    @Test
    public void canGetAirportCode(){
        assertEquals("EDI", airport.getAirportCode());
    }

    @Test
    public void canAddPlaneToHangar(){
        airport.addPlaneToHangar(plane);
        assertEquals(1, airport.getHangarSize());
    }

    @Test
    public void canCreateNewFlight(){
       Flight flight = airport.createNewFlight(plane);
       assertEquals(102, flight.getFlightNumber());
       assertEquals("HND", flight.getDestination());
    }

    @Test
    public void canSellTicket(){
        Flight flight = airport.createNewFlight(plane);
        airport.sellTicket(flight, 10);
        assertEquals(11, flight.getNumberOFPassengers());
    }

    @Test
    public void canCheckTicketsSold(){
        Flight flight2 = airport.createNewFlight(plane);
        airport.sellTicket(flight2, 10);
        assertEquals(11, flight2.checkTicketsSold());
    }
}
