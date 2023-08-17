import java.util.stream.Collectors;

public class Regex {

    public static boolean findMatch(String text, String pattern) {
        boolean result = false;
        if(text.contains(pattern)){
            result= true;
        }
        return result;
    }

    /*public void findMostFrequentCharacter(String input){
        input.chars().boxed().collect(Collectors.toMap(Char*/
}
