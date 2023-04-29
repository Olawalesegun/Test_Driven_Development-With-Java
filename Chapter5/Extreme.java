import java.util.Scanner;
public class Extreme {
    /*  5.11 (Extremes) Write an application that finds the minimum and maximum amongst several
    integers and then computes the sum of the two extremes. The user will be prompted to input how
    many values the application should ask the user to input.*/

    //  TODO:
    //  1. Declare a class
    //  2. import a scanner object and create scanner object in the class
    //  3. declare a method
    //  4. declare variables to take in Minimum and Maximum.
    //  5. initialize them with zero
    //  6. prompt user to enter how many inputs app should take
    //  6. initialize a variable to take the inputs
    //  6. call scanner method on a the reference to the object and pass to the variable above
    //  7. Declare a loop and pass the the input as a condition for the number of times app should request data
    //  8. prompt user to enter values
    //  9.      Declare a variable to take values
    //  10.     initialize the variable with the scanner object
    //  11.     check if valueEntered > Maximum:
    //  12.         if True:
    //  13.             pass largest to valueContainer
    //  14      check if valueEntered < Minimum:
    //  15.         if True:
    //  16.             check if valueEntered < minimum
    //  17.     return Max + Min
    static Scanner userInput = new Scanner(System.in);


    public static void main(String[] args) {
        extremeMinMax();
    }
    public static int extremeMinMax(){
        int min = Integer.MAX_VALUE; // 0;
        int max = Integer.MIN_VALUE; //0;
        int numberEntered;
        System.out.println("Enter how many inputs app should app take: ");
        int numberOfTimes = userInput.nextInt();
        for(int count=1; count<=numberOfTimes; count++){
            System.out.println("Enter a number: ");
            numberEntered = userInput.nextInt();
            if(numberEntered> max){
                max = numberEntered;
            }
            if(numberEntered < min){
                min=numberEntered;
            }
        }
        System.out.println(min + max);
       return min;
    }
}
