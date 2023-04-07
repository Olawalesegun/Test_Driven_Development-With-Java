import java.util.Scanner;
public class Scores {

    //collect 5 score from the user and output total
    // Add only the valid scores between 0 and 100;
    //give me the average  and the sum
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int count;
        int total = 0;
        System.out.println("Enter 5 scores");
        for(count=0; count<5; count++){
            int scores = userInput.nextInt();
            total += scores;
            System.out.println("The total is: " + total);
        }
    }
}
