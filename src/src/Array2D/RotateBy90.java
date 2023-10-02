package Array2D;

import java.util.Scanner;

public class RotateBy90 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int a[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        rotateBy90(a);

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotateBy90(int a[][]) {
        int r = a.length;
        int c = a[0].length;

        // Transpose
        for (int i = 0; i < r; i++)
        {
            for (int j = i+1; j < c; j++)
            {
                int t = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = t;
            }
        }

            // Reverse each row
            for (int i = 0; i < r; i++)
            {
                int start = 0;
                int end = c - 1;

                while (start < end)
                {
                    int temp = a[i][start];
                    a[i][start] = a[i][end];
                    a[i][end] = temp;

                    start++;
                    end--;
                }
            }
        }
}
