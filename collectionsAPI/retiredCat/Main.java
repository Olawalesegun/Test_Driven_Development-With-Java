/*
package retiredCat;

import comparism.Cat;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Comparator<Cat> catComparator = (cat1, cat2)->{
            if(cat1.getName().compareTo(cat2.getName())>0) return 1;
            if(cat1.getName().compareTo(cat2.getName())<0) return 1;
            return 0;
        };
        Set<Cat> cats = new TreeSet<>();
        cats.add(new Cat("Bruno", 50));
        cats.add(new Cat("Paulty", 10));
        cats.add(new Cat("Young-John", 20));
        cats.add(new Cat("Shigo Baba", 50));

        System.out.println(cats);   //[Bruno, Pauly, Shigo Baba], Young John]

        SortedSet<Cat> catss = cats.//cats.tailSet(new Cat("Young John", 20));
        System.out.println(catss); //[Bruno, Pauly, Shigo Baba]
    }
}
*/
