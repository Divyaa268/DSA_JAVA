package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class HighestOccurence {

    public static char highestOccuringChar(String str) {

        int N = 256;
        int ctr[] = new int[N];
        int l = str.length();

        for (int i = 0; i < l; i++)
        {
            ctr[str.charAt(i)]++;
        }

        int max = -1;
        char result = ' ';

        for (int i = 0; i < l; i++)
        {
            if (max < ctr[str.charAt(i)])
            {
                max = ctr[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        return result;

    }

    public static char highChar(String s)
    {
        char[] st = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i<st.length;i++)
        {
            if(map.containsKey(st[i]))
            {
                map.put(st[i], map.get(st[i]) + 1);
            }
            else
            {
                map.put(st[i], 1);
            }
        }

        int max = Integer.MIN_VALUE;
        char maxChar = ' ';
        for(Character key : map.keySet())
        {
            if(map.get(key) > max )
            {
                max = map.get(key);
                maxChar = key;
            }
        }
        return maxChar;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        char c = highestOccuringChar(st);
        System.out.println(c);

    }
}

//int res = Integer.max(res, map.get(key))