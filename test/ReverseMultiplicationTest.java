import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseMultiplicationTest {
    ReverseMultiplication reverseMul = new ReverseMultiplication();
    @Test
    public void reverseMultiplyTest(){
        int rev = reverseMul.reverseMultiply(10);
        assertEquals(0, rev);
    }

    @Test
    public void reverseMultiplyTest2(){
       assertEquals(0, reverseMul.reverseMultiply(7));
    }

}