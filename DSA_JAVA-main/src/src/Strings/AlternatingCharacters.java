package Strings;

public class AlternatingCharacters {

    public static int alternatingCharacters(String s) {

        int l = s.length();

        int d = 0;
        for (int i = 1; i < l; i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                d++;
            }
        }
        return d;

    }

    public static void main(String[] args) {

//        String s = "AAAA";
        String s = "ABABABABAABB";
        int res = alternatingCharacters(s);
        System.out.println("Min deletions : " + res);
    }
}
