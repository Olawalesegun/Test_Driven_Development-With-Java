package pract;

import java.util.*;

public class Practice {

    public static void main(String[] args) {

        ArrayList arr2 = new ArrayList();
        ArrayList arr = new ArrayList();

        arr.add(20);
        arr.add(25);
        arr.add(30);
        arr.add(35);

        boolean result = arr.contains(25);
        System.out.println(result);
        int indexVal = arr.indexOf(35);
        System.out.println(indexVal);
        System.out.println(arr.listIterator());

        arr2.add(76);
        arr2.add(77);
        arr2.add(78);
        arr2.add(79);

        arr.addAll(arr2);
        System.out.println(arr);

        Iterator<Integer> iter = arr.iterator();

        //Kindly note that Iterator fails safe while loops fail fast

        System.out.println(iter.next());

        Collection coll = new ArrayList();

        LinkedList newLL = new LinkedList();
        List linkedL = new LinkedList();
        Deque dLinkedL = new LinkedList();

        dLinkedL.addFirst(20);
        dLinkedL.addLast(10);
        dLinkedL.addLast(4);
        dLinkedL.addFirst(12);
        Iterator<Integer> neLL = dLinkedL.descendingIterator();
        System.out.println("Descending Iterator is : " + neLL.next());
        System.out.println("Descending Iterator is : " + newLL);
        System.out.println("Descending Iterator is : " + dLinkedL.descendingIterator());

        linkedL.add(56);
        linkedL.add(41);
        linkedL.add(32);
        linkedL.add(67);
        linkedL.add(3, 45);


        System.out.println(linkedL);

        System.out.println(dLinkedL);

        // The Priority Queue follows what is known as Minimum Heap Data Structure

        PriorityQueue pq = new PriorityQueue();
        pq.add(67);
        pq.add(23);
        pq.add(15);
        pq.add(3);
        pq.forEach(System.out::println);
        System.out.println(pq);

    }
}
