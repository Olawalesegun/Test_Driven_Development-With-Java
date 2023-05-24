package creditCardValidator;
import java.util.Scanner;
public class CreditCardValidate {

    static Scanner userInput = new Scanner(System.in);
    private static final CreditCardTemplate creditCard =  new CreditCardTemplate("Master-Card",
            "4388576018402626", "Valid" );

    public static void main(String[] args) {
        System.out.println("Hello, Kindly Enter Card details to verify");
        String input = userInput.nextLine();
        creditCard.setCardNumber(input);
        String cred = creditCard.getCardNumber();
        System.out.println("Credit Card Type: " + confirmCreditCardPatterns(cred));
        System.out.println("Credit Card Number: " + cred);
        System.out.println("Credit Card Digit Length: " +creditCard.getCardDigitLength());

    }
    public static String confirmCreditCardPatterns(String creditCardParameter){
        int lengthOfParameter = creditCardParameter.length();
        String typeOfCard = " ";
       if(lengthOfParameter>13 && lengthOfParameter < 16){
           if(creditCardParameter.startsWith("4")) typeOfCard = "Visa-Card";
           else if (creditCardParameter.startsWith("5")) typeOfCard = "Master-Card";
           else if(creditCardParameter.startsWith("37")) typeOfCard = "American-Express-Cards";
           else if(creditCardParameter.startsWith("6")) typeOfCard = "Discover Cards";
           else typeOfCard = "Kindly input the right Card";
       }
       return typeOfCard;
    }
}
