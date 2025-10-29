package org.logical.program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StoringArrayListInHashMap {

    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        ArrayList<String> al = new ArrayList<>();
        al.add("Ravi");
        al.add("Taruna");
        al.add("Baldev");
        al.add("Sushma");

        hm.put("2BJN3600", al);

        for (Map.Entry<String, ArrayList<String>> hashM : hm.entrySet()) {
            System.out.println("HashMap Key: " + hashM.getKey());
            Iterator<String> itr = hashM.getValue().iterator();
            while (itr.hasNext()) {
                System.out.println("HashMap Value stored as ArrayList :    " + itr.next());
            }
        }
    }
}
