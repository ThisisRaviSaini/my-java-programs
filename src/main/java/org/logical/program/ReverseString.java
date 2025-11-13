package org.logical.program;

public class ReverseString {


    public static void reverseString(String str) {

        char[] charArr = str.toCharArray();

        for (int i = charArr.length - 1; i >= 0; i--) {
            System.out.print(charArr[i]);
        }
    }

    public static void main(String[] args) {
        String str = "Ravi Saini";
        reverseString(str);
    }

}
