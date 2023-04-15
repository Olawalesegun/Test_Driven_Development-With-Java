import java.util.stream.IntStream;

public class Factorial {

    public static int factorialInput(int facNumber){
        int facResult;
            facResult = facNumber;
            while(facNumber!=1){
                facResult = facResult * (facNumber - 1);
                facNumber--;
            }
            return facResult;
             /*for(int i= 0; i<facNumber; i++){
               facResult = facResult * (facNumber - 1);
            }*/
    }

    /// A second approach to use is:
    /// since a factorial number is basically a number that multiplies
    // itself by all numbers below and behind it, just the same way
    // Prime numbers don't go beyond the actual numbers itself
    // We will be adopting similar approach to multiply all numbers existing
    // in a loop while taking out the zero option
    // because a multiplication of zeros will always equal to zero

    public static int factorialSecondApproach(int facNumberDeclared){
        int totalFacCollector = 1;
        for(int counterforFactorial = 1; counterforFactorial<=facNumberDeclared; counterforFactorial++){
            totalFacCollector = totalFacCollector * counterforFactorial;
        }
        System.out.println(totalFacCollector);
        return totalFacCollector;
    }
 /*   int totalFacCollector = IntStream.iterate(1, counterforFactorial -> counterforFactorial <= FacNumberDeclared, counterforFactorial -> counterforFactorial + 1).reduce(1, (a, b) -> a * b);
}*/

}
