public class HypotenuseCalculation {
    /*(Hypotenuse Calculations) Define a method hypotenuse that calculates the hypotenuse of
    a right triangle when the lengths of the other two sides are given. The method should take two ar-
    guments of type double and return the hypotenuse as a double. Incorporate this method into an
    application that reads values for side1 and side2 and performs the calculation with the hypotenuse
    method. Use Math methods pow and sqrt to determine the length of the hypotenuse for each of the
    triangles in Fig. 6.14. [Note: Class Math also provides method hypot to perform this calculation.]*/
    public static double hypotenuse(double side1, double side2){
        double side1Squared = side1 * side1;
        double side2Squared = side2 * side2;
        double sumOfSides = side1Squared + side2Squared;
        int numberOfTimesToLoop = 5;
        double squareRootValue = 2;
        for(int loopThroughIndexValue = 0; loopThroughIndexValue<= numberOfTimesToLoop; loopThroughIndexValue++){
             squareRootValue = (squareRootValue + (sumOfSides/ squareRootValue))/2;
        }
        return squareRootValue;
    }
    public static String convertMyFloatingNumberTo3Precision(double number){
        String formattedStringTo3Precision = String.format("%.3f",number);
        System.out.println(formattedStringTo3Precision);
        return formattedStringTo3Precision;
    }
}
