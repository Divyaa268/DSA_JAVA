package Strings;

import java.util.Arrays;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t)
    {
        int l1 = s.length();
        int l2 = s.length();

        if(l1 == l2)
        {
            char c1[] = s.toCharArray();
            char c2[] = t.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            if(Arrays.equals(c1,c2))
            {
                return true;
            }
        }

        return false;

    }

//    private static int CHARACTER_RANGE= 256;
//
//    public boolean isAnagramCounting(String string1, String string2) {
//        if (string1.length() != string2.length()) {
//            return false;
//        }
//        int count[] = new int[CHARACTER_RANGE];
//        for (int i = 0; i < string1.length(); i++) {
//            count[string1.charAt(i)]++;
//            count[string2.charAt(i)]--;
//        }
//        for (int i = 0; i < CHARACTER_RANGE; i++) {
//            if (count[i] != 0) {
//                return false;
//            }
//        }
//        return true;
//    }


    public static void main(String[] args) {

        String s = "earth";
        String t = "heart";

        boolean res = isAnagram(s,t);
        System.out.println(res);
    }
}
