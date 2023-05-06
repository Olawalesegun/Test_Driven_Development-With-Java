import java.security.SecureRandom;
import java.util.Arrays;

public class SecRandom {

    public static void main(String[] args) {
        SecRandom.secRan();
    }
    public static int[] secRan(){
        SecureRandom  sec = new SecureRandom();
        int[] collectorOfInts = new int[20];
        for(int counterValue = 0; counterValue<collectorOfInts.length; counterValue++){
            collectorOfInts[counterValue] = 2 + sec.nextInt(8);
        }
        System.out.println(Arrays.toString(collectorOfInts));
        return collectorOfInts;
    }
}
