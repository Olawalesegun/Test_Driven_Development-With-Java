import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayQuesTest {

    @Test
    public void testArrayToReturnDouble(){
        ArrayQues arrQue = new ArrayQues();
        int[] arrPassed = {1, 2, 3};
        arrQue.takeInArray(arrPassed);
        int[] returnArrayDoubled = arrQue.doubledArrayReturned();
        int[] expectedResult = {1, 2, 3, 0, 0, 0};
        assertArrayEquals(expectedResult, returnArrayDoubled);

    }
    @Test
    public void testArrayToReturnDouble2(){
        ArrayQues arrQue = new ArrayQues();
        int[] arrPassed = {1, 2, 3, 4};
        arrQue.takeInArray(arrPassed);
        int[] returnArrayDoubled = arrQue.doubledArrayReturned();
        int[] expectedResult = {1, 2, 3, 4, 0, 0, 0, 0};
        assertArrayEquals(expectedResult, returnArrayDoubled);

    }
    @Test
    public void testArrayToReturnDouble3(){
        ArrayQues arrQue = new ArrayQues();
        int[] arrPassed = {1, 2,};
        arrQue.takeInArray(arrPassed);
        int[] returnArrayDoubled = arrQue.doubledArrayReturned();
        int[] expectedResult = {1, 2,0, 0};
        assertArrayEquals(expectedResult, returnArrayDoubled);

    }
//    @Test
//    public void testArrayToReturnDouble4(){
//        ArrayQues arrQue = new ArrayQues();
//        int
//    }

}