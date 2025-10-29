package org.logical.program;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

public class SecondLargestStringFromStringArray {


    public static void secondLargestString(String arr[]) {

        TreeMap<Integer, String> tm = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            tm.put(arr[i].length(), arr[i]);
        }

        System.out.println(tm);


        System.out.println(tm.lastEntry().getKey());
        System.out.println(tm.lowerEntry(tm.lastEntry().getKey()));


    }

    public static void main(String[] args) {

        String strArr[] = {"RaviSaini", "Taruna", "Papa", "Maa"};
        secondLargestString(strArr);

    }

}
