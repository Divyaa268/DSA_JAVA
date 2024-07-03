package ArrayString;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> res = new ArrayList<>();

        int l = candies.length;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<l;i++)
        {
            if(candies[i] > max)
            {
                max = candies[i];
            }
        }

        for(int j=0;j<l;j++)
        {
            if(candies[j] + extraCandies >= max) {

                res.add(true);
            }
            else
            {
                res.add(false);
            }

        }
        return res;
    }

    public static void main(String args[])
    {
        int candies[] = {2,3,5,1,3};
        int extraCandies = 3;

        System.out.println(kidsWithCandies(candies, extraCandies));
    }

}