import java.util.Scanner;

public class GreaterLower {

    public static void main(String... args) {
        greaterAndLower();
    }

    public static void greaterAndLower() {
        int swapNo = 0;
        int greaterValue = Integer.MIN_VALUE;
        int lowerValue = Integer.MAX_VALUE;
        int num = 1;
        int numberToCompare;
        Scanner userInput = new Scanner(System.in);
        while (num != 0) {
            System.out.println("Enter a number that to check for which is greater or lower");
            numberToCompare = userInput.nextInt();
            //swapNo = numberToCompare;
            if (numberToCompare < lowerValue) {
                lowerValue = numberToCompare;
            }
            if (numberToCompare > greaterValue) {
                greaterValue = numberToCompare;
            }

            System.out.println("To halt this loop, enter 0, while to continue Press a number other than 0");
            num = userInput.nextInt();
            if(num <= 0){
                if(numberToCompare == greaterValue || numberToCompare == greaterValue) {
                    System.out.printf("The greater number you entered is: %d%n", greaterValue );
                    System.out.printf("The lower number you entered is: %d%n", lowerValue);
                }
            }


        }
    }
}