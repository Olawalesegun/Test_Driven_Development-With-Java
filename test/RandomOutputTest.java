import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomOutputTest {
    @Test
    public void testRandomNumberMethod(){
       /* a) 0, 3, 6, 9, 12.
        b) 1, 2, 4, 8, 16, 32.
        c) 10, 20, 30, 40.*/
        int[] arraySet1 = {0, 3, 6, 9, 12};
        int resultGottenFromFindRandomNumberMethod = RandomOutput.findrandomNumber(arraySet1);
        int loopThroughArray = 0;
        for(int count=0; count<arraySet1.length; count++){
            if(resultGottenFromFindRandomNumberMethod == arraySet1[loopThroughArray]){
                int newCollected = arraySet1[loopThroughArray];
                assertEquals(newCollected, resultGottenFromFindRandomNumberMethod);
            }
        }
    }
}