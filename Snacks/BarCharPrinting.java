import java.util.Scanner;
public class BarCharPrinting {

    public static void main(String[] args) {
        barChartprint();
    }
    //read 5 numbers
    //between 1 and 30
    // for each number read, display number of asterisk

    public static void barChartprint(){
        Scanner userInput = new Scanner(System.in);
        int numberArray[] = new int[0];
        int count =0;
        int loopKill = 1;
        while(loopKill != 0) {
            System.out.println("Enter 5 numbers: ");
            numberArray[count] = userInput.nextInt();
            count++;
        }
        if(count==1){
            for(int j=1; j<numberArray[count]; j++){
                System.out.print("*");
            }
        }
        if(count==2){
            for(int j = 1; j<=numberArray[count]; j++){
                System.out.print("*");
            }
        }
        if(count==3){
            for(int j=1; j<=numberArray[count]; j++){
                System.out.print("*");
            }
        }
        if(count==4){
            for(int j=1; j<=numberArray[count]; j++){
                System.out.print("*");
            }
        }
        if(count==5){
            for(int j=1; j<=numberArray[count]; j++){
                System.out.print("*");
            }
        }
        System.out.println("To halt this, enter 0");
        loopKill = userInput.nextInt();
    }
    }

