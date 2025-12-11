package org.logical.program;

public class ReturnTheThreeIndexOfArrayHavingSumSeventy {

    public static void returnThreeIndexHavingSumSeventy(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            // Setting j = i ensures we only form ordered pairs (i ≤ j).
            // This avoids duplicate permutations and keeps the result list smaller.
            // If j started from 0, the loop would produce many extra combinations.

            for (int j = i; j < arr.length; j++) {
                for (int k = j; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 30, 60, 20, 49};
        int sum =70;
        returnThreeIndexHavingSumSeventy(arr, sum);
    }
}
