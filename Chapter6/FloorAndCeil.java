public class FloorAndCeil {
/*
    (Floor and Ceil) Write two methods myFloor and myCeil that take a positive double num
    variable int myFloor(double num) and int myCeil(double num).
    The myFloor method takes num and returns the largest integer number that is less than or equal to x.
    The myCeil function takes num and finds the smallest number that is greater than or equal to x. Do
    not use any Math class methods. Incorporate this method into an application that sends a double
    value to the functions and tests their ability to calculate the required output.
*/

    public static int myFloor(double num){
        int numModulus10Result =0;
        int numDivideBy10Result = 0;
        int secondNumGottenFromSecondEvaluation = 0;
        if(num > 0){
           num = num * 10;
           numModulus10Result = (int) (num % 10);
           numDivideBy10Result = (int) (num/10);
           num = numDivideBy10Result;
          /* if(numModulus10Result > 10){
               numModulus10Result / 10;
           }*/
        }else{
            System.exit(0);
          /*  num = num * 10;
            numDivideBy10Result = (int) (num/10);
            num = numDivideBy10Result - 1;*/
        }
        return (int)num;
    }


}
