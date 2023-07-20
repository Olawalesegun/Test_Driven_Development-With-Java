package numerals;

public class Main {
    public static void main(String[] args) {
        Octal numeral = new Octal();
        HexaDecimal hex = new HexaDecimal();
        Base2 base2 = new Base2();

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

        System.out.println("===================================");

        System.out.println("The hexadecimal value for 0x64");
        HexaDecimal.print(hex.getHexNum1());
        System.out.println("The hexadecimal value for 0x99");
        HexaDecimal.print(hex.getHexNum2());
        System.out.println("The hexadecimal value for 0x899");
        HexaDecimal.print(hex.getHexNum3());

        System.out.println("=====================================");

        System.out.println("The base 2 value for 0b1111");
        Base2.print(base2.getNumber1());
        System.out.println("The base 2 value for 0b1000");
        Base2.print(base2.getNumber2());
    }
}
