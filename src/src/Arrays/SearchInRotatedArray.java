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

    public static void main(String args[]) {
//        int a[] = {1,2,3,1};
        int a[] = {1, 2, 1, 3, 5, 6, 4};

        System.out.println(search(a, 5));
    }
}
