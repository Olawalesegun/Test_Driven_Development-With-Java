public class ReverseMultiplication {

    public int reverseMultiply(int number){
        int total = 1;
        for(int counter = 12; counter>=0; counter--){
            total = number * counter;
            //System.out.println(number + " * " + counter + " = " + total);
        }
        return total;

    }
}
