import java.util.Scanner;
public class NaturalNumbers {

    public static void main(String[] args){
        //Write a program to print the sum of first 10 natural number.
        Scanner userInput = new Scanner(System.in);
        int total = 0;
        System.out.println("Kindly Enter 1 as a first Natural number");
        int naturalNumber = userInput.nextInt();
        if(naturalNumber==1 ){
            for(;naturalNumber<=10; naturalNumber++){
                total += naturalNumber;
            }
            System.out.println("The total is: "+ total);
        }
        else{
            System.out.println("Hey, My Friend!! " +
                    "To print the first 10 Natural number" +
                    " Kindly enter 1");
        }

    }
}
