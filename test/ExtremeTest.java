import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtremeTest {
    /*public void extremeMinMan(){
        System.out.println("Enter a number: ");
        int numberOfEnter =
    }*/

    @Test
    public void extremeMinMax(){
        int[] newArray = {1, 2, 3, -4, 6};
        int newA = checkMinMax(newArray);
        assertEquals(2, newA);
    }

    @Test
    public void extremeMinMax2(){
        int[] newArray = {1, 2, 3, 4, 6};
        int newA = checkMinMax(newArray);
        assertEquals(7, newA);
    }

    private int checkMinMax(int[] newArray) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int count: newArray){
            if(count>max){
                max = count;
            }
            if(count<min){
                min=count;
            }
        }
        return max + min;
    }

}