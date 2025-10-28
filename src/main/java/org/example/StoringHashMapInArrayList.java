package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StoringHashMapInArrayList {

    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> al = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> hm = new HashMap<>();

        hm.put("Name", "Ravi");
        hm.put("Company", "Paytm");
        hm.put("Age", "31");
        al.add(hm);

        Iterator<HashMap<String, String>> itr = al.iterator();
        while (itr.hasNext()) {
            HashMap<String, String> hasmp = itr.next();
            for(Map.Entry<String, String> ss: hasmp.entrySet()){
                System.out.println(ss.getKey() +" : "+ss.getValue());
            }
        }


    }
}
