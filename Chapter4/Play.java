import java.util.Scanner;

public class Play {
    Scanner userInput = new Scanner(System.in);
    public String check2largestNum(){

        int condition = 10;
        int number = 0;
        int largestNumber = 0;
        int secondLargestNumber = 0;
        for(int countCondition=0; countCondition<condition; countCondition++){
            System.out.println("Enter a number: ");
            number = userInput.nextInt();
            if(number>largestNumber){
                largestNumber = number;
            } else if (number<largestNumber && number > secondLargestNumber) {
                secondLargestNumber = number;
            }
        }
        return secondLargestNumber + " " + largestNumber;
    }
}
