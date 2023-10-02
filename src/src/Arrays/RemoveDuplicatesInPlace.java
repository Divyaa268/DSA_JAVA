package Arrays;

import java.util.ArrayList;

public class RemoveDuplicatesInPlace {

    public static void main(String[] args) {

//        int a[] = {1,1,2};
        int a[] = {0,0,1,1,1,2,2,3,3,4};
        int res = removeDuplicates(a);
        System.out.println(res);

    }

    public static int removeDuplicates(int[] nums) {

//        ArrayList<Integer> a = new ArrayList<>();
//
//        for(int i=0;i<nums.length;i++)
//        {
//            a.add(nums[i]);
//        }
//
//        for(int i =0;i<a.size()-1;i++)
//        {
//            if(a.get(i) == a.get(i+1))
//            {
//                a.remove(i-1);
//            }
//        }
//
//        return a.size();

        int l = nums.length;

        int c = 0;

        if (l == 0)
            return 0;

        for(int i=0;i<l-1;i++)
        {
            if( nums[i] != nums[i+1])
            {
                nums[c++] = nums[i];
            }
        }
        nums[c++] = nums[l-1];

        return c;


    }
}
