package pract;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrListPrac {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(34);
        list.add(48);
        list.add(87);
        list.add(67);
        list.add(83);

        Iterator iter = list.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println(list.get(0));

        System.out.println(list);
    }
}
