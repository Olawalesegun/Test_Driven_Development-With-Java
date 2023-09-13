package pract;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMain {

    public static void main(String[] args) {
        CollectionsAndSortingWithComparator coll = new CollectionsAndSortingWithComparator(5);
        CollectionsAndSortingWithComparator coll1 = new CollectionsAndSortingWithComparator(7);
        CollectionsAndSortingWithComparator coll2 = new CollectionsAndSortingWithComparator(8);

        CollectionsComparatorConsole colComConsole = new CollectionsComparatorConsole();

        ArrayList arrList = new ArrayList();
        arrList.add(coll);
        arrList.add(coll1);
        arrList.add(coll2);

        Collections.sort(arrList, colComConsole);

        System.out.println(arrList);
    }
}
