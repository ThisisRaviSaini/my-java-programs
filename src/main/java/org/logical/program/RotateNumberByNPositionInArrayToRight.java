package org.logical.program;

import java.util.Arrays;

public class RotateNumberByNPositionInArrayToRight {


    public static void rotateNumberByNPositionInArrayToRight(int[] arr, int pos) {

        while (pos > 0) {
            int last = arr[arr.length - 1];

            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
            pos--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};

        rotateNumberByNPositionInArrayToRight(arr, 3);
    }
}
