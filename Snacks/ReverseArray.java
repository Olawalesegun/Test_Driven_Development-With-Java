public class ReverseArray {
    private int[] array = new int[11];
    private int[] newReversedArray = new int[11];
    public void setArray(int[] array){
        for(int index = 0; index<array.length; index++){
            this.array[index] = array[index];
        }
    }
    public int[] collectArrayIntoAMethodOrMutateItsState(){
        return array;
    }
    public void reverseArray(){
        int[] newArray = collectArrayIntoAMethodOrMutateItsState();
        for(int indexInArray = array.length; indexInArray< newArray.length; indexInArray--){
            newReversedArray[indexInArray] = indexInArray;
        }
    }
    public int[] collectReverseArray(){
        return newReversedArray;
    }
}
