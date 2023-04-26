
import java.util.Scanner;

public class MinMaxf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many integers do you want to enter? ");
        int numIntegers = input.nextInt();

        // Initialize variables to keep track of the minimum and maximum integers
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numIntegers; i++) {
            System.out.printf("Enter integer %d: ", i + 1);
            int value = input.nextInt();

            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }
        int sum = min + max;

        // Print the result
        System.out.printf("The minimum value is %d%n", min);
        System.out.printf("The maximum value is %d%n", max);
        System.out.printf("The sum of the extremes is %d%n", sum);
    }
}

