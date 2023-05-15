import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddNumberInArrayTest {
    OddNumberInArray odd;
    @BeforeEach
    void setUp() {
        odd = new OddNumberInArray();
    }
    @Test
    public void testConstructor(){
       assertNotNull(odd);
    }
    @Test
    public void testArrayToBeSureItContainsTheActualElementsEntered(){
        int[] arrayToBeUsedForTest = {5, 6, 7, 8, 13, 12, 11};
        odd.setArrayValues(arrayToBeUsedForTest);
        assertEquals(arrayToBeUsedForTest, odd.collectArrayValues());
    }
    @Test
    public void testArrayInstanceVariableToReturnElementsPresentInTheIndexEntered(){
        int[] arrayToBeCollectedAndUsedForTest = {8, 7, 6, 3, 2, 1};
        odd.setArrayValues(arrayToBeCollectedAndUsedForTest);
        int returnedIndex = odd.returnIndexValueOFArray(2);
        assertEquals(6, returnedIndex);
    }

    Write a function that prints the elements on odd positions in a list.
    /*@Test
    public void test*/

    /*@Test
    public void testArray*/

}