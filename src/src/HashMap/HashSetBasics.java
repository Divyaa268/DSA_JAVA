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

    }
}
