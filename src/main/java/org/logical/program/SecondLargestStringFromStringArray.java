package org.logical.program;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

public class SecondLargestStringFromStringArray {


    public static void secondLargestString(String[] arr) {

        TreeMap<Integer, String> tm = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            tm.put(arr[i].length(), arr[i]);
        }

        System.out.println("All String with length: " + tm);
        System.out.println("String with highest Length: " + tm.lastEntry().getKey());
        System.out.println("Second Largest String:  " + tm.lowerEntry(tm.lastEntry().getKey()));

    }

    public static void main(String[] args) {

        String[] strArr = {"RaviSaini", "Taruna", "Papa", "Maa"};
        secondLargestString(strArr);

    }

}
