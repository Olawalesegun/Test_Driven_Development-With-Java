import java.text.DecimalFormat;
public class ValueOfPie {
    /*5.20 (Calculating the Value of π) Calculate the value of π from the infinite series
    π = 4 – 4/3 + -- – -- + -- – ----- + …
    Print a table that shows the value of π approximated by computing the first 200,000 terms of this
    series. How many terms do you have to use before you first get a value that begins with 3.14159?*/
    DecimalFormat decForm = new DecimalFormat("#.#####");
    public static void main(String[] args) {
        ValueOfPie valP = new ValueOfPie();
        valP.calcValueOfPie();
    }
    public void calcValueOfPie(){
        int conditionForComputingSeries = 200_000;
        //double numberToRunComputingFor = 4.0;
        final double numerator = 4.0;
        int denominator = 3;
        double result = 0;
        int counter = 0;
        for(int count=1; count<=conditionForComputingSeries; count++) {
            if (denominator % 2 == 1) {
                result -= (double)(numerator / denominator);
               /* numberToRunComputingFor -= 4 - result;*/
                String resultConverted = decForm.format(result);
                System.out.println("Here is the result when converted to 5 decimal place: " + resultConverted);
                System.out.println(numerator + "/" + denominator + "=" + result);
                if (String.format("%.5f", result).startsWith("3.14159")) {
                    System.out.println("The result is now: " + result + " hence it will now break");
                    counter++;
                    System.out.println("counter is: " + counter);
                    break;
                }
                denominator = denominator + 2;
            }


        }
    }
}
