import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenPositionsInArrayElementTest {
    //Write a function that returns the elements on even positions in a list.
    EvenPositionsInArrayElement even = new EvenPositionsInArrayElement();

    @Test
    public void testConstructor(){
        assertNotNull(even);
    }
    @Test
    public void testEven1(){
        int[] arrayCollector = {1, 6, 8, 9, 5, 4, 2};
        even.setArrayToInitializeValueToInstanceVariable(arrayCollector);
        even.collectMutatedArray();
        even.checkForElementsOnEVenPositionsInArray();
        String resultOfArrayComputationForEvenPositions =  even.returnElementsOnEVenPositionsInArray();
        String arrayExpectedResult = "[1, 0, 8, 0, 5, 0, 2]";
        assertEquals(arrayExpectedResult, resultOfArrayComputationForEvenPositions);
    }

    @Test
    public void testEven2(){
        int[] arrayCollector = {15, -7, 89, 1000, 876, 54231, 2};
        even.setArrayToInitializeValueToInstanceVariable(arrayCollector);
        even.collectMutatedArray();
        even.checkForElementsOnEVenPositionsInArray();
        String resultOfArrayComputationForEvenPositions =  even.returnElementsOnEVenPositionsInArray();
        String arrayExpectedResult = "[15, 0, 89, 0, 876, 0, 2]";
        assertEquals(arrayExpectedResult, resultOfArrayComputationForEvenPositions);
    }

    @Test
    public void testEven3(){
        int[] arrayCollector = {-9, -7, -10, -1000, -876, -54231, -2};
        even.setArrayToInitializeValueToInstanceVariable(arrayCollector);
        even.collectMutatedArray();
        even.checkForElementsOnEVenPositionsInArray();
        String resultOfArrayComputationForEvenPositions =  even.returnElementsOnEVenPositionsInArray();
        String arrayExpectedResult = "[-9, 0, -10, 0, -876, 0, -2]";
        assertEquals(arrayExpectedResult, resultOfArrayComputationForEvenPositions);
    }
}
