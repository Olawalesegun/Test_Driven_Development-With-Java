import java.util.stream.Collectors;

public class Regex {

    public static boolean findMatch(String text, String pattern) {
        boolean result = text.matches(pattern);
        return result;
       /* boolean result = false;
        if(text.contains(pattern)){
            result= true;
        }
        return result;*/
    }
    public static boolean validatePhoneNumber(String phoneNumber){
        String regex = "((^234)[0-9]{10})/((^0)\\d{10})"; // actual one to use coz it passed all test cases
       // String regx = "^[+2340-]*?\\d{10}";
        boolean result = phoneNumber.matches(regex);
        return result;
    }

    /*public void findMostFrequentCharacter(String input){
        input.chars().boxed().collect(Collectors.toMap(Char*/
}
