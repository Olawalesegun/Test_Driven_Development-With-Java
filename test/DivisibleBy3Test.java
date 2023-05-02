import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisibleBy3Test {

    /*5.12 (Integers Divisible by 3) Write an application that calculates the sum of those integers between
    1 and 30 that are divisible by 3.*/
    /*@BeforeEach
    void setUp() {
        DivisibleBy3 div3 = new DivisibleBy3();
    }*/
    DivisibleBy3 div3 = new DivisibleBy3();
    @Test
    public void divideBy3Test(){
        int div = div3.divideBy3();
        assertEquals(135, div);
    }

}