package creditCardValidator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTemplateTest {
    CreditCardTemplate cct;

    @BeforeEach
    void setUp() {
        cct = new CreditCardTemplate("VISA", "419867534218", "Valid");
    }

    @Test
    public void testConstructorPresence(){
        assertNotNull(cct);
    }
    @Test
    public void testCardType(){
        cct.setCardType("Master-Card");
       String cardType = cct.getCardType();
       assertEquals("Master-Card", cardType);
    }
    @Test
    public void testCardNumber(){
        cct.setCardNumber("4198897978575");
        cct.getCardNumber();
        assertEquals("4198897978575",  cct.getCardNumber());
    }
    @Test
    public void testCardLength(){
        cct.setCardNumber("4198897978575");
        cct.getCardNumber();
        cct.getCardDigitLength();
        assertEquals(13, cct.getCardDigitLength());
    }

}