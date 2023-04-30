import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayTest {

    int[] args = new int [4];
    @Test
    public void testCheck2LargestNumber(){
        int[] number = {2, 3, -1, 7, 8, 9};
        String num = chek2LargestNumber(number);
        assertEquals("98", num);
    }

    public String chek2LargestNumber(int[] numbersArray){
        int largest = 0;
        int secondLargest = 0;
        for(int count: numbersArray){
            if(count>largest){
             //   secondLargest = largest;
                largest = count;}

        else if(count > secondLargest && count < largest){
                secondLargest = count;
            }
        }
        return largest + "" + secondLargest;
    }

}