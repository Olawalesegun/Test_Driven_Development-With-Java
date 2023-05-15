import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexNumberOfArrayTest {
    IndexNumberOfArray indexed;
    @BeforeEach
    void setUp() {
        indexed = new IndexNumberOfArray();
    }
    @Test
    public void testConstructor(){
       assertNotNull(indexed);
    }
    @Test
    public void testArrayToBeSureItContainsTheActualElementsEntered(){
        int[] arrayToBeUsedForTest = {5, 6, 7, 8, 13, 12, 11};
        indexed.setArrayValues(arrayToBeUsedForTest);
        assertEquals(arrayToBeUsedForTest, indexed.collectArrayValues());
    }
    @Test
    public void testArrayInstanceVariableToReturnElementsPresentInTheIndexEntered(){
        int[] arrayToBeCollectedAndUsedForTest = {8, 7, 6, 3, 2, 1};
        indexed.setArrayValues(arrayToBeCollectedAndUsedForTest);
        int returnedIndex = indexed.returnIndexValueOFArray(2);
        assertEquals(6, returnedIndex);
    }

   // Write a method that prints the elements on indexed positions in a.
    /*@Test
    public void test*/

    /*@Test
    public void testArray*/

}