package Strings;

import java.util.*;

public class CharacterDiff {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < n; i++)
        {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            int result = sameCharIndex(s1, s2);
            System.out.println(result);
        }
    }

    public static int sameCharIndex(String s1, String s2)
    {
        int l1 = s1.length();
        int l2 = s2.length();

        int l = Math.min(l1,l2);

        int count =0;
        for(int i=0;i<l;i++)
        {

            if(s1.charAt(i) == s2.charAt(i))
            {
                count++;
            }
            else
            {
                break;
            }
        }
        return count;
    }
}
