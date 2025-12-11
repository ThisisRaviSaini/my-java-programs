package org.logical.program;

public class ReturnTheThreeIndexOfArrayHavingSumSeventy {

    public static void returnThreeIndexHavingSumSeventy(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = j; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 70) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {10, 30, 60, 20, 50};
        returnThreeIndexHavingSumSeventy(arr);
    }
}
