import java.util.Scanner;
public class TaxCalc {
    Scanner userInput = new Scanner(System.in);

    public void calcTax(){
        int countCondition = 3;
        for(int count=1; count<=countCondition; count++ ){
            System.out.println("Enter your name");
            String name = userInput.next();
            System.out.println("Enter your earnings" + name);
            double amountEarned = userInput.nextInt();
            double firstCeiling = 30000;
            double firstPercent = 15/100;
            double secondPercent = 20/100;
            if(amountEarned<=firstCeiling){
                double result = firstPercent * amountEarned;
                System.out.println("Hi" + name + "Your tax is: " + result);
            }
            else if (amountEarned>firstCeiling){
                double result = amountEarned * secondPercent;
                System.out.println("Hi" + name + "Your tax is: " + result);
            }
        }
        userInput.close();
    }




    public double calculus(double amount){
        double condition = 30000;
        double firstPercent = (double) 15/100;
        double secondPercent = (double) 20 /100;
        double result=1;
        if(amount<=condition){
            result = amount * firstPercent;
            System.out.println("Your Tax is: " + result);
        }
        else if(amount>condition){
            result = amount * secondPercent;
            System.out.println("Your tax is: " + result);
        }
        else{
            System.out.println("You have not stayed within the window my friend!!!");
        }
    return result;
    }
}
