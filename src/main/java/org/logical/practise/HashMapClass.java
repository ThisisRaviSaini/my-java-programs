package org.logical.practise;

import java.util.*;

public class HashMapClass {


    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Ravi");
        hm.put(234, "Taruna");
        hm.put(4, "Sushma");
        hm.put(3, "Baldev");

        hm.put(5, "Hello");

        System.out.println(hm);

        hm.get(1);
        System.out.println(hm.containsKey(1));
        System.out.println(hm.containsValue("Ravi"));
        System.out.println(hm.entrySet());
        System.out.println(hm.keySet());


        System.out.println(hm.getOrDefault(5, "Default"));

        hm.putIfAbsent(4, "Sushma Kumari");

        System.out.println(hm);

        hm.remove(5);
        hm.remove(5, "Abc");
        System.out.println(hm);
        Collection<String> c = hm.values();

        Iterator<String> i = c.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }

        for (Map.Entry<Integer, String> m : hm.entrySet()) {
            String s = m.getValue();
            int ih = m.getKey();
            m.setValue("R");
        }


    }


}
