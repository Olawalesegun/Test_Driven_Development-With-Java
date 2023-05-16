import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OddPositionsInArrayElementTest {
    //Write a method that prints the elements on odd positions in a list.
    OddPositionsInArrayElement odd = new OddPositionsInArrayElement();
    @Test
    public void testOdd(){
        int[] arrayCollected = {75, 43, 59, 33, 12, 67};
        odd.setArray(arrayCollected);
        //int[] newArr = odd.collectArray();
        odd.extractElementsAtIndex();
        String oddElementsExtractedFromArray = odd.returnExtractOddElementOutOfArray();
        String oddsAlone = "[0, 43, 0, 33, 0, 67]";
        assertEquals(oddsAlone, oddElementsExtractedFromArray);
    }
    @Test
    public void testOdd2(){
        int[] arrayCollected = {5, 23, 14, 2, 6, 12};
        odd.setArray(arrayCollected);
        //int[] newArr = odd.collectArray();
        odd.extractElementsAtIndex();
        String oddElementsExtractedFromArray = odd.returnExtractOddElementOutOfArray();
        String oddsAlone = "[5, 23, 0, 0, 0, 0]";
        assertEquals(oddsAlone, oddElementsExtractedFromArray);
    }
}