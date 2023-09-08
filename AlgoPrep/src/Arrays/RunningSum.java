package Arrays;

public class RunningSum {

    public static void main(String[] args) {

        int nums[] = {1,2,3,4};

        int a[] = runningSum(nums);

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
    }

    public static int[] runningSum(int[] nums) {

        int l = nums.length;
        int a[] = new int[l];
        int k =0;
        int sum = 0;

        for(int i=0;i<l;i++)
        {
            sum = sum + nums[i];
            a[k++] = sum;

        }
        return a;
    }

}
