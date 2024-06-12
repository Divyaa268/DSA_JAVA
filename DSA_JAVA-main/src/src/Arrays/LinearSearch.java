package src.src.Arrays;

// Time Complexity - O(n)

public class LinearSearch {

    public static int linearSearch(int[] a, int n)
    {
        int l = a.length;
        int pos;

        for(int i=0;i<l;i++)
        {
            if(a[i] == n)
            {
                pos = i;
                return pos;
            }
        }
        return -1;

    }


    public static void main(String[] args) {

        int a[] = {2, 4, 7, 8, 9, 3};
        int n = 4;

        int p = linearSearch(a, n);

        if (p == -1) {
            System.out.println("Number not found!");
        } else {

            System.out.println("Number found at index: " + p);
        }
    }


}
