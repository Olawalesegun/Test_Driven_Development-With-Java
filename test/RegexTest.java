import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegexTest {

    @BeforeEach
    void setUp() {
    }
   /* Quantifiers
    Character class
    Capture groups*/
    @Test
    public void testRegex(){
        String text = "AAA";
        String pattern = "A{2, 3}";

        /*String text = "AdelAjA";
        String pattern = "[A-z]";*/
     /*   String text = "9"
        String pattern = "\\d"; // One only
        String pattern = "\\d?"; // oNe opr Zero
        String pattern = "\\d+" // One or More
        String pattern = "\\d\\d"; Two digits
        String pattern = "\\d{11}";*/
        boolean result = Regex.findMatch(text, pattern);
        assertTrue(result);
    }
    @Test
    public void testValidatePhoneNumber(){
        String phoneNumber = "=234-7035250404";
        boolean result = Regex.validatePhoneNumber((phoneNumber));
        assertTrue(result);
    }
}