import java.util.Scanner;
public class ValidScores {
    //collect 5 score from the user and output total
    // Add only the valid scores between 0 and 100;
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int count;
            int total = 0;
            System.out.println("Enter 5 scores");
            for(count=0; count<5; count++){
                int scores = input.nextInt();
                if(scores >=0 && scores <= 100) {
                    total += scores;
                    System.out.println("The total is: " + total);
                }
                //else{
                //    System.out.println("Enter only valid scores from 0 to 100");
               // }
            }
        }
}
