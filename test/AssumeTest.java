import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssumeTest {

    @Test
    public void Result1Test(){
        Assume assume = new Assume();
        assume.setParametersToMultiply(6, 2);
        int multiplicationResult = assume.getMultiplicationOfParametersEntered();
        assertEquals(12, multiplicationResult);
    }

    @Test
    public void Result2Test(){
        Assume assume = new Assume();
        assume.setParametersToMultiply(6, -4);
        int multiplicationResult = assume.getMultiplicationOfParametersEntered();
        assertEquals(24, multiplicationResult);
    }


}