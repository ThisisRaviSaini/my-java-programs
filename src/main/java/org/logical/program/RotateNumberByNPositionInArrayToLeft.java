package org.logical.program;

import java.util.Arrays;

public class RotateNumberByNPositionInArrayToLeft {


    public static void rotateNumberByNPositionInArray(int[] arr, int pos) {

        while (pos > 0) {

            int first = arr[0];

            for (int i = 0; i < arr.length - 1; i++) {
               arr[i] = arr[i + 1];
            }

            arr[arr.length - 1] = first;
            pos--;
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60};
        rotateNumberByNPositionInArray(arr, 3);
    }
}
