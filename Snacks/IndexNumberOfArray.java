public class IndexNumberOfArray {
    private int[] arrayToBeUsedInCalculation;
    public void setArrayValues(int[] arrayToBeUsedInCalculation) {
        this.arrayToBeUsedInCalculation = arrayToBeUsedInCalculation;
    }

    public int[] collectArrayValues() {
        return arrayToBeUsedInCalculation;
    }

    public int returnIndexValueOFArray(int i) {
        int returnedValue = 0;
        for(int index = 0; index<arrayToBeUsedInCalculation.length; index++){
            if(index == i){
                returnedValue = arrayToBeUsedInCalculation[index];
            }
        }
        return returnedValue;
    }
}
