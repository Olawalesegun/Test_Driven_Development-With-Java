package Treesett;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        //Treeset is best for searching as it eliminates the O(n) and all
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);
        numbers.add(40);
        System.out.println();
        System.out.println("The set are: " + numbers);
        System.out.println("Before collecting in a sorted set" + numbers.headSet(7));

        SortedSet<Integer> set = numbers.headSet(40); // [10]
        System.out.println(set);
    }
}
