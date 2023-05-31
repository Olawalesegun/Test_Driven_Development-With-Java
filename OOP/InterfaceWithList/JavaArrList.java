/*
package InterfaceWithList;

import java.util.Arrays;

public class JavaArrList implements JavList {

    private Object[] array;
    private final int initialCapacity;
    private static int counter;

    public JavaArrList() {
        initialCapacity = 1;
        array = new Object[initialCapacity];
    }

    @Override
    public void add(Object obj) {
        if (initialCapacity == counter) {
            Object[] newArray = Arrays.copyOf(array, array.length + 1);
            array = newArray;
        }
        array[counter] = obj;
        counter++;
    }


}
*/
