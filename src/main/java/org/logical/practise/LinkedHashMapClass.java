package org.logical.practise;

import java.util.*;


public class LinkedHashMapClass {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String > lhm= new LinkedHashMap<>();

        lhm.put(3, "Nepal");
        lhm.put(1, "India");
        lhm.put(2, "Pak");

        System.out.println(lhm);

        System.out.println(lhm.isEmpty());

        System.out.println(lhm.size());




    }


}
