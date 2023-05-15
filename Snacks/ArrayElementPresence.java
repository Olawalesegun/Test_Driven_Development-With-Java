public class ArrayElementPresence {
    private int[] array;
    String statusOfElementWhenChecked;

    public void collectArray(int[] arrayUsedForTesting) {
        array = arrayUsedForTesting;
    }

    public int[] mutateArrayStateWithArrayCollected() {
        return array;
    }
    public void checkElementInArray(int elementToCheckFor){
        int[] arrayCollectedAndUsed = mutateArrayStateWithArrayCollected();
        for(int indexedThroughArrayCollectedAndUsed = 0; indexedThroughArrayCollectedAndUsed<arrayCollectedAndUsed.length; indexedThroughArrayCollectedAndUsed++){
            if(arrayCollectedAndUsed[indexedThroughArrayCollectedAndUsed] == elementToCheckFor){
                System.out.println(elementToCheckFor + " is present in Array");
                statusOfElementWhenChecked = "Element Entered is present";
            }
            else{
                statusOfElementWhenChecked = "Element Entered is not present (Hence, absent!!!)";
            }
        }

    }
    public String returnStatusForElementEnteredWhenCheckedInArray(){
        return statusOfElementWhenChecked;
    }
}
