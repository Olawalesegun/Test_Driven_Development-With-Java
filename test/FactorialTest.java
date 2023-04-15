import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    Factorial fac = new Factorial();
    @Test
    public void factorialCheck(){
        int facReturn = fac.factorialInput(7);
        assertEquals(5040, facReturn);
    }

    @Test
    public void factorialCheck2(){
        int facReturn = fac.factorialInput(-5);
        assertEquals(0, facReturn);
    }

    @Test
    public void factorialCheck3(){
        int facReturn = fac.factorialInput(34);
        assertEquals(0, facReturn);
    }

    //SECOND APPROACH TO FACTORIAL
    @Test
    public void factorialCheck2ndApproach(){
        int facReturn = fac.factorialSecondApproach(7);
        assertEquals(5040, facReturn);
    }

    @Test
    public void factorialCheck2ndApproach2(){
        int facReturn = fac.factorialSecondApproach(34);
        assertEquals(0,facReturn);
    }

    @Test
    public void factorialCheck2ndApproach3(){
        int facReturn = fac.factorialSecondApproach(33);
        assertEquals(-2147483648, facReturn);
    }
}