package Array2D;

import java.util.Scanner;

public class DiagonlSum {

    public static void diagonalSum(int a[][])
    {
        int r = a.length;
        int c = a[0].length;

        int sum = 0;

        int rightDiagonal = 0;
        int leftDiagonal = 0;

        for(int i=0;i<r;i++)
        {

            for(int j=0;j<c;j++)
            {

                if(i+j == c-1)
                {
                    rightDiagonal = rightDiagonal + a[i][j];
                }
                else if(i == j)
                {
                        leftDiagonal += a[i][j];
                }
                }
            }
        sum += leftDiagonal + rightDiagonal;
            System.out.println(sum);

        }

    public static void main(String[] args) {

        int a[][] = new int[4][4];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        diagonalSum(a);
    }
}
