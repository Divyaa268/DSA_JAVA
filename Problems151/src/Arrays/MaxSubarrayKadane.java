package Arrays;

// Question 53

public class MaxSubarrayKadane {

    public static int maxSubArray(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];

                if (sum > max) {
                    max = sum;
                }

            }
        }

        return max;

    }

    public static int maxSubArrayKadane(int[] nums)
    {

        int max = Integer.MIN_VALUE;
        int currSum = 0;
        int l = nums.length;

        for(int i=0;i<l;i++)
        {
            currSum = currSum + nums[i];

            if(currSum > max)
            {
                max = currSum;
            }

            if(currSum < 0)
            {
                currSum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int a[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int b = maxSubArray(a);
        System.out.println(b);

        int c = maxSubArrayKadane(a);
        System.out.println("Kadane's " + c);
    }
}



