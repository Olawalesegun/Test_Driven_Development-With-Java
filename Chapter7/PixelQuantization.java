import java.util.Arrays;

public class PixelQuantization {
    /*
            7.10 (Pixel Quantization) Use a one-dimensional array to solve the following problem: You want
        to eventually perform some basic compression on an image. Assume that you will only be operating
        on a single row of the image, and that pixel colors are represented as simple numbers in the array. You
        are required to quantize the values of the pixels in the row. In other words, any pixel values appearing
        in a range will assume a value in that range as indicated below. This creates redundancy that can lead
        to better compression. Overwrite the original values in the array.
        a) For 0–20: 10
        b) For 21–40: 30
        c) For 41–60: 50
        d) For 61–80: 70
        e) For 81–100: 90
        f) For 101–120: 110
        g) For 121–140: 130
        h) For 141–160: 150
        i) For 161–180: 170, and for all other pixel values, assumed a quantized value of 190
        Print the array with the new, quantized values

    */
    public static void main(String[] args) {
        int[] array1 = {41, 23, 86, 78, 100, 53, 99};
        quantizePixel(array1);
    }
    public static int[] quantizePixel(int[] array){
        for(int loopThroughArray = 0; loopThroughArray < array.length; loopThroughArray++){
            if(array[loopThroughArray] >= 0 && array[loopThroughArray] <=20)array[loopThroughArray] = 10;
            if(array[loopThroughArray] >= 21 && array[loopThroughArray] <=40)array[loopThroughArray] = 30;
            if(array[loopThroughArray] >= 41 && array[loopThroughArray] <= 60)array[loopThroughArray] = 50;
            if(array[loopThroughArray] >= 61 && array[loopThroughArray] <= 80)array[loopThroughArray] = 70;
            if(array[loopThroughArray] >= 81 && array[loopThroughArray] <= 100)array[loopThroughArray] = 90;
            if(array[loopThroughArray] >= 101 && array[loopThroughArray] <= 120) array[loopThroughArray] = 110;
            if(array[loopThroughArray] >= 121 && array[loopThroughArray] <= 140) array[loopThroughArray] = 130;
            if(array[loopThroughArray] >= 141 && array[loopThroughArray] <= 160) array[loopThroughArray] = 150;
            if(array[loopThroughArray]>= 161 && array[loopThroughArray] <= 180) array[loopThroughArray] = 190;
            if(array[loopThroughArray] < 0) System.out.println("Error encountered");
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
