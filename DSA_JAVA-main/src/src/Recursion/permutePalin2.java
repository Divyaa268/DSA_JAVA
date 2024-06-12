package Recursion;

import java.util.*;

import java.util.Scanner;

public class permutePalin2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String inp = input.toLowerCase();
        String str = inp.replaceAll(" ", "");

        permute(str, "");

        String ans = "NO";

        for(String t : permutations )
        {
            if(palin(t))
            {
                ans = "YES";
            }
            else {
//                ans = "NO";
            }
        }
        System.out.println(ans);
    }

    public static ArrayList<String> permutations = new ArrayList<>();

    public static void permute(String s, String permuteString)
    {

        if(s.length() == 0)
        {
            return;
        }

        int len = s.length();

        for(int i=0;i<len;i++)
        {
            char currChar = s.charAt(i);

            String newStr = s.substring(0,i) + s.substring(i+1);

            permutations.add(newStr + permuteString + currChar);
            permute(newStr, permuteString + currChar);
        }

    }

    public static boolean palin(String s)
    {
        int l = s.length();
        String rev = "";

        for(int i=0;i<l;i++)
        {
            rev = s.charAt(i) + rev;
        }
        if(s.equals(rev))
        {
            return true;
        }
        return false;
    }
}
