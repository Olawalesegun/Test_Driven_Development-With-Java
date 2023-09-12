package pract.hash;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapp {

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(2,24);
        hashMap.put(1, 22);
        hashMap.put("null", 56);

        System.out.println(hashMap);

        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(2, 24);
        linkedHashMap.put(1, 22);
        linkedHashMap.put(0, 19);
        linkedHashMap.put(3, 34);

        System.out.println(linkedHashMap);

        TreeMap treeMap = new TreeMap();

        treeMap.put(4, 45);
        treeMap.put(1, 22);
        treeMap.put(3, 456);
        treeMap.put(5, 23);

        System.out.println(treeMap);

    }
}
