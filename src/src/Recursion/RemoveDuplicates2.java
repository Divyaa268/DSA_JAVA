package Recursion;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates2 {

    public static void removeDup(String s, StringBuilder newStr, int i, boolean map[])
    {
        if(i == s.length())
        {
            System.out.println(newStr);
            return;
        }

        char currChar = s.charAt(i);
        if(map[currChar - 'a'] == true)
        {
            removeDup(s,newStr,i+1,map);
        }
        else
        {
            map[currChar - 'a'] = true;
            removeDup(s, newStr.append(currChar), i+1,map);
        }
    }

    public static String removeDuplicates(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                result.append(c);
            }
        }

        return result.toString();
    }


    public static void main(String[] args) {

        String s = "monntreeaal";
        removeDup(s, new StringBuilder(""), 0, new boolean[26]);
    }
}
