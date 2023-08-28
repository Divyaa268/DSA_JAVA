package Stack;

import java.util.Stack;

public class StockSpan {

    public static void stockSpan(int stocks[], int span[])
    {
        Stack<Integer> s = new Stack<>(); // to store index of stock values

        span[0] = 1;
        s.push(0);

        for (int i = 1; i < stocks.length;i++)  // traversing all stocks
        {
            int currPrice = stocks[i];
            while (!s.isEmpty() && currPrice > stocks[s.peek()])
            {
                // delete element from stack if price at top is smaller than currPrice
                s.pop();
            }
            if(s.isEmpty())
            {
                span[i] = i + 1;
            }
            else
            {
                int prevHigh = s.peek(); // prevHigh is index stored at top of stack
                span[i] = i - prevHigh;

            }
            s.push(i);
        }

    }

    public static void main(String[] args) {
        int stocks[] = {100, 80, 60, 70, 60, 85, 100 };
//        int stocks[] = {7,1,5,3,6,4};
        int span[] = new int[stocks.length];

        stockSpan(stocks, span);

        for (int i=0;i<span.length;i++)
        {
            System.out.println(span[i]+ " ");
        }
    }
}
