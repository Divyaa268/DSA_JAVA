package Arrays;

public class LargestNum {

    private static int largestNum(int[] a)
    {

        int l = a.length;
        int max = Integer.MIN_VALUE;

        for (int i=0;i<l;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }

        return max;

    }


        public static void main(String[] args) {

        int a[] = {2, 4, 7, 8, 9, 3};

        int largest = largestNum(a);

        System.out.println("Largest Number is: " + largest);
    }


}
