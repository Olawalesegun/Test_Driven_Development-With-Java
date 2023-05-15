public class Rev {
    private int[] array = new int[5];
    private int[] newReversedArray = new int[5];

    public void setArray(int[] array){
        for(int index = 0; index<array.length; index++) {
            this.array[index] = array[index];
        }
    }
    public int[] collectArrayIntoAMethodOrMutateItsState(){
        return array;
    }

    public void reverseArray(){
        int[] newArray = collectArrayIntoAMethodOrMutateItsState();
        int arraySize = newArray.length;
        int arraySizeForIndex = arraySize - 1;
        int indexForNewArray = 0;
        for(int indexInArray = arraySizeForIndex; indexInArray >= 0; indexInArray--){
            newReversedArray[indexForNewArray] = newArray[indexInArray];
        }
    }
    public int[] collectReverseArray(){
        return newReversedArray;
    }
}
