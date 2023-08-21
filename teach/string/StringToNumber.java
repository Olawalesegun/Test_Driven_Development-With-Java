package string;

import java.util.Arrays;

public class StringToNumber {

    public static void main(String[] args) {
        String input = "hello";
        int sum = 0;
        int sum2 = 0;
        int[] numericValueOfElementInString = new int[input.length()];

        for (int counter = 0; counter < input.length(); counter++) {
            char extractedChar = input.charAt(counter);
            if (Character.isUpperCase(counter)) {
                extractedChar = Character.toLowerCase(extractedChar);
            }
            numericValueOfElementInString[counter] = (int)(input.charAt(counter) - 'a');
            System.out.println(Arrays.toString(numericValueOfElementInString));
            sum2 += numericValueOfElementInString[counter];
            System.out.println("The sum of this one is: " + sum2);
            int numericValue = extractedChar - 'a' + 1;
            sum += numericValue;
        }

        System.out.println("Numeric value of the string '" + input + "': " + sum);
    }
}
