import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HypotenuseCalculationTest {
    HypotenuseCalculation hypotCalc = new HypotenuseCalculation();
    @Test
    public void testCalc(){
       double value1 = hypotCalc.hypotenuse(6,1);
       assertEquals(3.6055, value1);
    }

    @Test
    public void testCalcForHypotenuse(){
        double hypotenuseValue = HypotenuseCalculation.hypotenuse(7, 8);
        String convertedHypotValue = HypotenuseCalculation.convertMyFloatingNumberTo3Precision(hypotenuseValue);
        assertEquals("10.630", convertedHypotValue);
    }
}