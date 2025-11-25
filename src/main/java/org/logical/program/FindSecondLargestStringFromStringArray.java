package org.logical.program;

import java.util.TreeMap;

public class FindSecondLargestStringFromStringArray {


    public static void findSecondLargestStringFromStringArray(String[] strArr) {

        TreeMap<Integer, String> tm = new TreeMap<>();

        for (int i = 0; i < strArr.length; i++) {
            tm.put(strArr[i].length(), strArr[i]);
        }

        int largestStringLength = tm.lastEntry().getKey();
        System.out.println(tm.lowerEntry(largestStringLength));
    }

    public static void main(String[] args) {
        String[] strArr = {"Cat", "lion", "horse", "Crocodile"};
        findSecondLargestStringFromStringArray(strArr);
    }
}
