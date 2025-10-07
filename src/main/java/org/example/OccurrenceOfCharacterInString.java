package org.example;

public class OccurrenceOfCharacterInString {

    public static void findOccurrenceOfCharacterInString(String str) {
        char charArr[] = str.toCharArray();

        boolean[] visited = new boolean[charArr.length];

        for (int i = 0; i < charArr.length; i++) {
            int count = 1;
            if(visited[i]==true){
                continue;
            }
            for (int j = 0; j < charArr.length; j++) {
                if (charArr[i] == charArr[j] && i != j) {
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(charArr[i] +":"+ count);
        }
    }

    public static void main(String[] args) {

        String str = "RaviSaini";

        findOccurrenceOfCharacterInString(str);

    }
}
