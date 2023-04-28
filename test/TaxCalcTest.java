import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalcTest {

    @Test
    public void taxCalculatorCitizen1Test(){
        TaxCalc firstCitizen = new TaxCalc();
        double sakamaje = firstCitizen.calculus(30000);
        assertEquals(4500, sakamaje);
    }
    @Test
    public void taxCalculatorCitizen2Test(){
        TaxCalc secondCitizen = new TaxCalc();
        double cit2 = secondCitizen.calculus(90000);
        assertEquals(18000, cit2);
    }

    @Test
    public void taxCalculatorCitizen3Test(){
        TaxCalc thirdCitizen = new TaxCalc();
        double cit2 = thirdCitizen.calculus(-0);
        assertEquals(0, cit2);
    }

}