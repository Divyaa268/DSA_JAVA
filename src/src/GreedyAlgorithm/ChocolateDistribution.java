package GreedyAlgorithm;

import java.util.Arrays;

public class ChocolateDistribution {

    public static int distChoco(int a[], int students, int packets)
    {
        Arrays.sort(a);

        int i=0;
        int j= students - 1;

        int min = Integer.MAX_VALUE;

        while(j < a.length - 1)
        {
            int diff = a[j] - a[i];
            min = Math.min(diff, min);
            j++;
            i++;
        }
        return min;

    }

    public static void main(String[] args) {
        int a[] = {3,4,1,9,56,7,9,12};
        System.out.println(distChoco(a, 5, 8));
    }
}
