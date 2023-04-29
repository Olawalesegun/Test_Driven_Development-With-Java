import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberTest {

    /*(Find the Largest Number) The process of finding the largest value is used frequently in com-
    puter applications. For example, a program that determines the winner of a sales contest would input
    the number of units sold by each salesperson. The salesperson who sells the most units wins the con-
    test. Write a pseudocode program, then a Java application that inputs a series of 10 integers and deter-
    mines and prints the largest integer. Your program should use at least the following three variables:
    a) counter: A counter to count to 10 (i.e., to keep track of how many numbers have been
    input and to determine when all 10 numbers have been processed).
    b) number: The integer most recently input by the user.
    c) largest: The largest number found so far.*/

    LargestNumber largN = new LargestNumber();

    @Test
    public void testConstructor(){
        assertNotNull(largN);
    }

    @Test
    public void testLargestNumber(){
        int[] num = {3, 5, 6, 7, 8, 9, 10, 11, 12, 1};
       int largeNum = findLargestNumber(num);
       assertEquals(12, largeNum);
    }

    public int findLargestNumber(int[] num){
        int largest = 0;
        for(int count: num){
            if(count>largest){
                largest = count;
            }
        }
    return largest;
    }
}