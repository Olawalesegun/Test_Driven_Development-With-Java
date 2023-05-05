import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoundsTest {
    @Test
    public void testFirstApproachToRoundToInteger(){
        double result1 = Roundss.roundToInteger1(89.7);
        assertEquals(90, result1);
    }
    @Test
    public void testFirstApproachToRound(){
        double result2 = Roundss.roundToTenths(67.98);
        assertEquals(68, result2);
    }

}
