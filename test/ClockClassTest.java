import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockClassTest {
    ClockClass clockCheck = new ClockClass(20, 40, 20);

    @Test
    public void constructorTest(){
        assertNotNull(clockCheck);
    }
    @Test
    public void testHour(){
        clockCheck.setHour(70);
        assertEquals(0, clockCheck.getHour());
    }
    @Test
    public void testMinute(){
        clockCheck.setMinute(45);
        assertEquals(45, clockCheck.getMinute());
    }
    @Test
    public void testSecond(){
        clockCheck.setSecond(90);
        assertEquals(0, clockCheck.getSecond());
    }

}