package org.example;

import java.util.HashSet;
import java.util.Set;

public class LongestCommonSubstringUsingCollection {


    public static String findLongestCommonSubstringUsingCollection(String str1, String str2) {
        Set<String> subStringOfStr1 = new HashSet<>();
        String longestSub = "";

        for (int i = 0; i < str1.length(); i++) {
            for (int j = i; j <= str1.length(); j++) {
                subStringOfStr1.add(str1.substring(i, j));
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            for (int j = i; j <= str2.length(); j++) {
                String str2Sub = str2.substring(i, j);

                if (subStringOfStr1.contains(str2Sub) && str2Sub.length() > longestSub.length()) {
                    longestSub = str2Sub;
                }
            }
        }
        return longestSub;
    }

    public static void main(String[] args) {

        String str1 = "abcdkg";
        String str2 = "nebcdf";

        System.out.println(findLongestCommonSubstringUsingCollection(str1, str2));


    }
}
