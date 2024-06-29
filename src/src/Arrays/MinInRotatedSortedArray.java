package Arrays;

import java.util.Arrays;

public class MinInRotatedSortedArray {

    public static int findMin(int[] nums) {  // o(nlogn)

        int l = nums.length;


        Arrays.sort(nums);

        return nums[0];
    }

    public static int findMin1(int[] nums) { // o(n)

        int l = nums.length;
        int min =Integer.MAX_VALUE;
        for(int i=0;i<l;i++)
        {
            if(nums[i] < min )
            {
                min = nums[i];
            }
        }
        return min;
    }

    public static int findMinOptimized(int[] nums) {  // o(log)

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (nums[mid] > nums[right]) {
                // The minimum is in the right part of the array
                left = mid + 1;
            } else {
                // The minimum is in the left part of the array (including mid)
                right = mid;
            }
        }

        return nums[left]; // or nums[right] since left == right

    }

    public static void main(String args[]) {
//        int a[] = {1,2,3,1};
        int a[] = {3,4,5,1,2};

        System.out.println(findMin(a));
        System.out.println(findMin1(a));
        System.out.println(findMinOptimized(a));
//        System.out.println(searchoOptimized(a, 5));
    }

}
