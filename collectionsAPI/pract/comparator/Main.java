package pract.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        ComparatorConsole comCons = new ComparatorConsole();

        ComparatorClass comClass = new ComparatorClass();
        ComparatorClass comClass1 = new ComparatorClass(4,"Tola",45);
        ComparatorClass comClass2 = new ComparatorClass(3, "Danbii", 67);
        ComparatorClass comClass3 = new ComparatorClass(5, "Foluke", 13);
        ComparatorClass comClass4 = new ComparatorClass(1, "Bernard", 32);


        arrayList.add(comClass);
        arrayList.add(comClass1);
        arrayList.add(comClass2);
        arrayList.add(comClass3);
        arrayList.add(comClass4);

        System.out.println("This is before the array got sorted: "+ arrayList);

        Collections.sort(arrayList, comCons);

        System.out.println("This is after the array got sorted: "+ arrayList);

    }
}
