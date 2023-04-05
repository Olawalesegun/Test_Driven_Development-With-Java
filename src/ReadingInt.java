import java.util.Scanner;
public class ReadingInt {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a value");
        int iterateConditionValue = userInput.nextInt();
        int intSum = 0;
        while(intSum <= iterateConditionValue){
            System.out.println("Keep Entering a number");
            int num = userInput.nextInt();
            intSum += num;
            System.out.println(intSum);
        }
    }
}
