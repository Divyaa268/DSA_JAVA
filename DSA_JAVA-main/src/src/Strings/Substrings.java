package src.src.Strings;

import java.util.*;

public class Substrings {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        printSubstrings(st);
    }


    public static void printSubstrings(String str)
    {
        int l=str.length();
        for(int i=0;i<l;i++)
        {
            for(int j=i;j<l;j++)
            {
                System.out.println(str.substring(i,j+1));
            }
        }
//        System.out.println(str.substring(l-1));
    }
}
