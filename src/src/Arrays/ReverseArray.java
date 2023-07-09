package Arrays;

// Time complexity - O(N)
// Space Complexity - O(1)

public class ReverseArray {

    public static void reverseArr(int[] a) {

        int f = 0;
        int l = a.length-1;

        while(f<l)
        {
            int temp = a[l];
            a[l] = a[f];
            a[f] = temp;

            f++;
            l--;
        }

    }

    public static void main(String[] args) {

        int a[] = {1, 3, 5, 6, 7, 8, 9};

       reverseArr(a);

       for(int i=0;i<a.length;i++)
       {
           System.out.print(a[i] + " ");

       }
    }
}
