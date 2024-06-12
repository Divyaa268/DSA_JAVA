package src.src.Arrays;

public class PrintSubarrays {

    private static void subarrays(int[] a) {

        int l = a.length;

        for(int i=0;i<l;i++)
        {
            for (int j = i;j<l;j++)
            {
                for (int k = i;k<=j;k++)
                {
                    System.out.print(a[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int a[] = {1,2,3,4,5};

        subarrays(a);
    }
}
