package DataStructuresAndAlgorithm.oopRedefined;

import java.util.Arrays;

public class MyArrayList {

    private int sizeOfArray = 1;
    private Object[] array = new Object[sizeOfArray];
    private int counter;

    public boolean isEmpty(){
        return counter == 0;
    }
    public void add(Object firstElementAddedIntoArray) {
        if(counter >= sizeOfArray){
            Object[] newArrayToUse = Arrays.copyOf(array, array.length + 1);
            array = newArrayToUse;
        }
        array[counter] = firstElementAddedIntoArray;
        counter++;
    }

    public Object size() {
        //return counter;
        return array.length;
    }

    public void add(int index, Object element) {
        if(index >= sizeOfArray){
            Object[] newArrayToUse = Arrays.copyOf(array, array.length + 1);
            array = newArrayToUse;
        }
        for(int count = 0; count<array.length; count++){
            if(count == index){
                array[count] = element;
            }
            giveValuesToElementsInArray(array, element, index);
        }
        counter++;
    }

    public void giveValuesToElementsInArray(Object[] array, Object element, int index){
        this.array = array;
        for (int count = 0; count < array.length; count++) {
            if (count == index) {
                array[count] = element;
            }
        }
    }
    public Object get(int index){
        return array[index];
    }

    public String remove(int index) {
        Object newArray[] = new Object[array.length - 1];
        int counter = 0;
        for (int count = 0; count < array.length; count++) {
            if (count != index) {
                newArray[counter] = this.array[counter];
            }
            counter++;
        }
        System.out.println(Arrays.toString(newArray));
        return Arrays.toString(newArray);

    }
}
        /*Object[] newArray = new Object[0];
        if (index >= 0 && index < array.length - 1) {
            newArray = new Object[array.length - 1];
            int newArrayCounter = 0;
            //newArray = Arrays.copyOf(array, array[index] - index)
            for (int counter = 0; counter < array.length - 1; counter++) {
                if (counter != index) {
                    newArray[newArrayCounter] = array[counter];
                    newArrayCounter++;
                }
            }
        }
//        return Arrays.toString(newArray);*/
//    }



//}
