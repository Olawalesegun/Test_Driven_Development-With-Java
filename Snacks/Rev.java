public class Rev {
    private int[] array = new int[5];
    private int[] newReversedArray = new int[5];

    public static void main(String[] args) {
        Rev rev = new Rev();
        int[] originalArray = {1, 2, 3, 4, 5};
        rev.setArray(originalArray);
        rev.collectArrayIntoAMethodOrMutateItsState();
        rev.reverseArray();
    }

    public void setArray(int[] array){
        for(int index = 0; index<array.length; index++) {
            this.array[index] = array[index];
        }
        Object
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
            System.out.println(arraySizeForIndex + " " + arraySize);
            newReversedArray[indexForNewArray] = newArray[indexInArray];
        }
    }
    public int[] collectReverseArray(){
        return newReversedArray;
    }
}
