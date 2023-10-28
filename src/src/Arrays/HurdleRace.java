package Arrays;

import java.util.*;
public class HurdleRace {

    public static int hurdleRace(int k, List<Integer> height) {

    List<Integer> h = new ArrayList<>();

    int max =0;

    for(int i=0;i<height.size();i++)
    {
        if(height.get(i) > max)
        {
            max = height.get(i);
        }
    }
    if(k < max)
    {
        System.out.println(max);
        return max - k;

    }
    else
    {

    for(int i=0;i<height.size();i++)
    {
        if(height.get(i) > k)
        {
            h.add(height.get(i));
        }
    }

    int sum = 0;
    for(int j=0;j<h.size();j++)
    {
        System.out.println(h.get(j));
        if(h.get(j) > max)
        {
            max = h.get(j);
        }
        sum = sum + (h.get(j) - k);
        System.out.println(sum);
    }
    return sum;

}
}
}
