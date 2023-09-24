package Strings;

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


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        char c = highestOccuringChar(st);
        System.out.println(c);

    }
}
