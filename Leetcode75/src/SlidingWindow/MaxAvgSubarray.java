package SlidingWindow;

public class MaxAvgSubarray {

    public static double findMaxAverage(int[] nums, int k) {

        // Calculate the sum of the first k elements
        double maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }

        // Initialize current sum to be the sum of the first k elements
        double currentSum = maxSum;

        // Slide the window over the rest of the array
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }

        // Return the maximum average
        return maxSum / k;
    }

    public static void main(String args[])
    {
        int a[] = {1,12,-5,-6,50,3};
        int k =4;
        System.out.println(findMaxAverage(a, k));
    }

}
