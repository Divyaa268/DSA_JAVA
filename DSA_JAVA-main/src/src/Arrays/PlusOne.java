package src.src.Arrays;

public class PlusOne {

    public static void main(String[] args) {

        int a[] = {4,9, 9};
        int res[] = plusOne(a);

        for (int i = 0; i < res.length; i++)
        {
            System.out.print(res[i] + " ");
        }
    }
    public static int[] plusOne(int[] a) {

        int l = a.length;

        for(int i=l-1;i>=0;i--)
        {
            if(a[i] < 9)
            {
                a[i]++;
                return a;
            }
            a[i] = 0;
        }

        a = new int[l+1];
        a[0] = 1;
        return a;

    }
}
