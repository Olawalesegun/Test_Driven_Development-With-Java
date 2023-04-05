public class Calculation {
    // Create a Method called isEvenNumber that takes a parameter of type int.
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;

    public static void main(String[] args){
        System.out.println(isEvenNumber(4));
    }

    public static boolean isEvenNumber(int number){
        boolean indicator;
        if (number % 2 != 0) {
            indicator = false;
        } else {
            indicator = true;
        }
        return indicator;
    }
}
