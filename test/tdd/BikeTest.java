package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BikeTest {

    @Test
    public void isOnTest(){
        Bike bike = new Bike();
        bike.isOn(true);
        bike.getIsOn();
        assertTrue(true);
    }

    @Test
    public void isOffTest(){
        Bike bike = new Bike();
        bike.isOff(false);
        bike.getIsOff();
        assertFalse(false);
    }

}
