package HashMap;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapBasics {

    public static void main(String[] args) {

        TreeMap<String, Integer> hm = new TreeMap<>();

        // add
        hm.put("India", 150);
        hm.put("China", 100);
        hm.put("USA", 80);

        System.out.println(hm);

        // get
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonesia"));


        // contains key
        boolean b = hm.containsKey("India");
        System.out.println(b);

        // Remove
        System.out.println(hm.remove("China"));
        System.out.println(hm);


        // Iterate
        Set<String> keys = hm.keySet(); // stores all keys of fohm
        System.out.println(keys); // random order

        for (String k : keys) {
            System.out.println("Key : " + k + " value : " + hm.get(k));
        }

        System.out.println(hm.entrySet());

    }
    }
