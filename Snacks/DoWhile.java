
import java.util.Scanner;
public class DoWhile {
    static Scanner userInput = new Scanner(System.in);
    public static void main(String... args){
        doWhileMethod();
    }
    public static void doWhileMethod(){
        int collect1, collect2;
        int total;
        int value = 1;
        do{
            System.out.println("Enter Two numbers to get their sum\n" +
                    "Now, you can enter the first number: ");
            collect1 = userInput.nextInt();
            System.out.println("Kindly Enter the second Number: ");
            collect2 = userInput.nextInt();
            if(collect1 > 0 && collect2 > 0){
                total = collect1 + collect2;
                System.out.printf("The summation of the 2 values are: %d%n", total);
                System.out.println("To quit this, enter a value less than 1\n" +
                        "To continue enter a value equal to or greater than 1");
                value = userInput.nextInt();
            }
            else{
                System.out.println("Hey Mate, kindly enter a number greater than 0");
            }
        }while(value>0);
    }
}
