package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void addNumberTest(){
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 8);
        assertEquals(11, result);
    }

    @Test
    public void subtractNumberTest(){
        Calculator calculator = new Calculator();
        /**
         * This a different method of doing this
        int result = calculator.subtract(5, 2);
        assertEquals(3, result);
         **/
        assertEquals(3, calculator.subtract(5, 2));
    }

    @Test
    public void absoluteSubtractionTest(){
        Calculator calculator = new Calculator();
        /**
         * int result = calculator.subtract(5, 2);
        assertEquals(3, result);**/
        assertEquals(3, calculator.subtract(2, 5));
    }
    @Test
    public void multiplyTest(){
        Calculator calculator = new Calculator();
        int result = calculator.multiply(5, 2);
        assertEquals(10, result);
    }

    @Test
    public void divisionTest(){
        Calculator calculator = new Calculator();
        int result = calculator.division(8, 4);
        assertEquals(2, result);
    }
    @Test
    public void modularTest(){
        Calculator calculator = new Calculator();
        int result = calculator.modulus(7, 2);
        assertEquals(1, result);
    }

    @Test
    public void raiseToPowerTest(){
        Calculator calculator = new Calculator();
        int result = calculator.raiseToPower(4, 2);
        assertEquals(16, result);
    }

    @Test
    public void squareRootTest(){
        Calculator calculator = new Calculator();
        double result = calculator.squareRoot(16);
        assertEquals(8, result);
    }

}