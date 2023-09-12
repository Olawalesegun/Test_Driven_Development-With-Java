package pract.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Agent agent = new Agent(1,"Shigomania", "olawalesegun0@gmail.com", 14);
        Agent agent2 = new Agent(2, "Folaji Buraimoh", "jjok@gmail.com", 22);
        Agent agent3 = new Agent(3, "Ebuka Chinwendu", "ork@ymail.com", 45);

        //System.out.println(agent.compareTo(agent2));

        ArrayList arrList = new ArrayList();
        arrList.add(89);
        arrList.add(82);
        arrList.add(73);

        System.out.println(arrList);

        Collections.sort(arrList);
        System.out.println(arrList);

    }
}
