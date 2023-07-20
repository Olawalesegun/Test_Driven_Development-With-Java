package numerals;

public class Main {
    public static void main(String[] args) {
        Octal numeral = new Octal();
        System.out.print("The octal value for 014 is:");
        Octal.print(numeral.getNumeralNumber1());
        System.out.print("The octal value for 067 is: ");
        Octal.print(numeral.getNumeralNumber2());
        System.out.print("The octal value for 01000 is: ");
        Octal.print(numeral.getNumeralNumber3());
        System.out.print("The octal value for 0677 is: ");
        Octal.print(numeral.getNumeralNumber4());
        System.out.print("The octal value for 0777 is: ");
        Octal.print(numeral.getNumeralNumber5());
        System.out.print("The octal value for 0655 is: ");
        Octal.print(numeral.getNumeralNumber6());
    }
}
