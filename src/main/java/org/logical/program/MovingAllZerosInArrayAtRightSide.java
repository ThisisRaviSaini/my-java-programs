package org.logical.program;

import java.util.Arrays;

public class MovingAllZerosInArrayAtRightSide {


    public static void movingAllZerosInArrayAtRightSide(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {10, 0, 30, 0, 20, 0};
        movingAllZerosInArrayAtRightSide(arr);
    }
}
