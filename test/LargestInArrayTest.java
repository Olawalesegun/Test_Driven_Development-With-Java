import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestInArrayTest {

    LargestInArray largeArr = new LargestInArray();
    @BeforeEach
    void setUp() {
        largeArr = new LargestInArray();
    }
    @Test
    public void testArrayPresence(){
        assertNotNull(largeArr);
    }
    @Test
    public void testArrayLargestNumber(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        largeArr.collectArrayIntoClass(array);
        largeArr.passingArrayToACallerMethodOrMutateInstanceVariable();
        largeArr.solveForLargestNumber();
        int largestNumber = largeArr.collectLargestNumber();
        assertEquals(8, largestNumber);
    }

    @Test
    public void testArrayForLargestNumber(){
        int[] array = {0, 6, 879, 34, 89};
        largeArr.collectArrayIntoClass(array);
        largeArr.passingArrayToACallerMethodOrMutateInstanceVariable();
        largeArr.solveForLargestNumber();
        int largestNumber = largeArr.collectLargestNumber();
        assertEquals(879, largestNumber);
    }
}