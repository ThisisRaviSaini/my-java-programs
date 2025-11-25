package org.logical.program;

import java.util.Arrays;

public class SwapTheElementBwStartIndexAndEndIndexOfArray {

    public static void swapElements(int[] arr, int startIndex, int endIndex) {

        while (startIndex < endIndex) {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 0, -4, -6, 11, 20, 34, 9};
        int startIndex = 2;
        int endIndex = 6;
        swapElements(arr, startIndex, endIndex);

    }

}
