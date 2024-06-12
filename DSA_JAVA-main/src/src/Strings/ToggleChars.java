package Strings;

import java.util.Scanner;

public class ToggleChars {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char c[] = new char[n];
        String s = "Hello";
        c = s.toCharArray();

//        for (int i=0;i<s.length();i++)
//        {
//            c[i] = s.charAt(i);
//        }

        toggle(c);

        for (int i =0;i<c.length;i++)
        {
        System.out.print(c[i]);
    }

    }

    public static void toggle(char c[])
    {
        for (int i=0;i<c.length;i++)
        {
            if(c[i] >= 65 && c[i] <=90)
            {
                c[i] = (char) (c[i] + 32);
            }
            else
            {
                c[i] = (char) (c[i] - 32);
            }
        }
    }
}
