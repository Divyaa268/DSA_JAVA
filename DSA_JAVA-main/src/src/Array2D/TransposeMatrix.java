package Array2D;

import java.util.Scanner;

public class TransposeMatrix {

    public static int[][] transpose(int a[][])
    {

        int r = a.length;
        int c= a[0].length;

        int transpose[][] = new int[r][c];

        for(int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                transpose[j][i] = a[i][j];
            }
        }
        return transpose;
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

        int arr[][] = transpose(a);

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
