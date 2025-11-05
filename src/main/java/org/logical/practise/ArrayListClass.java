package org.logical.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListClass {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(20);

        al.add(40);
        al.add(30);
        al.add(50);
        al.add(40);
        al.add(5, 60); // Increases the Size of the List
        // al.set(6, 70);  Exception as it cannot increase the size of the list as 6th index not present in list

        al.set(0, 10); // Will set the value at existing index

        System.out.println(al.indexOf(40));
        System.out.println(al.lastIndexOf(40));

        System.out.println(al.contains(30));

        System.out.println(al.isEmpty());

        System.out.println(al.get(4));

        Collections.sort(al);
        System.out.println(al);

        Iterator itr = al.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }



    }
}
