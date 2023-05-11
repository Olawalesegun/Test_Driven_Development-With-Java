import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloorAndCeilTest {

    @Test
    public void testFloor1(){
        int result1 = FloorAndCeil.myFloor(5.6);
        assertEquals(5, result1);
    }
    @Test
    public void testFloor2(){
        int result2 = FloorAndCeil.myFloor(7.89);
        assertEquals(7, result2);
    }

    @Test
    public void testFloor3(){
        int result2 = FloorAndCeil.myFloor(-7.89);
        assertEquals(0, result2);
    }
   @Test
    public void testCeil1(){
        int result3 = FloorAndCeil.myCeil(6.67);
        assertEquals(7, result3);
    }
    @Test
    public void testCeil2(){
        int result4 = FloorAndCeil.myCeil(8.9);
        assertEquals(9, result4);
    }
    @Test
    public void testCeil3(){
        int result5 = FloorAndCeil.myCeil(-9.76);
        assertEquals(0, result5);
    }

}