package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalinPermute {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        input = input.toLowerCase();
        input = input.replaceAll(" ", "");

       permute(input, "");

       if(isPalin)
       {
           System.out.println("YES");
       }
       else
       {
           System.out.println("NO");
       }
    }

    public static boolean isPalin = false;
    public static void permute(String s, String permuteString)
    {
        if(s.length() == 0)
        {
            if(palin(permuteString))
            {
                isPalin = true;
            }
            else
            {
//                ans = "NO";
            }
            return;
        }

        int len = s.length();

        for(int i=0;i<len;i++)
        {
            char currChar = s.charAt(i);

            String newStr = s.substring(0,i) + s.substring(i+1);

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
