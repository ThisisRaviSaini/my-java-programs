package org.logical.program;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FindMinDiffAndElementsOfArrayUsingTreeMapAndHashMap {

    public static void findMinDiffAndElementsOfArray(int[] arr) {

        TreeMap<Integer, HashMap<Integer, Integer>> tm = new TreeMap<>();
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int diff;

                diff = arr[i] - arr[j];
                if (diff > 0 && diff < minDiff) {
                    HashMap<Integer, Integer> hm = new HashMap<>();  // This is the statement which need to be remembered
                    hm.put(arr[i], arr[j]);
                    minDiff = diff;
                    tm.put(minDiff, hm);
                }
            }
        }

        for (Map.Entry<Integer, HashMap<Integer, Integer>> tMap : tm.entrySet()) {
            if (tMap.getKey() == minDiff) {
                System.out.println("Min Diff :" + tMap.getKey() + " Pair " + tMap.getValue());

                HashMap<Integer, Integer> hhm = tMap.getValue();

                for (Map.Entry<Integer, Integer> m : hhm.entrySet()) {
                    System.out.println("Pair :" + m.getKey());
                    System.out.println("Pair :" + m.getValue());
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, 5, 7, 10, 1, 2};
        findMinDiffAndElementsOfArray(arr);
    }
}



