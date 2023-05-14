import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayPracticeTest {
    ArrayPractice arr;
    @BeforeEach
    void setUp() {
        arr = new ArrayPractice();
    }
    @Test
    public void testArrayAverage(){
        int[] arrayCollect = {1, 2, 3, 4 , 5, 6, 7, 8, 9, 10};
        arr.setArrayCollectedForUse(arrayCollect);
        arr.getArrayCollectedForUse();
        arr.findSumOfArray(arr.getArrayCollectedForUse());
        double newAverage = arr.getAverage();
        assertEquals(5.5,newAverage);
    }


    /*@Test
    public void testArrayAverage2(){
        int[] arrayCollect = {1, 2, 3, 4 , -5, 6, 7, 8, 9, 10};
        assertEquals(5.5, arr.findAverage(arrayCollect));
    }*/

}