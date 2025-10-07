package org.example;

public class OccurrenceOfNumberInArray {

    public static void findOccurence(int arr[]) {
        boolean visited[] = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count = 1;

            if (visited[i]) {
                continue;
            }

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    count++;
                    visited[j] = true;
                }

            }
            System.out.println( arr[i] +": "+count);
        }


    }

    public static void main(String[] args) {
        int arr[] = {10, 30, 10, 20, 40, 10};

        findOccurence(arr);


    }
}
