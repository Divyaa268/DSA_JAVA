package HashMap;

import java.util.*;

public class LinkedHashSetBasics {

    public static void main(String[] args) {

        LinkedHashSet<Integer> hs = new LinkedHashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(3);
        hs.add(2);

        System.out.println(hs);

        hs.remove(1);

        System.out.println(hs);
    }
}
