import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HeartRateTest {

    @Test
    public void constructorTest(){
        HeartRate heart = new HeartRate("Segun", "Olawale", "56-76-1990");
        assertNotNull(heart);
    }
     @Test
    public void getFirstnameTest(){

     }
}