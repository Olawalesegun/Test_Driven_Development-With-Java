import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingChargesTest {
    ParkingCharges park = new ParkingCharges(4);
    @Test
    public void testConstructor(){
        assertNotNull(park);
    }

    @Test
    public void testParkingHoursForPositiveValues(){
        assertEquals(7,park.getParkingHours(7));
    }
    @Test
    public void testParkingHoursForHigherValues(){
        assertEquals(9, park.getParkingHours(25));
    }
    @Test
    public void testParkingHoursForNegativeValues(){
        assertEquals(0, park.calculateCharges(-76));
    }
    @Test
    public void testCalc1(){
        double takeIn1 = park.getParkingHours(25);
        double charge1 = park.calculateCharges(takeIn1);
        assertEquals(10, charge1);
    }
    @Test
    public void testCalc2(){
        double takeIn2 = park.getParkingHours(-7);
        double takes = park.calculateCharges(takeIn2);
        assertEquals(0,takes);
    }
    /*@Test
    public void testCalc2(){
        double takes = ParkingCharges.totalReceipts;
        assertEquals(, takes);
        assertEquals(1, takes);
    }*/
}