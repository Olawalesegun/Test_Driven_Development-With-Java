import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class dimArrayTest {

   /* 7.11
    Write statements that perform the following one-dimensional-array operations:
    a) Set elements of index 10–20, both inclusive, of integer array counts to zero.
    b) Multiply each of the twenty elements of integer array bonus by 2.
    c) Display the ten values of integer array bestScores, each on a new line.*/

    dimArray dimArr;
    @BeforeEach
    void setUp() {
        dimArr = new dimArray();
    }

    @Test
    public void testDimArray(){
        int[] result = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int[] arr = dimArray.setElement(result);
        int[] testFor = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertEquals(Arrays.toString(testFor), Arrays.toString(arr));
    }
    @Test
    public void testMultiplyArray(){
        int[] arrayUsed = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int[] arr = dimArray.multiplyElement(arrayUsed);
        int[] arrToTestFor = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
        assertEquals(Arrays.toString(arrToTestFor), Arrays.toString(arr));
    }
}