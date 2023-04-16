public class Multiplication {

    public static void main(String[] args) {
        multiplyTable(5);
    }
    public static int multiplyTable(int number){

        if(number > 0){
            int total = 1;
            int multiplyHighestValue = 12;
            for(int iteratingValue = 0; iteratingValue<=multiplyHighestValue; iteratingValue++){
                total = number * iteratingValue;
                // System.out.printf(number + " * " + iteratingValue + " = "+ total);
                //System.out.println();
            }
            return total;
        }
        else{
            return 0;
        }
    }
}
