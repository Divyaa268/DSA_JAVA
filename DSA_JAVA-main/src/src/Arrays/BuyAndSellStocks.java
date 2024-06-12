package src.src.Arrays;

// Time complexity - O(N)

public class BuyAndSellStocks {

    public static int buySellStocks(int prices[])
    {
        // prices array stores selling price
        int buyPrice = Integer.MAX_VALUE; // tracks lowest buying price
        int maxProfit = 0;

        int l = prices.length;

        for(int i=0;i<l;i++)
        {
            if(buyPrice < prices[i]) // It means profit
            {
                // today's profit
                int profit = prices[i] - buyPrice;

                maxProfit = Math.max(profit, maxProfit);
            }
            else
            {
                // update buy price
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {

        int a[] = {7,1,5,3,6,4};

        int result = buySellStocks(a);

        System.out.println("Max profit is : "+ result);
    }
}
