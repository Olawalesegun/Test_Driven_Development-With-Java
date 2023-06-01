package oopRedefined;

import DataStructuresAndAlgorithm.oopRedefined.MyArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {
    MyArrayList arrayList = new MyArrayList();
    @Test
    public void testIsEmpty(){
        arrayList.isEmpty();
        assertTrue(arrayList.isEmpty());
    }
    @Test
    public void testThatICanAddStringElementToTheArray(){
        arrayList.add("First Element Added into Array");
        assertEquals(1, arrayList.size());
    }
    @Test
    public void testThatICanAddMoreStringElementsToTheArray(){
        arrayList.add("The Element of Surprise");
        arrayList.add("The Apple Of God's Eye");
        arrayList.add("Convocation tii wole");
        assertEquals(3, arrayList.size());
    }
    @Test
    public void testThatICanAddIntElementToTheArray(){
        arrayList.add(2);
        assertEquals(1, arrayList.size());
    }
    @Test
    public void testThatICanAddMoreIntElementsToTheArray(){
        arrayList.add(30);
        arrayList.add(678);
        arrayList.add(7893);
        assertEquals(3, arrayList.size());
    }
    @Test
    public void testThatICanAddElementsToIndexes(){
        arrayList.add(0, 7);
        assertEquals(7, arrayList.get(0));
    }
    @Test
    public void testThatICanAddDifferentDataTypesWithIndexes(){
        arrayList.add(9);
        arrayList.add("Ezekwisili");
        assertEquals(2, arrayList.size());
    }
    @Test
    public void testThatICanRemoveAnElementInAnArrayList1(){
        arrayList.add(9);
        arrayList.add(4);
        arrayList.remove(1);
        Object collectSize = arrayList.getNewSize();
        assertEquals(9, collectSize);
    }
    @Test
    public void testThatICanRemoveAnElementInAnArrayList(){
        arrayList.add(9);
        arrayList.add(4);
        arrayList.remove(1);
        assertEquals(9, arrayList.getElementsOfNewArray());
    }
    @Test
    public void testThatICanRemoveMoreThanOneElementInAnArrayList(){
        arrayList.add("Chief ");
        arrayList.add("Sam");
        arrayList.add("Immanuel");
        arrayList.add("Semicolon");
        arrayList.remove(1);
        Object[] arr = {"Chief","Immanuel", "Semicolon"};
       assertEquals(arr, arrayList.getElementsOfNewArray());
    }

    @Test
    public void testThatIcanSetElementsOfAnArrayThroughItsIndex(){
        arrayList.set(0, 1);
        assertEquals(1, arrayList.getElementsOfNewArray());
    }


}