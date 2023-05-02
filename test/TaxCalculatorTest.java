import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorTest {

   /* 4.20 (Tax Calculator) Develop a Java application that determines the total tax for each of three
    citizens. The tax rate is 15% for earnings up to 30,000 USD earned by each citizen and 20% for all
    earnings in excess of that ceiling. You are given a list with the citizens’ names and their earnings in
    a given year. Your program should input this information for each citizen, then determine and dis-
    play the citizen’s total tax. Use class Scanner to input the data.*/

    //  TODO:
    //  1. Declare a class
    //  2. Declare instance variable of the object (taxrate: double, citizenEarning: BigDecimal, citizenName: String
    //  3. Declare a method to carry out the tax calculation
    //  4. return citizenTotalTax
    TaxCalculator taxCalc = new TaxCalculator("Tola", BigDecimal.valueOf(14000), 0.2);

    @Test
    public void testConstructor(){
        assertNotNull(taxCalc);
    }

    @Test
    public void testInstanceVariableTaxRate(){
        taxCalc.setTaxRate(0.15);
        assertEquals(0.15, taxCalc.getTaxRate());
    }
    @Test
    public void testInstanceVariableCitizenEarning(){
        taxCalc.setCitizenEarning(BigDecimal.valueOf(13000));
        assertEquals(BigDecimal.valueOf(13000), taxCalc.getCitizenEarning());
    }
    @Test
    public void testInstanceVariableCitizenName(){
        taxCalc.setCitizenName("Ishe");
        assertEquals("Ishe", taxCalc.getCitizenName());
    }

    @Test
    public void testTaxCalculator(){
        taxCalc.setCitizenName("Segun");
        String name = taxCalc.getCitizenName();
        taxCalc.setCitizenEarning(BigDecimal.valueOf(1200));
        BigDecimal earnings = taxCalc.getCitizenEarning();
        BigDecimal citizenTotalTax = taxCalc.taxCalculator(name, earnings);
        assertEquals(BigDecimal.valueOf(1380), citizenTotalTax);
    }
    @Test
    public void testTaxCalculator2(){
        taxCalc.setCitizenName("Tola");
        String name = taxCalc.getCitizenName();
        taxCalc.setCitizenEarning(BigDecimal.valueOf(120000));
        BigDecimal earnings = taxCalc.getCitizenEarning();
        BigDecimal citizenTotalTax = taxCalc.taxCalculator(name, earnings);
        assertEquals(BigDecimal.valueOf(144000), citizenTotalTax);
    }
}