import java.util.Scanner;
public class PrimeNumber {


    //Write a program that prompts the user to input a positive integer.
    // It should then output a message indicating whether the number is
    // a prime Number.
    public static void main(String[] args){
        primeNumber();
    }

    public static void primeNumber(){
        Scanner userInput = new Scanner(System.in);
        int primeNumberInputs;
        int loopCounter;
        int primeNumberCounter = 0;
        System.out.println("Hey Mate!! Enter a positive Integer to check " +
                "if it's a Prime Number");
        primeNumberInputs = userInput.nextInt();
        if(primeNumberInputs>0){
            for(loopCounter=1; loopCounter<=primeNumberInputs; loopCounter++){
                if(primeNumberInputs%loopCounter == 0){
                    //System.out.println(primeNumberInputs);
                    primeNumberCounter++;
                }
            }
            if(primeNumberCounter==2){
                System.out.println(primeNumberInputs + " is a Prime Number");
            }
            else{
                System.out.println(primeNumberInputs + " is not a Prime Number");
            }
        }
        else{
            System.out.println("Hey Mate!! You have not entered a positive number.");
        }
    }
}
