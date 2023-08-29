package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SalesByMatch {

    public static int sockMerchant(int n, List<Integer> ar) {

        int l=ar.size();

        int pairs = 0;
        int count = 0;
        for(int i=0;i<l;i++)
        {

            for (int j=i+1;j<l;j++)
            {
                if (ar.get(j) != -1 && ar.get(i) != -1)
                {
                    if (ar.get(i) == ar.get(j))
                    {
                        count++;
                        ar.remove(j);
                        ar.add(j, -1);
                    }
                }
                if(count == 2)
                {
                    pairs++;
                    count = 0;
                }
            }
//            if(count % 2 == 0)
//            pairs = count/2;
//            else
//                pairs = count/2 + 1;

        }

        return pairs;
    }

    public static void main(String[] args) {

        int n = 9;
        List<Integer> socks = new ArrayList<>();

        socks.add(1);
        socks.add(2);
        socks.add(1);
        socks.add(2);
        socks.add(1);
        socks.add(3);
        socks.add(2);

//        socks.add(10);
//        socks.add(20);
//        socks.add(20);
//        socks.add(10);
//        socks.add(10);
//        socks.add(30);
//        socks.add(50);
//        socks.add(10);
//        socks.add(20);

        int pairs = sockMerchant(n, socks);
        System.out.println("No. of socks pair : " + pairs);

    }
}
