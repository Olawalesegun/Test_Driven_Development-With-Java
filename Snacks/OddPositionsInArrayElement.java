import java.util.Arrays;

public class OddPositionsInArrayElement {

    private int[] array = new int[6];

    private int[] elementAtOddIndex = new int[array.length];
    public void setArray(int[] arrayCollected) {
        array = arrayCollected;
    }
    public int[] collectArray(){
        return array;
    }

    public void extractElementsAtIndex() {
        for(int indexThroughArray = 0; indexThroughArray<collectArray().length; indexThroughArray++){
            if(indexThroughArray % 2 != 0){
                System.out.println(collectArray()[indexThroughArray]);
                elementAtOddIndex[indexThroughArray] = collectArray()[indexThroughArray];
            }
        }
    }

    public String returnExtractOddElementOutOfArray() {
        return Arrays.toString(elementAtOddIndex);
    }

}
