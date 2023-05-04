import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RoundingNumbersTest {
    @Test
    public void testRoundingNumberDownForPositiveValue1(){
       double result1 = RoundingNumbers.roundDown(9.1);
       assertEquals(9, result1);
    }
    @Test
    public void testRoundingNumberDownForNegativeValue(){
        double result2 = RoundingNumbers.roundDown(-8.7);
        assertEquals(-9, result2);
    }
    @Test
    public void testRoundingNumberDownForLargeNumbers(){
        double result3 = RoundingNumbers.roundDown(785.09);
        assertEquals(785, result3);
    }

}