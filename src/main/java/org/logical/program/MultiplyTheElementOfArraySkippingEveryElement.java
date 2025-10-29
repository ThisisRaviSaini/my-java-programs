package org.logical.program;

import java.util.Arrays;

public class MultiplyTheElementOfArraySkippingEveryElement {

    public static void multiplyTheElementOfArray(int arr[]) {
        int size = arr.length;
        int outputArr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            int num = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    num = num * arr[j];
                }
            }
            outputArr[i] = num;
        }
        System.out.println(Arrays.toString(outputArr));
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        //output= {2*3*4*5, 1*3*4*5, 1*2*4*5, 1*2*3*5, 1*2*3*4}
        multiplyTheElementOfArray(arr);

    }
}
