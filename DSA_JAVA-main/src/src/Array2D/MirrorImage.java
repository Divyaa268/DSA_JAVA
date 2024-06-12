package src.src.Array2D;

import java.util.Scanner;

public class MirrorImage {

    public static void mirror(int a[][])
    {
        int r = a.length;

        for(int i =0;i<r;i++)
        {
            int s = 0;
            int e = r-1;

            while (s<=e)
            {
                int t = a[i][s];
                a[i][s] = a[i][e];
                a[i][e] = t;

                s++;
                e--;
            }

        }
    }

    public static void main(String[] args) {

        int a[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

         mirror(a);

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
