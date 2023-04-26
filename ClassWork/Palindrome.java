public class Palindrome {
    public String palindromeCheck(String string) {
        int requirement = 5;
        String newChar = null;
        String newChar2 = "";
        if (string.length() == requirement) {
            for (int count = 0; count < string.length(); count++) {
                newChar += string.charAt(count);
            }
            for (int count = 4; count >= 0; count--) {
                newChar2 += newChar.charAt(count);
            }
            if (newChar2.equals(newChar)) {
                System.out.println("The string entered is a palindrome");
            } else {
                System.out.println("The string entered is not a palindrome");
            }
        } else {
            System.out.println("My Dear Brother stop playing and get serious with life");
        }
        return newChar2;
    }
}
