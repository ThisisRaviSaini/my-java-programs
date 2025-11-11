package org.logical.program;

import java.util.HashMap;

public class DenominationOfNotesRequired {

    public static void denominationOfNotesRequired(int[] notesArr, int amount) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int notesRequired;
        for (int i = 0; i < notesArr.length; i++) {
            notesRequired = amount / notesArr[i];
            amount = amount % notesArr[i];
            hm.put(notesArr[i], notesRequired);
        }
        System.out.println(hm);
    }

    public static void main(String[] args) {
        int[] notesArr = {2000, 500, 100, 50, 20, 10};
        denominationOfNotesRequired(notesArr, 20010);
    }
}
