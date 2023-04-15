import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    public void factorialCheck(){
        Factorial fac = new Factorial();
        int facReturn = fac.factorialInput(7);
        assertEquals(5040, facReturn);
    }
}