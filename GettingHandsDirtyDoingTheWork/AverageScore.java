import java.util.Scanner;

public class AverageScore {

    //collect 5 score from the user and output total
    // Add only the valid scores between 0 and 100;
    //give me the average  and the sum
    // keep entering number from me until I have 5 valid score and give me the total
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int count;
        int total = 0;
        int count2 = 0;
        int average = 0;
        System.out.println("Enter 5 scores");
        for(count=0; count<5; count++){
            int scores = input.nextInt();
            if(scores >=0 && scores <= 100) {
                total += scores;
                count2++;
            }
        }
        average = total / count2;
        System.out.println("The average is: " + average);
    }
}
