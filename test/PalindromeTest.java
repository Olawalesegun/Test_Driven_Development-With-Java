import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    Palindrome palin = new Palindrome();

    @Test
    public void palinTest() {
        String firstCheck = palin.palindromeCheck("31113");
        assertEquals("31113", firstCheck);
    }
}