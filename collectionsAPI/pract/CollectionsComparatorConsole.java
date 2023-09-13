package pract;

import java.util.Comparator;

public class CollectionsComparatorConsole implements Comparator<CollectionsAndSortingWithComparator> {
    @Override
    public int compare(CollectionsAndSortingWithComparator t1,
                       CollectionsAndSortingWithComparator t2) {
        if(t1.getAge()>t2.getAge()){
            return 1;
        }else{
            return -1;
        }
    }
}
