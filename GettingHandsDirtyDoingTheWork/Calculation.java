public class Calculation {
    // Create a Method called isEvenNumber that takes a parameter of type int.
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;

    public static void main(String[] args){
        System.out.println(isEvenNumber(4));

        //Print Even numbers from 1 to 20
        int noOfTimeItLoopedForOdd = 0;
        int noOfTimeItLoopedForEven = 0;
        for(int i = 1; i<=21; i++){
            if(!isEvenNumber(i)){
                noOfTimeItLoopedForOdd++;
                System.out.println("The number of times it looped for Odd numbers: " + noOfTimeItLoopedForOdd);
                continue;
            }
            else{
                System.out.println("Even numbers are: " + i);
                noOfTimeItLoopedForEven++;
                if(noOfTimeItLoopedForEven>5){
                    System.out.println("The number of times it looped for Even numbers: " + noOfTimeItLoopedForEven);
                    break;
                }
            }

        }
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
