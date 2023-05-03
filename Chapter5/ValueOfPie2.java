import java.text.DecimalFormat;
public class ValueOfPie2 {
    /*5.20 (Calculating the Value of π) Calculate the value of π from the infinite series
    π = 4 – 4/3 + -- – -- + -- – ----- + …
    Print a table that shows the value of π approximated by computing the first 200,000 terms of this
    series. How many terms do you have to use before you first get a value that begins with 3.14159?*/

    public static void main(String[] args) {
        ValueOfPie2 valP = new ValueOfPie2();
        valP.calcValueOfPie();
    }

    public void calcValueOfPie(){
        int conditionForComputingSeries = 200_000;
        double numberToRunComputingFor = 4.0;
        int denominator = 0;
        double result = 4.0;
        int counter = 0;
        DecimalFormat decForm = new DecimalFormat("#.#####");

        for(int count = 3; count <= conditionForComputingSeries; count += 2) {
            denominator = count;
            numberToRunComputingFor -= (double)(4.0 / denominator);
            result += numberToRunComputingFor;

            String resultConverted = decForm.format(result);
            System.out.println(result + " after " + (count - 1) / 2 + " iterations");

            if (result > 3.14158 && result < 3.1416) {
                System.out.println("The result is now: " + result + " hence it will now break");
                break;
            }

            counter++;
        }
        System.out.println("Number of terms used: " + counter);
    }
}
