import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFlight {

    Flight flight;
    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747, Airline.BRUTISHAIRWAYS, 1);
        flight = new Flight(plane, 101, AirportCodeType.AMSTERDAM);
    }

    @Test
    public void canGetPlane(){
        assertEquals(PlaneType.BOEING747, flight.getPlane());
    }

    @Test
    public void canGetFlightNumber(){
        assertEquals(101, flight.getFlightNumber());
    }

    @Test
    public void canGetDestination(){
        assertEquals("AMS", flight.getDestination());
    }



}
