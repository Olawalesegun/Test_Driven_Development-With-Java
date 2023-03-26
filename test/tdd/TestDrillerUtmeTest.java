package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestDrillerUtmeTest {
    @Test
    public void checkingAmount2CopiesTest(){
        TestDrillerUtme testt = new TestDrillerUtme();
       // int result = testt.checkForCopies(4);
        assertEquals(4_000, testt.checkForCopies(2));
    }
    @Test
    public void checkingAmount3CopiesTest(){
        TestDrillerUtme testt = new TestDrillerUtme();
        assertEquals(6_000, testt.checkForCopies(3));
    }
    @Test
    public void checkingAmount4CopiesTest(){
        TestDrillerUtme testt = new TestDrillerUtme();
        assertEquals(8_000, testt.checkForCopies(4));
    }

    @Test
    public void checkingAmount5CopiesTest(){
        TestDrillerUtme testt = new TestDrillerUtme();
        assertEquals(9_000, testt.checkForCopies(5));
    }
    @Test
    public void checkingAmount6CopiesTest(){
        TestDrillerUtme testt = new TestDrillerUtme();
        assertEquals(10_800, testt.checkForCopies(6));
    }

    @Test
    public void checkingAmount7CopiesTest(){
        TestDrillerUtme testt = new TestDrillerUtme();
        assertEquals(12_600, testt.checkForCopies(7));
    }

    @Test
    public void checkingAmount10CopiesTest(){
        TestDrillerUtme testt = new TestDrillerUtme();
        assertEquals(16_000, testt.checkForCopies(10));
    }

    @Test
    public void checkingAmount600CopiesTest(){
        TestDrillerUtme testt = new TestDrillerUtme();
        assertEquals(600_000, testt.checkForCopies(600));
    }
    @Test
    public void checkingAmount500CopiesTest(){
        TestDrillerUtme testt = new TestDrillerUtme();
        assertEquals(0, testt.checkForCopies(-4));
    }
}