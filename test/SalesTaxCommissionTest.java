import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesTaxCommissionTest {
    SalesTaxCommission salesTax = new SalesTaxCommission();
    @Test
    public void testTaxCommission(){
        SalesTaxCommission returnedValue = salesTax.getWeeklySales(6500).getTaxCommission().getWeeklyEarnings();
        assertEquals(785, returnedValue);
    }
    @Test
    public void test2TaxCommission(){
        SalesTaxCommission returnedValue = salesTax.getWeeklySales(-5000).getTaxCommission().getWeeklyEarnings();
        assertEquals(-250, returnedValue);
    }

}