package org.logical.practise;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedListClass {

    public static void main(String[] args) {

        LinkedList<Integer> ll= new LinkedList<>();
        ll.add(10);
        ll.add(30);
        ll.add(20);
        ll.add(40);
        ll.add(50);

        ll.removeFirstOccurrence(10);
        ll.removeFirst();
        ll.pollFirst();
        System.out.println(ll.peekFirst());
        ll.getFirst();
        ll.pop();






    }
}
