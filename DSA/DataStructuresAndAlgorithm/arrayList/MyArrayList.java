package DataStructuresAndAlgorithm.oopRedefined;

import java.util.Arrays;

public class MyArrayList {

    private int sizeOfArray = 1;
    private Object[] array = new Object[sizeOfArray];
    private int sizeOfOldArray = array.length;
    private int counter;
    private Object[] newArray = new Object[array.length - 1];

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
        return counter;
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

    public Object getNewSize(){
        if (newArray != null) {
            return newArray.length;
        } else {
            return 0;
        }
    }

    public void remove(int index){
        if(index >= 0 && index<sizeOfOldArray-1){
            Object[] modifiedArray = new Object[array.length - 1];
            counter = 0;
            //newSize = array.length
            for(int count = 0; count<array.length-1; count++){
                if(index != count){
                    modifiedArray[counter] = array[count];
                    counter++;
                }
            }
            newArray = modifiedArray;
        }
    }
    public String getElementsOfNewArray(){
        return Arrays.toString(newArray);
        //return Arrays.copyOf(newArray, newArray.length);
        //return newArray;
    }

    public void set(int index, Object element) {
        newArray = new Object[array.length - 1];
        if (index >= 0 && index < sizeOfOldArray - 1) {
            newArray[index] = element;
        }
    }
    public void clear(){
         newArray = new Object[0];
    }
    public int indexOf(Object element) {
        int indexNumber = 0;
        for (int count = 0; count < array.length; count++) {
            if (array[count] == element) {
                indexNumber = count;
            }

        }
        return indexNumber;
    }

    /*public void remove(int index) {
        Object newArray[] = new Object[array.length - 1];
        if(index >=0 && index<array.length - 1){
            int counter = 0;
            for (int count = 0; count < array.length; count++) {
                if (count != index) {
                    newArray[counter] = array[count];
                }
                counter++;
            }
        }
    }*/
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
