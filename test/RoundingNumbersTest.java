import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RoundingNumbersTest {
    @Test
    public void testRoundingNumberDownForPositiveValue1(){
       double result1 = RoundingNumbers.roundDown(9.1, 8.5);
       assertEquals(17, result1);
    }
    @Test
    public void testRoundingNumberDownForNegativeValue(){
        double result2 = RoundingNumbers.roundDown(-8.7, 2.5);
        assertEquals(-7, result2);
    }
    @Test
    public void testRoundingNumberDownForLargeNumbers(){
        double result3 = RoundingNumbers.roundDown(785.09, 8);
        assertEquals(793, result3);
    }

}