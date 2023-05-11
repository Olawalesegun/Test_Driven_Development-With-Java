public class Roundss {

  /*  (Rounding Numbers) To round numbers to specific decimal places, use a statement like
    double y = Math.floor(x * 10 + 0.5) / 10;
    which rounds x to the tenths position (i.e., the first position to the right of the decimal point), or
    double y = Math.floor(x * 100 + 0.5) / 100;
    which rounds x to the hundredths position (i.e., the second position to the right of the decimal point).
            Write an application that defines four methods for rounding a number x in various ways:
    a) roundToInteger(number)
    b) roundToTenths(number)
    c) roundToHundredths(number)
    d) roundToThousandths(number)
    For each value read, your program should display the original value, the number rounded to the
    nearest integer, the number rounded to the nearest tenth, the number rounded to the nearest hun-
    dredth and the number rounded to the nearest thousandth.*/
  /*public static void main(String[] args) {
      roundToInteger(37);
  }*/
  public static void main(String[] args) {
      roundToInteger(4.8);
      roundToTenths(76.98);
  }
   public static double roundToInteger1(double number){
      double result = Math.floor(number + 0.5);
      System.out.println("Result for rounding to Integer is: " + result);
      return result;
    }
    public static double roundToTenths(double number){
      double result = Math.floor(number * 10 + 0.5)/10;
      System.out.println("Result for rounding to Tenths is: " + result);
      return result;
    }
    public static double roundToHundredths(double number){
      double result = Math.floor(number * 100 + 0.5)/100;
      System.out.println("Result for rounding to Hundredths is: " + result);
      return result;
    }
    public static double roundToThousandths(double number){
      double result = Math.floor(number * 1000 + 0.5)/1000;
      System.out.println("Result for rounding " + number + " to hundredths is: " + result);
      return result;
    }
  //    Second approach for me to do this is to devise a program that does the function of Math.floor in the program
    public static int roundToInteger(double number){
      if(number - (int)number == 0){
          int numModulusValue = (int)(number % 10);
          int numActualValueWhenDivided = (int) (number / 10);
          int numResult;
          if(numModulusValue >= 5){
              numResult = numActualValueWhenDivided + 1;
          }else{
              numResult = numActualValueWhenDivided;
          }
      }
     int num = (int)(number % 10);
//        double num = number * 10;
//        num /= 10;
//        int numModulusResult = (int)num % 10;
//        System.out.println(num + "--" + numModulusResult);
        System.out.println(num + "--");
        //if(num >= 5)

       /* if(tenthValue == 10){
            double num2 = number * tenthValue;
            num2 = num2 + number3;
            num2 = num2 / 10;
        }*/
    return num;
    }


    public static double roundDown(double num1, int tenth, int num2){
        double num = num1 * tenth;
        num += num2;
        if((num < 0) && tenth == 10){
            num = num * tenth;
            num = num - 1;
            num = num / tenth;
        }
        else{
            num = num * tenth;
            num = num / tenth;
        }
        /*if*/
        return num;
    }
    /*public static double roundDown(double num1, int tenth, int num2) {
        double num = num1 * tenth;
        num += num2;
        if ((num < 0) && tenth == 100) {
            num = num * tenth;
            num = num - 1;
            num = num / tenth;
        } else {
            num = num * tenth;
            num = num / tenth;
        }
        return num;
    }*/
}
