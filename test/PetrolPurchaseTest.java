import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetrolPurchaseTest {

    @Test
    public void testConstructor(){
        PetrolPurchase petrol = new PetrolPurchase("Ibadan",
                "Diesel",50, 245.90, 0.5);
        assertNotNull(petrol);
    }

    @Test
    public void testGetPurChase(){
        PetrolPurchase petrol = new PetrolPurchase("Osun", "Kerosene",
                76, 150, 0.8);
        petrol.setPetrolQuantity(50);
        int qty = petrol.getPetrolQuantity();
        petrol.setPricePerLitre(150.00);
        double ppl = petrol.getPricePerLitre();
        petrol.setPercentageDiscount(0.8);
        double pDis = petrol.getPercentageDiscount();
        double netPurchase = petrol.getPurchase(qty, pDis, ppl);
        assertEquals(7499.2, netPurchase);
    }

}