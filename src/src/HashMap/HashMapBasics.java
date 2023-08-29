package HashMap;

import java.util.HashMap;

public class HashMapBasics {

    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 150);
        hm.put("China", 100);
        hm.put("USA", 80);

        System.out.println(hm);

        int population  = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonesia"));

        boolean b = hm.containsKey("India");
        System.out.println(b);

        // Remove
        System.out.println(hm.remove("China"));
        System.out.println(hm);
    }
}
