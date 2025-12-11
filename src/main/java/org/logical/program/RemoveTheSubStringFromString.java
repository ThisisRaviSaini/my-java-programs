package org.logical.program;

public class RemoveTheSubStringFromString {


    //Given two strings, base and remove, return a version of the base string
    // where all instances of the remove string have been removed (not case sensitive).
    //You may assume that the remove string is length 1 or more.
    //Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
    //
    //Ex: base= "Hello there" & remove="llo"
    //
    //Below are the sample test cases with expected output:
    //
    //withoutString("Hello there", "llo") → "He there"
    //withoutString("MkjtMkx", "Mk") → "jtx"
    //withoutString("THIS is a FISH", "is") → "TH a FH"
    //withoutString("THIS is a FISH", "iS") → "TH a FH"
    //withoutString("abxxxab", "xx") → "abxab"

// This Program Does not maintain the Sentence Case

    public static void removeTheSubString(String bigStr, String strNeedToRemoved) {

        strNeedToRemoved = strNeedToRemoved.toLowerCase();
        int lengthOfStrNeedToRemoved = strNeedToRemoved.length();

        StringBuffer finalString = new StringBuffer(bigStr.toLowerCase());

        while (finalString.indexOf(strNeedToRemoved) != -1) {
            int indexOfStrNeedToRemoved = finalString.indexOf(strNeedToRemoved);
            finalString.delete(indexOfStrNeedToRemoved, indexOfStrNeedToRemoved + lengthOfStrNeedToRemoved);
            System.out.println(finalString);
        }

    }

    public static void main(String[] args) {

        String bigStr = "abxxxab";
        String strNeedToRemoved = "xx";
        removeTheSubString(bigStr, strNeedToRemoved);

    }
}
