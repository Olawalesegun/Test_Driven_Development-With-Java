package creditCardValidator;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a credit card number: ");
        String creditCardNumber = scanner.nextLine();

        // This line removes any of characters that are not digits
        // I know Chibuzo asks us to ensure our codes are so clean that we don't need to comment it
        // to help anyone understand what we did here, however I needed to clarify this part
        String cleanedNumber = creditCardNumber.replaceAll("\\D", "");

        if (isValidCreditCardAdded(cleanedNumber)) {
            String cardType = getCardType(cleanedNumber);
            System.out.println("Credit card type: " + cardType);
            System.out.println("Validity: Valid");
        } else {
            System.out.println("Credit card type: Unknown");
            System.out.println("Validity: Invalid");
        }
    }
    public static boolean isValidCreditCardAdded(String creditCardNumber) {
        // Check if the number is between 13 and 16 digits long
        int length = creditCardNumber.length();
        if (length < 13 || length > 16) {
            return false;
        }
        int sum = 0;
        boolean doubleDigit = false;

        for (int i = length - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(creditCardNumber.charAt(i));
            if (doubleDigit) {
                digit *= 2;
                if (digit > 9) {
                    digit = digit % 10 + 1;
                }
            }
            sum += digit;
            doubleDigit = !doubleDigit;
        }
        return sum % 10 == 0;
    }
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
