package Arrays;

import java.util.Arrays;

public class MinInRotatedSortedArray {

    public static int findMin(int[] nums) {

        int l = nums.length;


        Arrays.sort(nums);

        return nums[0];
    }

    public static void main(String args[]) {
//        int a[] = {1,2,3,1};
        int a[] = {1, 2, 3, 5, 6, 4};

        System.out.println(findMin(a));
//        System.out.println(searchoOptimized(a, 5));
    }

}
