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
