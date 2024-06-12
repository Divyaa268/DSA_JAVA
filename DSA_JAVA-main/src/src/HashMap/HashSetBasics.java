package HashMap;

import java.util.*;

public class HashSetBasics {

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(3);
        hs.add(2);

        System.out.println(hs);

        if(hs.contains(2))
        {

            System.out.println("contains 2");
        }
        else
        {
            System.out.println("Doesn't contain 2");
        }

        System.out.println(hs.remove(2));

        if(hs.contains(2))
        {

            System.out.println("contains 2");
        }
        else
        {
            System.out.println("Doesn't contain 2");
        }

        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Lucknow");
        cities.add("Montreal");
        cities.add("Kolkata");


        // iteration on hashset
        Iterator it = cities.iterator();

        System.out.println("iterator----------");
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("normal-----------");
        for( String city : cities)
        {
            System.out.println(city);
        }

    }
}
