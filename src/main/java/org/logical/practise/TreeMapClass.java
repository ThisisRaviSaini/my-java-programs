package org.logical.practise;

import java.util.TreeMap;

public class TreeMapClass {

    public static void main(String[] args) {
        TreeMap<Integer, String> t= new TreeMap<>();

        t.put(1, "India");
        t.put(2, "Pak");
        t.put(3, "Ban");
        t.put(7, "Bhutan");


        System.out.println(t.ceilingEntry(2));
        System.out.println(t.ceilingKey(3));
        System.out.println(t.firstEntry());
        System.out.println(t.floorEntry(5));
        System.out.println(t.higherEntry(3));
        System.out.println(t.values());



    }
}
