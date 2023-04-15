import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    public void factorialCheck(){
        Factorial fac = new Factorial();
        int facReturn = fac.factorialInput(7);
        assertEquals(5040, facReturn);
    }

    @Test
    public void factorialCheck2(){
        Factorial fac = new Factorial();
        int facReturn = fac.factorialInput(-5);
        assertEquals(0, facReturn);
    }

    @Test
    public void factorialCheck3(){
        Factorial fac = new Factorial();
        int facReturn = fac.factorialInput(34);
        assertEquals(0, facReturn);
    }

    //SECOND APPROACH TO FACTORIAL
    @Test
    public void factorialCheck2ndApproach(){
        Factorial fac = new Factorial();
        int facReturn = fac.factorialSecondApproach(7);
        assertEquals(5040, facReturn);
    }

    @Test
    public void factorialCheck2ndApproach2(){
        Factorial fac = new Factorial();
        int facReturn = fac.factorialSecondApproach(34);
        assertEquals(0,facReturn);
    }

    @Test
    public void factorialCheck2ndApproach3(){
        Factorial fac = new Factorial();
        int facReturn = fac.factorialSecondApproach(33);
        assertEquals(-2147483648, facReturn);
    }
}