package src.src.Strings;

import java.util.HashMap;
import java.util.Map;

public class MakeAnagrams {

    public static int makeAnagram(String s1, String s2) {
        // Write your code here

//     int l1 = a.length();

//     int l2 = b.length();

//     int c=0;
//     for(int i=0;i<l1;i++)
//     {
//         for(int j=0;j<l2;j++)
//         {
//             if(a.charAt(i) == b.charAt(j))
//             {
//                 c++;
//             }
//         }
//     }
//     return (l1-c) + (l2-c);

//     }

// }

        int n = 0;
        Map<Integer, Character> map = new HashMap<>();

        //putting String s1 & s2 , each character as key into Map
        for (int i = 0; i < s1.length(); i++)
        {
            for (int j = 0; j < s2.length(); j++)
            {
                if (s1.charAt(i) == s2.charAt(j) && !map.containsKey(j))
                {
                    map.put(j, s2.charAt(j));

                    break;
                }
            }
        }

        int count = map.size();
        // the minimum number of deletions needed
        n = s1.length() - count + s2.length() - count;
        return n;
    }

// int[] c = new int[26];
//     s1 = s1.toLowerCase();
//     s2 = s2.toLowerCase();
//
//     for (int i = 0; i < s1.length(); i++) {
//       c[s1.charAt(i) - 'a']++;
//     }
//
//     for (int i = 0; i < s2.length(); i++) {
//       c[s2.charAt(i) - 'a']--;
//     }
//
//     int total = 0;
//     for (int i : c) {
//       total += Math.abs(i);
//     }
//
//     return total;

    public static void main(String[] args) {

        String a = "ced";
        String b = "abc";

        // delete letters from both strings to make them anagrams
        int res = makeAnagram(a, b);
        System.out.println("Min deletions : " + res);
    }
}
