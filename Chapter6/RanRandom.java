import java.util.Random;


public class RanRandom {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 7, 9, 15};
        Random random = new Random();
        int index = random.nextInt(numbers.length);
        int randomNum = numbers[index];
        System.out.println("Random number: " + randomNum);
    }

}
