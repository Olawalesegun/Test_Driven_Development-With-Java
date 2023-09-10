package pract.comparator;

import java.util.Comparator;

public class ComparatorConsole implements Comparator<ComparatorClass> {
    @Override
    public int compare(ComparatorClass cc1, ComparatorClass cc2) {
        if(cc1.getId() > cc2.getAge()){
            return 1;
        }else{
            return -1;
        }
    }
}
