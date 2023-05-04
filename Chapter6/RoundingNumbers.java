public class RoundingNumbers {
   /* (Rounding Numbers) Math.floor can be used to round values to the nearest integer—e.g.,
    double y = Math.floor(x + 0.5); will round the number x to the nearest integer and assign the result to y.
    Write an application that reads double values and uses the preceding statement to round each of the
    numbers to the nearest integer. For each number processed, display both the original number and the
    `rounded number.*/


    public static int roundDown(double num1, double num2) {
        double num = num1 + num2;
        int numberForEvaluation = 10;
        if (num < 0) {
            num = num * numberForEvaluation;
            num = num / numberForEvaluation;
            num = num - 1;
        } else {
            num = num * numberForEvaluation;
            num = num / numberForEvaluation;
        }
        int convertNum = (int) num;
        System.out.println("The original numbrr is: " + num1 + "\nWhile the rounded number is: " + convertNum);
        return convertNum;
    }

    public static double roundDown(double num1, int tenth, int num2) {
        double num = (double) (num1 * tenth);
        num += num2;
        if ((num < 0) && tenth == 10) {
            num = num * tenth;
            num = num - 1;
            num = num / tenth;
        } else {
            num = num * tenth;
            num = num / tenth;
        }
        System.out.println("Here are the values, num1: " + num1 + "tenth: " + tenth + "num2: " + num2);
        return num;
    }
}
  /*  public static double roundDown(double num1, int tenth, int num2){
        double num = num1 * tenth;
        num += num2;
        if((num < 0) && tenth == 100){
            num = num * tenth;
            num = num - 1;
            num = num / tenth;
        }
        else{
            num = num * tenth;
            num = num / tenth;
        }
        return num;
      }
}*/
