package creditCardValidator;

import java.util.Scanner;

public class CreditCard {

    public static String getCardType(String creditCardNumber) {
        if (creditCardNumber.startsWith("4")) {
            return "Visa";
        } else if (creditCardNumber.startsWith("5")) {
            return "MasterCard";
        } else if (creditCardNumber.startsWith("37")) {
            return "American Express";
        } else if (creditCardNumber.startsWith("6")) {
            return "Discover";
        } else {
            return "Unknown";
        }
    }
}
