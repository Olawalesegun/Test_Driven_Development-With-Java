import java.util.Scanner;

public class ReadUserInput {
    public static void main(String[] args){
        //Read 10 numbers from the console entered by the user and print the sum of those numbers.
        // use the hasNextInt() method from the scanner to check if the user has entered an int value.
        // If hasNextInt() returns false, print the message Invalid Number. continue reading until you have read 10numbers.
        // use the nextInt() method to get the number and add it to the sum.
        // Before the user enters a number print out the message
        // Enter the number #x: where x represents the count
        System.out.println(useSudoForRootCase(10));
    }



    public static boolean useSudoForRootCase(int baseForCondition) {
        Scanner userInput = new Scanner(System.in);
        int x;
        int total = 0;
        boolean hasNextInt = false;
        for (x = 1; x <= baseForCondition; x++) {
            System.out.println("Enter the number: " + x);
            hasNextInt = userInput.hasNextInt();
            if (hasNextInt) {
                int numbersCollected = userInput.nextInt();
                total += numbersCollected;
                System.out.println("Here is the sum of the numbers entered: " + total);
            } else {
                System.out.println("Invalid Number");
                break;
            }

        }
        return hasNextInt;
    }
}
