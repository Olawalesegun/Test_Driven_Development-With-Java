import java.util.Arrays;

public class EvenPositionsInArrayElement {

    int[] arrayCollector = new int[7];
    int[] arrayCollectingIndexAtEvenPositions = new int[arrayCollector.length];
    public void setArrayToInitializeValueToInstanceVariable(int[] arrayCollector) {
        this.arrayCollector = arrayCollector;
    }

    public int[] collectMutatedArray() {
        return arrayCollector;
    }

    public void checkForElementsOnEVenPositionsInArray() {
        int lengthOfArray = arrayCollector.length;
        for(int indexOfPositionsWithinArray = 0; indexOfPositionsWithinArray<lengthOfArray; indexOfPositionsWithinArray++){
            if(indexOfPositionsWithinArray % 2 == 0){
                arrayCollectingIndexAtEvenPositions[indexOfPositionsWithinArray] = collectMutatedArray()[indexOfPositionsWithinArray];
            }
        }
    }

    public String returnElementsOnEVenPositionsInArray() {
        return Arrays.toString(arrayCollectingIndexAtEvenPositions);
    }
}
