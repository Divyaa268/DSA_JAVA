package Array2D;

import java.util.Scanner;

public class CreateSearch {

    public static boolean search(int a[][], int n)
    {
        int r = a.length;
        int c = a[0].length;

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(a[i][j] == n)
                {
                    System.out.println("element fount at index " + i + "," + j);
                    return true;
                }
            }
        }
        System.out.println("Element doesn't exist");
        return false;
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

        // output
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        boolean result = search(a, 4);
        System.out.println(result);
    }
}
