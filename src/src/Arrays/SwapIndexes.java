package Arrays;

import java.util.Scanner;

public class SwapIndexes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");

        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter array elements");
        for (int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Input index 1 to swap");
        int idx1 = sc.nextInt();

        System.out.println("Input index 2 to swap");
        int idx2 = sc.nextInt();

        swapIndexes(a, idx1, idx2);

    }

    public static void swapIndexes(int a[], int idx1, int idx2)
    {
        int s = 0;
        int e = a.length-1;

            int temp = a[idx1];
            a[idx1] = a[idx2];
            a[idx2] = temp;

        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i] + " ");
        }
    }
}
