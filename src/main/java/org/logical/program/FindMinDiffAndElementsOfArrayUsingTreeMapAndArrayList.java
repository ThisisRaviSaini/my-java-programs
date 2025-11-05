package org.logical.program;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class FindMinDiffAndElementsOfArrayUsingTreeMapAndArrayList {

    public static void findMinDiffAndElementsOfArrayUsingTreeMapArrayList(int[] arr) {

        TreeMap<Integer, ArrayList<Integer>> tm = new TreeMap<>();
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }

                int diff = arr[i] - arr[j];
                if (diff > 0 && diff < minDiff) {
                    minDiff = diff;
                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(arr[i]);
                    al.add(arr[j]);
                    tm.put(minDiff, al);
                }
            }
        }

        int minDiffValue = tm.firstEntry().getKey();
        System.out.println("Min Difference :" + minDiffValue);
        System.out.println("Pair Having Minimum Difference :" + tm.firstEntry().getValue());

        for (Map.Entry<Integer, ArrayList<Integer>> tSetElement : tm.entrySet()) {
            if (tSetElement.getKey() == minDiffValue) {
                System.out.println("Min Difference :" + minDiffValue+" Min Diff Pair"+tSetElement.getValue());
            }

        }


    }

    public static void main(String[] args) {
        int[] arr = {12, 15, 12, 18, 8, 21, 24, 27,};
        findMinDiffAndElementsOfArrayUsingTreeMapArrayList(arr);
    }


}
