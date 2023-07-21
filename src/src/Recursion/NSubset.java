package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class NSubset {

    public static void printSubset(ArrayList<Integer> subset)
    {
        for (int i=0;i<subset.size();i++)
        {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset)
    {
        if(n==0)
        {
            printSubset(subset);
            return;
        }

        // add to subset
        subset.add(n);
        findSubsets(n-1, subset);

        // don't add to subset
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
    }
}
