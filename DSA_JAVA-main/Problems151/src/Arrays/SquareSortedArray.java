package Arrays;

// Question 977

import java.util.Arrays;

public class SquareSortedArray {

    public static int[] sortedSquares(int[] a)
    {
        int l=a.length;

        int b[] = new int[l];
        int c=0;

        for(int i=0;i<l;i++)
        {
            b[c++] = a[i] * a[i];
        }
        Arrays.sort(b);


        return b;
    }

    public static void main(String[] args) {

        int a[] = {-4,-1,0,3,10};

        int arr[] = sortedSquares(a);

        for(int i =0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }


    }
}
