package org.logical.program;

public class SwapTwoNumbersWithoutUsingThirdVariable {

    public static void swapTwoNumbers(int a, int b) {

        System.out.println("Before Swap - A : " + a + " | B : " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap  - A : " + a + " | B : " + b);
    }

    public static void main(String[] args) {
        swapTwoNumbers(10, 20);
    }
}
