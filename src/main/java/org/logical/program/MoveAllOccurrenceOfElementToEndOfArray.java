package org.logical.program;

import java.util.Arrays;

public class MoveAllOccurrenceOfElementToEndOfArray {

    public static void moveToEnd(int[] arr, int num) {
        int pointer = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                arr[pointer] = arr[i];
                pointer++;
            }
        }
        while (pointer < arr.length) {
            arr[pointer] = num;
            pointer++;
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 0, 2, 4, 5};
        int num = 2;
        moveToEnd(arr, num);
    }
}
