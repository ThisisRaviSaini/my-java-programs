package org.logical.program;

public class FindSecondLargestNumberFromArray {

    public static void findSecondLargestNumberFromArray(int[] arr) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else {
                if (arr[i] < max && arr[i] > secondMax) {
                    secondMax = arr[i];
                }
            }
        }
        System.out.println("Max Number        : " + max);
        System.out.println("Second Max Number : " + secondMax);
    }

    public static void main(String[] args) {
        int[] arr = {180, 100, 30, 90, 300, 40, 150, 60, 80, 120};
        findSecondLargestNumberFromArray(arr);
    }
}
