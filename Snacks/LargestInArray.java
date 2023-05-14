public class LargestInArray {
    private int[] array;
    private int largestNumberInArray;

    public void collectArrayIntoClass(int[] array){
        this.array = array;
    }
    public int[] passingArrayToACallerMethodOrMutateInstanceVariable(){
        return array;
    }
    public void solveForLargestNumber(){
        int[] arrayValuesCollectedFromAGetter = passingArrayToACallerMethodOrMutateInstanceVariable();
        largestNumberInArray = arrayValuesCollectedFromAGetter[0];
        for(int indexedNumberLoopingThroughArray = 0; indexedNumberLoopingThroughArray<arrayValuesCollectedFromAGetter.length; indexedNumberLoopingThroughArray++){
            if (arrayValuesCollectedFromAGetter[indexedNumberLoopingThroughArray] > largestNumberInArray){
                largestNumberInArray = arrayValuesCollectedFromAGetter[indexedNumberLoopingThroughArray];
            }
        }
    }
    public int collectLargestNumber(){
        return largestNumberInArray;
    }
}
