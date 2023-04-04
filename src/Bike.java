import java.util.Scanner;
public class Bike {
    public static void main(String[] args){
        int shol = 0;
        while(shol>5){
            shol++;
            if( shol==3){
                continue;

            }
            System.out.println(shol);
        }

        Scanner userInput = new Scanner(System.in);
        int trip;
        trip = userInput.nextInt();
        while(trip!=1){
                System.out.println("Hi Mate!! Kindly enter the miles covered for each trip");
                int miles = userInput.nextInt();
                System.out.println("\nHi Mate!! Kindly enter the gallon bought for each trip");
                int gallon = userInput.nextInt();
                float milesPerGallon;
                milesPerGallon = miles/gallon;
                System.out.print(milesPerGallon);
                System.out.println();
                float combinedMiles = 0;
                combinedMiles += milesPerGallon;
                System.out.printf("The combined miles per gallon is: %f%n", combinedMiles);
                System.out.println("To halt the method enter 1");
                trip = userInput.nextInt();
        }
    }
}