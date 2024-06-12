package HashMap;

import java.util.ArrayList;
import java.util.HashSet;

public class CountDistinctElements {

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4, 2, 1, 5, 6, 7, 8, 4};

        HashSet<Integer> hs = new HashSet<>();

        for (int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
        }

        System.out.println("Count is : "+ hs.size());
    }

//        // arraylist solution
//        int l = nums.length;
//        int c = 0;
//        ArrayList<Integer> b = new ArrayList<>();
//
//        for (int i = 0; i < l; i++) {
//            if (b.contains(nums[i])) {
//                continue;
//
//            } else {
//                b.add(nums[i]);
//                c++;
//            }
//
//        }
//        System.out.println(c);
//    }
}