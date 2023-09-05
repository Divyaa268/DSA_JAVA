package Arrays;

public class LargestAtleastTwice {

    public static void main(String[] args) {

        int a[] = {3, 6, 2, 1};  // 1
        // int a[] = {3, 4, 2, 1};  // -1
        int ans = twiceLar(a);
        System.out.println(ans);

    }

    public static int twiceLar(int a[])
    {
        int max = Integer.MIN_VALUE;
        int second = -1;
        int index = -1;

        for(int i =0;i<a.length;i++)
        {
            if(max < a[i])
            {
                second = max;
                max = a[i];
                index = i;
            }
            else if (a[i] > second)
            {
                second = a[i];
            }
        }

        return 2 * second <= max ? index : -1;
    }
}
