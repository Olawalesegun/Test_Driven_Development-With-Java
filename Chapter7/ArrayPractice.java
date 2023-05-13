public class ArrayPractice {

    private int[] arrayCollectedForUse;
    private int total;
    public void setArrayCollectedForUse(int...arrayCollectedForUse){
        this.arrayCollectedForUse = arrayCollectedForUse;
    }
    public int[] getArrayCollectedForUse(){
        return arrayCollectedForUse;
    }

    public double findSumOfArray(int...arrayCollectedThroughParameter){
        arrayCollectedForUse = arrayCollectedThroughParameter;
        int[] newArrayDeclared = new int[arrayCollectedForUse.length];
        for(int indexedNumberOfArrayForLoop1 = 0; indexedNumberOfArrayForLoop1<arrayCollectedForUse.length; indexedNumberOfArrayForLoop1++){
            newArrayDeclared[indexedNumberOfArrayForLoop1] = arrayCollectedForUse[indexedNumberOfArrayForLoop1];
        }
        for(int indexedNumberOfArrayForLoop2= 0; indexedNumberOfArrayForLoop2<newArrayDeclared.length; indexedNumberOfArrayForLoop2++){
            total += newArrayDeclared[indexedNumberOfArrayForLoop2];
        }
        return total;
    }

    public double getAverage(){
        double averageGottenFromTotal = (double)total/ arrayCollectedForUse.length;
        return averageGottenFromTotal;
    }
}
