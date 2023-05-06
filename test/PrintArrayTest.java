import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrintArrayTest {

   /* @Test
    public void testArray(){
        String arrayValues = PrintArray.determineLengthOfArray(5);
        assertEquals(5,arrayValues);
        //assertArrayEquals([5,4,3,2,1,0], arrayValues);
    }*/
    @Test
    public void testArray(){
        int[] array = {4, 5, 6, 7};
        //int[] array2 = new int[]{PrintArray.printArray(array)};
        PrintArray.printArray(array);
        int[] array2 = {1,2,3,4};
        assertEquals(Arrays.toString(array2), Arrays.toString(PrintArray.printArray(array)));
    }

    @Test
    public void testArray2(){
        int[] array = {4, 0, 6, 7, 0, 0, 0, 0, 0, 0};
        //int[] array2 = new int[]{PrintArray.printArray(array)};
        PrintArray.printArray(array);
        int[] array2 = {1,2,3,4,5,6,7,8,9,10};
        assertEquals(Arrays.toString(array2), Arrays.toString(PrintArray.printArray(array)));
    }

    @Test
    public void insertElementsIntoArrayTest(){
        int[] array = new int[40];
       // int[] expected = {1,2,3,4,5,6,7,8,9,10};
        int[] actual = PrintArray.printArray(array);
        for(int index = 0; index < actual.length; index++){
            assertEquals(index + 1, actual[index]);
        }
    }
}