import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {
    Multiplication multiply = new Multiplication();
    @Test
    public void multiplyTest(){
    int mul = multiply.multiplyTable(2);
    assertEquals(24, mul);
    }

    @Test
    public void multiplyTest2(){
        assertEquals(60, multiply.multiplyTable(5));
    }

    @Test
    public void multiplyTest3(){
        int mul = multiply.multiplyTable(-4);
        assertEquals(0, mul);
    }
}