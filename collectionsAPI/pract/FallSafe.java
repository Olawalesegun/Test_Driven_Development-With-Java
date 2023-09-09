package pract;

import java.util.ArrayList;

public class FallSafe {

    public static void main(String[] args) {

        ArrayList arrList = new ArrayList();

        arrList.add(76);
        arrList.add(98);
        arrList.add(54);
        arrList.add(34);

        for(int i=0; i<arrList.size(); i++){
            System.out.println(arrList.get(i));
            arrList.add(445);
        }

        // This is an issue as it will continue running until the RAM can't take it anymore
        // This is regarded as Fall Safe.
    }
}
