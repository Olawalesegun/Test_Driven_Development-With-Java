import java.util.Scanner;
public class NaturalNumbers {

    public static void main(String[] args){
        //Write a program to print the sum of first 10 natural number.
        Scanner userInput = new Scanner(System.in);
        int total = 0;
        System.out.println("Kindly Enter a first Natural number");
        int naturalNumber = userInput.nextInt();
        for(;naturalNumber<=10; naturalNumber++){
            total += naturalNumber;
        }
        System.out.println("The total is: "+ total);
    }
}
