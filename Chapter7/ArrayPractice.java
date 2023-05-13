public class ArrayPractice {

    private int[] arrayCollectedForUse;
    private int total;
    public void setArrayCollectedForUse(int...arrayCollectedForUse){
        this.arrayCollectedForUse = arrayCollectedForUse;
    }
    public int[] getArrayCollectedForUse(){
        int[] arrayCollectedForUse1 = arrayCollectedForUse;
        return arrayCollectedForUse1;
    }

    public double findSumOfArray(int...arrayCollectedThroughParameter){
        arrayCollectedForUse = arrayCollectedThroughParameter;
        int[] newArrayDeclared = new int[arrayCollectedForUse.length];
        int total = 0;
        for(int indexedNumberOfArrayForLoop1 = 0; indexedNumberOfArrayForLoop1<arrayCollectedForUse.length; indexedNumberOfArrayForLoop1++){
            newArrayDeclared[indexedNumberOfArrayForLoop1] = arrayCollectedForUse[indexedNumberOfArrayForLoop1];
        }
        for(int indexedNumberOfArrayForLoop2= 0; indexedNumberOfArrayForLoop2<newArrayDeclared.length; indexedNumberOfArrayForLoop2++){
            total += newArrayDeclared[indexedNumberOfArrayForLoop2];
        }
        total = total;
        return total;
    }

    public double getAverage(int[] array){
        double averageGottenFromAverage = (double)total/ newArrayDeclared.length;
        return average;
    }
}
