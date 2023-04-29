import java.util.Scanner;
public class TwoLargestNumber {

    /*   4.23 (Find the Two Largest Numbers) Using an approach similar to that for Exercise 4.21, find
    the two largest values of the 10 values entered. [Note: You may input each number only once.]*/
    Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        TwoLargestNumber twoL = new TwoLargestNumber();
        twoL.get2LargestNumber();
    }
    public void get2LargestNumber(){
        int condition = 10;
        int numEntered;
        int max1 = 0;
        int min = Integer.MIN_VALUE;
        int max2 = 0;
        for(int count=1; count<condition; count++){
            System.out.println("Enter a number: ");
            numEntered = userInput.nextInt();
            if(numEntered>max1) {
                max2 = max1;
                max1 = numEntered;
            }
            if(max1>numEntered) {
                min = numEntered;
            }
        }
        System.out.println("The Largest num is " + max1 + " " + max2 +
                " While min is: "+ min);
    }
}



























































//if()
           /* if(min<max1){
                min = numEntered;
            }*/
            /*if
                (numEntered>max1 && numEntered< min){
                max2 = numEntered;
            }*/