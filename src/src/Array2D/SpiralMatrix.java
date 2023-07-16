package Array2D;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {

    public static List<Integer> spiral(int a[][]) {

        int startRow = 0;
        int endRow = a.length - 1;
        int startCol = 0;
        int endCol = a[0].length - 1;

        List<Integer> result = new ArrayList<>();

        while (startRow <= endRow && startCol <= endCol) {
            // Top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(a[startRow][j] + " ");
                result.add(a[startRow][j]);

            }
            startRow++;

            // Right
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(a[i][endCol] + " ");
                result.add(a[i][endCol]);
            }
            endCol--;

            // Bottom
            for (int j = endCol; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(a[endRow][j] + " ");
                result.add(a[endRow][j]);
            }
            endRow--;

            // Left
            for (int i = endRow; i >= startRow; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(a[i][startCol] + " ");
                result.add(a[i][startCol]);
            }
            startCol++;

        }

        System.out.println();
        return result;
    }


//
//    public static void spiralPrint(int matrix[][]){
//
//        int rs= 0;
//        int cs= 0;
//        int re= matrix.length-1;
//        int ce= matrix[0].length-1;
//        int total = matrix.length * matrix.length;
//        int c= 0;
//
//        while(c<total)
//        {
//            for(int i=cs;i<=ce;i++)
//            {
//                System.out.print(matrix[rs][i]+ " ");
//                c++;
//            }
//            rs++;
//            for(int i=rs;i<=re;i++)
//            {
//                System.out.print(matrix[i][ce]+ " ");
//                c++;
//
//            }
//            ce--;
//            for(int i=ce;i>=cs;i--)
//            {
//                System.out.print(matrix[re][i]+ " ");
//                c++;
//            }
//            re--;
//            for(int i=re;i>=rs;i--)
//            {
//                System.out.print(matrix[i][cs]+ " ");
//                c++;
//            }
//            cs++;
//        }
//    }

    public static void main(String[] args) {

        int a[][] = new int[4][4];

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        // output
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        spiral(a);
    }
}
