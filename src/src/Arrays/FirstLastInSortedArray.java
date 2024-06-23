package Arrays;

public class FirstLastInSortedArray {

    public static int[] searchRange(int[] nums, int target) {
                int first = -1;
                int last = -1;

                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == target) {
                        if (first == -1) {
                            first = i;
                        }
                        last = i;
                    }
                }

                return new int[] {first, last};
            }

    public int[] searchRangeOpt(int[] nums, int target) {

        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
    }

    private int findFirst(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            if (nums[mid] == target) {
                index = mid;
            }
        }
        return index;
    }

    private int findLast(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            if (nums[mid] == target) {
                index = mid;
            }
        }
        return index;
    }


    public static void main(String[] args) {
        int[] nums1 = {5,7,7,8,8,10};
        int t = 8;
//        System.out.println("The median is: " + searchRange(nums1, t));

       int res[] =  searchRange(nums1, t);

       for(int i=0;i<res.length;i++)
       {
           System.out.println(res[i]);
       }
    }
}
