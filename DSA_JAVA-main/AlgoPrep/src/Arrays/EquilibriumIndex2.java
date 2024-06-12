package Arrays;

import java.util.Scanner;

public class EquilibriumIndex2 {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        int i = equiIndex(a);

//        System.out.println("Index is " + i);
        System.out.println("Count is : "+ i);
    }

    public static int equiIndex(int a[])
    {
        int sum = 0;
        int c = 0;

        for(int i =0;i<a.length;i++)
        {
            sum += a[i];
        }

        int left =0;
        int right =0;

        for(int i=0;i<a.length;i++)
        {
            right = sum - a[i] - left;

            if(left == right)
            {
//                return i;
                c++;
            }
            left += a[i];
        }
//        return -1;
        return c;
    }
}
