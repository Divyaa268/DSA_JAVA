package src.src.Arrays;

public class CountElementsGreaterThanItself {

    public static void main(String[] args) {

        int a[] = {-1, -3,7,9,3,4};

        int ans = greaterEle(a);
        System.out.println(ans);
    }

    public static int greaterEle(int a[])
    {
        int count = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }
        }

        for (int i =0;i<a.length;i++)
        {
            if(a[i] == max)
            {
                count++;
            }
        }
        int ans = a.length - count;
        return ans;
    }
}
