package HashMap;

import java.util.TreeSet;

public class TreeSetBasics {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("Amazon");
        ts.add("Microsoft");
        ts.add("Google");
        ts.add("Netflix");

        System.out.println(ts);

        System.out.println(ts.remove("Microsoft"));
        System.out.println(ts);

        ts.clear();
        System.out.println(ts);
    }
}
