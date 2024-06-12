package GreedyAlgorithm;

import java.util.*;

public class ShopInCandyStore {
    static ArrayList<Integer> candyStore(int candiesInitial[], int N, int K) {


        // Convert int to INTEGER
        Integer candies[] = new Integer[N];
        for (int i = 0; i < N; i++) {
            candies[i] = candiesInitial[i];
        }


        int totalCandiesToTakeFree = K;
        int totalNumberOfCandies = N;

        // Now we need to find out the min we need to spend to get all candies

        // Sort the Array
        Arrays.sort(candies);

        // Now we have cheap ones towards start and expensive towards end.

        int minAmountRequired = 0;
        int cheapIndex = 0;
        int expensiveIndex = candies.length - 1;

        while (cheapIndex <= expensiveIndex) {

            // Buy the Cheap Candies
            minAmountRequired += candies[cheapIndex];

            // Getting the Expensive Candies For Free, taken from "K"
            expensiveIndex -= totalCandiesToTakeFree;

            cheapIndex++; // Buy the Next Cheap One
        }

        // Min Cost
        System.out.println("Minimum Cost  : " + minAmountRequired);

        // Now For the Max Cost we need to sort array in reverse and do same thing.
        Arrays.sort(candies, Comparator.reverseOrder());

        // Now Doing the Same Like Previous:

        int maxAmountRequired = 0;
        expensiveIndex = 0;
        cheapIndex = candies.length - 1;

        while (expensiveIndex <= cheapIndex) {

            // Buy the Expensive Candies
            maxAmountRequired += candies[expensiveIndex];

            // Getting the Cheap Candies For Free, taken from "K"
            cheapIndex -= totalCandiesToTakeFree;

            expensiveIndex++; // Buy the Next Expensive One
        }


        System.out.println(" Most Expense is " + maxAmountRequired);

        // Adding the Answer into the result
        ArrayList<Integer> result = new ArrayList<>();


        result.add(minAmountRequired);
        result.add(maxAmountRequired);

        return result;
    }

    public static void main(String[] args) {

        int c[] = {3,2,1,4};
        int k = 2;
        System.out.println(candyStore(c,4,2));

    }
}
