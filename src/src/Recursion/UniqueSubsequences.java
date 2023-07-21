package Recursion;

import java.util.HashSet;

public class UniqueSubsequences {

    public static void subsequences(String s, int i, String newStr, HashSet set)
    {
        if(s.length() == i)
        {
            if(set.contains(newStr))
            {
                return;
            }
            else
            {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }

        // To add currChar to new string
        subsequences(s,i+1, newStr + s.charAt(i), set);


        // to not add currChar to new String
        subsequences(s,i+1, newStr, set);
    }

    public static void main(String[] args) {
        String s = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(s, 0, "", set);
    }

}
