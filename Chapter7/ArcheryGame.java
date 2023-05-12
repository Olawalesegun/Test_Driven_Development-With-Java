import java.security.SecureRandom;
public class ArcheryGame {
    static SecureRandom secRand = new SecureRandom();
       /*
       7.20 (Archery Game) A group of four friends visit a sports club and they decide to practice ar-
       chery. Each player gets 3 chances and in every chance they can score between 0 to 10 points. The
        player with the maximum score after adding the scores obtained in all 3 chances wins. Write an ap-
        plication that simulates this game and prints the scores of all four players in a tabular format and
        also prints which player won.
        Each line in the table should contain the following:
                1) The player number
                2) Their first chance score
                3) Their second chance score
                4) Their third chance score
                 5) Their score after all three chances
        Use multidimensional arrays to store the scores of players in each chance.
        Use the secure random-number generation mechanism learnt in the previous chapter to generate
        scores between 0 and 10 for each player chance.*/

    //  TODO:
    //  1. Declare class
    //  2. int[][] archeryFriendsScore = new int[4][3];
    //  3. int[][] archery = new
    //  4. archeryFriendsScore[i][j]: Ensure they can only enter between 0 to 10points
    //  5. a for loop that loops through based on the number of times they can loop through(length of their container) and secure a random number
    //  6. Sum the score or secured values gotten foreach array index, which represents individuals..

   /* public void getPlayerSum(int[][] array){
        Se
    }*/
   public static void main(String[] args) {
       int[][] archGame = {
               {1,2,3,},
               {7,8,9},
               {7,2,1},
               {6,4,3}
       };
       playerIndex(archGame);
   }
    public static void playerIndex(int[][] array) {
        //int[] totalArray;
        int total1 = 0;
        int total2 = 0, total3 = 0;
        for (int counter = 0; counter < array.length; counter++) {
            for (int counter2 = 0; counter2 < 3; counter2++) {
                array[counter2][counter2] = secRand.nextInt(1, 11);
                if (counter == 0 && counter2 <= 3) {
                    total1 = total1 + array[counter][counter];
                }
                if (counter == 1 && counter2 <= 3) {
                    total2 += array[counter][counter2];
                }
                if (counter == 2 && counter2 <= 3) {
                    total3 += array[counter][counter2];
                }
               // System.out.print("Player" + counter + 1 +"\t"+array[0][0]+"\t");
            }
            //System.out.println();
        }
        /*System.out.println("Player Number\t First Chance Score\t Second Chance Score\tThird Chance Score");
        System.out.println("Player 1 \t"+array[0][0]+"\t"+array[0][1]+"\t"+array[0][2]);*/
        if(total1 > total2 && total1 > total3){
            System.out.println("The player with the maximum score is Player 1 with: " + total1);
        }
        else if(total2 > total1 && total2 > total3){
            System.out.println("The player with the maximum score is Player 2 with: " + total2);
        }
        else if(total3 > total1 && total3 > total2){
            System.out.println("The player with the maximum score is Player 3 with: " + total3);
        }
        else{
            System.out.println("These numbers are even");
        }
    }
}
