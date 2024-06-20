package Arrays;

public class PeakElement {

    public static int findPeakElement(int[] nums) { // O(n)

        int l = nums.length;

        for(int i=0;i<l-1;i++)
        {
            if(nums[i+1] < nums[i])
            {
                return i;
            }
        }
        return -1;
    }

    public static int findPeakElementOptimzed(int[] nums) { // O(log n)

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // Peak is in the left half including mid
                right = mid;
            } else {
                // Peak is in the right half excluding mid
                left = mid + 1;
            }
        }

        return left;
    }


    public static void main(String args[])
    {
//        int a[] = {1,2,3,1};
        int a[] = {1,2,1,3,5,6,4};

        System.out.println(findPeakElement(a));
        System.out.println(findPeakElementOptimzed(a));
    }
}
