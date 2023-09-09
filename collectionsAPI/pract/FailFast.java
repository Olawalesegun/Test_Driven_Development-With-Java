package pract;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFast {

    public static void main(String[] args) {

        ArrayList arrL = new ArrayList();

        arrL.add(789);
        arrL.add(7654);
        arrL.add(674);
        arrL.add(999);

        Iterator iter = arrL.iterator();
        boolean result = iter.hasNext();
        /*while(result){
            System.out.println(iter.next());
           // arrL.add(7777);
        }*/

        // Above will lead to a ConcurrentModificationException, which will occur immediately
        // This is hereby known as Fail fast, and to solve this we use the CopyOnWriteArrayList

        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(800);
        copyOnWriteArrayList.add(9000);
        copyOnWriteArrayList.add(7700);

        Iterator iter2 = copyOnWriteArrayList.iterator();
        while(iter.hasNext()){
            System.out.println(iter2.next());
            //copyOnWriteArrayList.add(888);
        }
    }
}
