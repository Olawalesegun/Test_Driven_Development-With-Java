package pract;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsAndSorting {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add(345);
        arrayList.add(675);
        arrayList.add(744);
        arrayList.add(898);
        arrayList.add(56);

        System.out.println("The arrayList before being sorted: " + arrayList);

        Collections.sort(arrayList);

        System.out.println("The arrayList after being sorted: " + arrayList);


    }
}
