package org.logical.practise;

import java.util.Arrays;

public class ReverseTheStringKeepingTheSymbolAtSamePos {

    public static void reverseTheStringKeepingSymbolAtSamePos(String name) {

        char[] charArr = name.toCharArray();
        int left = 0;
        int right = charArr.length-1 ;
        while (left < right) {

            if (!Character.isLetterOrDigit(charArr[left])) {
                left++;
            } else if (!Character.isLetterOrDigit(charArr[right])) {
                right--;
            } else {
                char temp = charArr[left];
                charArr[left]=charArr[right];
                charArr[right]=temp;
                left++;
                right--;
            }

        }
        System.out.println(Arrays.toString(charArr));

    }

    public static void main(String[] args) {
        String name = "Rav!S@!ni";
        reverseTheStringKeepingSymbolAtSamePos(name);
    }
}
