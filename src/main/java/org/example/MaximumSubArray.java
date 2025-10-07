package org.example;

public class MaximumSubArray {

    public static void findMaximumSubArray(int arr[]) {

        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];
        for (int i = 0; i < arr.length; i++) {

            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);

            maxSoFar = Math.max(maxSoFar, maxEndingHere);

        }

        System.out.println(maxSoFar);


    }

    public static void main(String[] args) {
        int arr[] = {-10, 70, -80, -60, 80, 70, -90, 30, -50};
        findMaximumSubArray(arr);
    }
}
