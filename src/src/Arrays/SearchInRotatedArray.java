package Arrays;

public class SearchInRotatedArray {


    public static int search(int[] nums, int target) {

        int l = nums.length;

        for (int i = 0; i < l - 1; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int searchoOptimized(int[] nums, int target) {
    int left = 0;
    int right = nums.length -1;

        while(left <= right)
    {
        int mid = (left + right)/2;

        if(nums[mid] == target)
        {
            return mid;
        }

        // check which half is sorted
        if(nums[left] <= nums[mid])
        {
            // find target in left half
            if(nums[left] <= target && target < nums[mid])
            {
                right = mid-1;
            }
            else
            {
                left = mid +1;
            }
        }
        else
        {
            // right half is sorted
            if(nums[mid] < target && target <= nums[right])
            {
                left = mid + 1;
            }
            else
            {
                right = mid-1;
            }
        }
    }
        return -1;
}


    public static void main(String args[]) {
//        int a[] = {1,2,3,1};
        int a[] = {1, 2, 1, 3, 5, 6, 4};

        System.out.println(search(a, 5));
        System.out.println(searchoOptimized(a, 5));
    }
}
