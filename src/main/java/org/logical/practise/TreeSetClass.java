package org.logical.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TreeSetClass {

    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(50);
        ts.add(40);
        ts.add(60);
        ts.add(30);

        // System.out.println(ts.last());

        System.out.println(ts.ceiling(29));

        System.out.println(ts.floor(41));

        System.out.println(ts.lower(60));

        System.out.println(ts.first());

        System.out.println(ts.higher(50));

        System.out.println(ts.headSet(40));


    }
}
