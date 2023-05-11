import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PixelQuantizationTest {

    PixelQuantization pixQ = new PixelQuantization();

    @Test
    public void testPixelQuant(){
        int[] arrayName = {78, 45, 32, 59, 98, 76, 54};
        int[] quantResult = pixQ.quantizePixel(arrayName);
        int[] result = {70, 50, 30, 50, 90, 70, 50};
        assertEquals(Arrays.toString(result), Arrays.toString(quantResult));
    }
    @Test
    public void testPixelQuant2(){
        int[] arrayName = {78, 45, -32, -59, 98, 76, 54};
        int[] quantResult = pixQ.quantizePixel(arrayName);
        int[] result = {70, 50, 30, 50, 90, 70, 50};
        assertEquals(Arrays.toString(result), Arrays.toString(quantResult));
    }


}