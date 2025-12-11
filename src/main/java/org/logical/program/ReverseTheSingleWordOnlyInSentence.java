package org.logical.program;

public class ReverseTheSingleWordOnlyInSentence {

    public static void reverseTheWord(String str, String wordTobeReversed) {
        String[] strArr = str.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains(wordTobeReversed)) {
                System.out.print(reverseTheWord(strArr[i]) + " ");
            } else {
                System.out.print(strArr[i] + " ");
            }
        }
    }

    public static StringBuffer reverseTheWord(String word) {
        StringBuffer sb = new StringBuffer(word);
        return sb.reverse();
    }

    public static void main(String[] args) {
        String str = "This word is an example";
        String wordTobeReversed = "word";
        reverseTheWord(str, wordTobeReversed);
    }
}
