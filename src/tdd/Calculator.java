package tdd;

public class Calculator {

    public int add(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNo, int secondNo){
        if (firstNo > secondNo) return firstNo - secondNo;
        if(firstNo < secondNo) return secondNo - firstNo;
        return firstNo - secondNo;
    }

    public int multiply(int firstNo, int secondNo){
        return firstNo * secondNo;
    }
    public int division(int firstNo, int secondNo){
        return firstNo / secondNo;
    }

    public int modulus(int firstNo, int secondNo){

        if (secondNo > firstNo) return firstNo % secondNo;
        if(firstNo < secondNo) return secondNo % firstNo;
        return firstNo % secondNo;
    }
    public int raiseToPower(int firstNo, int raise){

        for (int j = 0; j < raise; j++) {
            firstNo += firstNo;
        }
        return firstNo;
    }
    public double squareRoot(double firstNo){
        double firstN = firstNo / 2;
        return firstN;
    }
}
