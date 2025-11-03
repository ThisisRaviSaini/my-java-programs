package org.logical.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class SecondUniqueCharacterFromString {

// Input    aakkaklammz
// Output    Second unique letter
//           z


    public static void findSecondUniqueLetter(String str, int pos) {

        char[] charArr = str.toCharArray();
        int index = pos - 1;

        ArrayList<Character> al = new ArrayList<>();

        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();

        for (int i = 0; i < charArr.length; i++) {
            al.add(charArr[i]);
        }

        for (int i = 0; i < charArr.length; i++) {
            lhm.put(charArr[i], Collections.frequency(al, charArr[i]));
        }

        ArrayList<Character> uniqueElementAl = new ArrayList<>();

        for (Map.Entry<Character, Integer> l : lhm.entrySet()) {
            if (l.getValue() == 1) {
                uniqueElementAl.add(l.getKey());
            }
        }

        System.out.println(pos+" Unique Character: " + uniqueElementAl.get(index));

    }

    public static void main(String[] args) {
        String str = "aakkaklammz";
        findSecondUniqueLetter(str, 1);

    }
}

