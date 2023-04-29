import java.util.Scanner;
public class LargestNumber {
    /*4.21 (Find the Largest Number) The process of finding the largest value is used frequently in com-
    puter applications. For example, a program that determines the winner of a sales contest would input
    the number of units sold by each salesperson. The salesperson who sells the most units wins the con-
    test. Write a pseudocode program, then a Java application that inputs a series of 10 integers and deter-
    mines and prints the largest integer. Your program should use at least the following three variables:
    a) counter: A counter to count to 10 (i.e., to keep track of how many numbers have been
    input and to determine when all 10 numbers have been processed).
    b) number: The integer most recently input by the user.
    c) largest: The largest number found so far.*/
    public int findLargestNumber() {
        Scanner userInput = new Scanner(System.in);
        int numberOfTimesToKeepEnteringNumber = 10;
        int number;
        int largest = 0;
        int min = 0;
        for (int count = 0; count <= numberOfTimesToKeepEnteringNumber; count++) {
            System.out.println("Kindly Enter a number: ");
            number = userInput.nextInt();
            if (number > largest) {
                largest = number;
            } else if (number < largest) {
                min = number;
            }
        }
        System.out.println("The minimum value is " + min);
        return min;
    }
}
