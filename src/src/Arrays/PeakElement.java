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

    public static void main(String args[])
    {
//        int a[] = {1,2,3,1};
        int a[] = {1,2,1,3,5,6,4};

        System.out.println(findPeakElement(a));
    }
}
