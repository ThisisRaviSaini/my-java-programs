package org.example;

import java.util.Arrays;

public class ReverseStringKeepingSymbolPositionSame {

    public static void reverseStringKeepingSymbolPositionSame(String str) {

        char charArr[] = str.toCharArray();
        int first = 0;
        int last = charArr.length - 1;

        while (first < last) {
            if (!Character.isLetterOrDigit(charArr[first])) {
                first++;
            } else if (!Character.isLetterOrDigit(charArr[last])) {
                last--;
            } else {
                char temp = charArr[first];
                charArr[first] = charArr[last];
                charArr[last] = temp;
                first++;
                last--;
            }
        }
        System.out.println(Arrays.toString(charArr));
    }

    public static void main(String[] args) {
        String str = "Ravi@Saini#";
        reverseStringKeepingSymbolPositionSame(str);
    }
}
