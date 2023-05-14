import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayTest {
    ReverseArray rev;

    @BeforeEach
    void setUp() {
        rev = new ReverseArray();
    }
    @Test
    public void testArrayPresence(){
        assertNotNull(rev);
    }
    @Test
    public void testArrayReverse(){
        int[] arrayUsedToTestFunctionality = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        rev.setArray(arrayUsedToTestFunctionality);
        rev.collectArrayIntoAMethodOrMutateItsState();
        rev.reverseArray();
        int[] collectedReversedArray = rev.collectReverseArray();
        int[] reversedArrayExpectedAsResult = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertEquals(reversedArrayExpectedAsResult, collectedReversedArray);
    }
    @Test
    public void testArrayReverse2(){
        int[] arrayUsedToTestFunctionality = {30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40};
        rev.setArray(arrayUsedToTestFunctionality);
        rev.collectArrayIntoAMethodOrMutateItsState();
        rev.reverseArray();
        int[] collectedReversedArray = rev.collectReverseArray();
        int[] reversedArrayExpectedAsResult = {40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30};
        assertEquals(Arrays.toString(reversedArrayExpectedAsResult), Arrays.toString(collectedReversedArray));
    }

//    @Test

}