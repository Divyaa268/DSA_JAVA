package Arrays;

public class MaxDifference2 {

    public static void main(String[] args) {

        int a[] = {3,9,8,4,1,2,10,7};
        int ans = maxDiff(a);
        System.out.println(ans);
    }

    public static int maxDiff(int a[])
    {
        int min  = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++) {

            a[i] = a[i] + i; // updated array
        }

        for(int i=0;i<a.length;i++)
        {
            if(max< a[i])
            {
                max = a[i];
            }
        }

        for(int i=0;i<a.length;i++)
        {
            if(min> a[i])
            {
                min = a[i];
            }
        }

        return max - min;

    }
    }
