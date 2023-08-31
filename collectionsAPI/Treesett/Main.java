package Treesett;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        SortedSet<Integer> set = numbers.headSet(20); // [10]
        System.out.println(set);
    }
}
