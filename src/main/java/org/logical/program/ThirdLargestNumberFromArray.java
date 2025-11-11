package org.logical.program;

import java.util.TreeSet;

public class ThirdLargestNumberFromArray {


    //input: {5,4,6,3,8,6,5,9}
    //output:  Third Largest Number:  6

    public static void thirdLargestNumberFromArray(int[] arr, int whichLargestNumber) {

        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            ts.add(arr[i]);
        }
        Integer last = ts.last();
        for (int i = 1; i < whichLargestNumber; i++) {
            last = ts.lower(last);
        }
        System.out.println("Third largest Number: " + last);
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 6, 3, 8, 6, 5, 9, 10};
        int whichLargestNumber = 3;
        thirdLargestNumberFromArray(arr, whichLargestNumber);
    }
}




