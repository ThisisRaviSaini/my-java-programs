package org.logical.program;

public class SwapTwoStringsWithoutUsingThirdVariable {

    public static void swapTwoStrings(String str1, String str2) {

        System.out.println("Before Swap - Str1 : " + str1 + " | Str2 : " + str2);

        str1 = str1 + str2;
        str2 = str1.substring(0, str2.length() - 1);
        str1 = str1.substring(str2.length());

        System.out.println("After Swap  - Str1 : " + str1 + " | Str2 : " + str2);

    }

    public static void main(String[] args) {

        String str1 = "Ravi";
        String str2 = "Saini";

        swapTwoStrings(str1, str2);
    }
}
