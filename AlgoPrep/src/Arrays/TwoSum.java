package Arrays;

public class TwoSum {

    public static void main(String args[])
    {
        int nums[] = {2,7,11, 15};
        int target = 9;

        int a[] = twoSum(nums, target);

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }

    }

    public static int[] twoSum(int[] nums, int target) {

        int l = nums.length;
        int a[] = new int[2];
        int k =0;



        for(int i =0; i<l;i++)
        {
            for(int j=i+1; j<l;j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    a[k++] = i;
                    a[k++] = j;

                }
            }
        }
        return a;
    }
}
