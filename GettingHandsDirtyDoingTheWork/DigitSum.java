public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigit(32123));

    }

    //Write a method  with the name sumDigits that has one int parameter called number.
    //If parameter is >=10 then the method should process the number and return sum of all digits,
    // otherwise
    // return -1 to indicate an invalid value
    //The numbers from 0-9 have 1 digit, so we don't want to process them,
    // also we don't want to process negative numbers, so also return -1 for negative numbers

    public static int sumDigit(int number){
        int total = 0;
        int extractedNumber;
        if(number<10){
            return -1;
        }
        while(number >= 10){
            extractedNumber = number % 10;
            number = number / 10;
            total += extractedNumber;
            if(number<10){
                total = total + number;
            }
        }
        return total;




        //A static approach of doing things which could result to delay, bug and inefficiency also.
      /*  if(number >= 10){
            extractedNumber = number % 10;
            number = number / 10;
            total += extractedNumber;
            if(number > 10){
                number = number % 10;
                total += extractedNumber;
            }
            else{
                return -1;
            }
        }
        else return -1;*/
    }
}
