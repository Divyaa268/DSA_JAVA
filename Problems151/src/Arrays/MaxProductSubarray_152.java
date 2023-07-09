package Arrays;

public class MaxProductSubarray_152 {

    public static int maxProduct(int[] nums)
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 1;

            for (int j = i; j < nums.length; j++) {
                sum = sum * nums[j];

                if (sum > max) {
                    max = sum;
                }

            }
        }

        return max;
    }

    public static void main(String[] args) {

        int a[] = {2,3,-2,4};

        int b = maxProduct(a);
        System.out.println(b);


    }
}
