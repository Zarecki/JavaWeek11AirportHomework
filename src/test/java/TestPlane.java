import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPlane {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747, Airline.BRUTISHAIRWAYS, 1);
    }

    @Test
    public void canGetType(){
        assertEquals(PlaneType.BOEING747, plane.getType());
    }

    @Test
    public void canGetAirline(){
        assertEquals(Airline.BRUTISHAIRWAYS, plane.getAirline());
    }

    @Test
    public void canGetPassengers(){
        assertEquals(1, plane.getPassengers());
    }

    @Test
    public void canMakeNewPlane(){
        Plane plane2 = plane.makeNewPlane();
        assertEquals(PlaneType.AIRBUS380, plane2.getType());
        assertEquals(Airline.LAMDA, plane2.getAirline());
        assertEquals(0, plane2.getPassengers());
    }
}
