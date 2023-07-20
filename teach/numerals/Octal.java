package numerals;

public class Octal {

    final private static int numeralNumber1 = 014;
    final private static int numeralNumber2 = 067;
    final private static int numeralNumber3 = 01000;
    final private static int numeralNumber4 = 0677;
    final private static int numeralNumber5 = 0777;
    final private static int numeralNumber6 = 0655;


    public static void print(int num){
        System.out.println(num);
    }
    public int getNumeralNumber1(){
        return numeralNumber1;
    }
    public int getNumeralNumber2(){
        return numeralNumber2;
    }
    public int getNumeralNumber3(){
        return numeralNumber3;
    }
    public int getNumeralNumber4(){
        return numeralNumber4;
    }
    public int getNumeralNumber5(){
        return numeralNumber5;
    }
    public int getNumeralNumber6(){
        return numeralNumber6;
    }


    /*public static void main(String[] args) {
        Numerals num = new Numerals();
        print(num.getNumeralNumber());
    }*/
}
