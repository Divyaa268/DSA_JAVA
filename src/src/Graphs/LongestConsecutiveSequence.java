package Graphs;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;  // If the array is empty, return 0
        }

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);  // Add all elements to the set
        }

        int maxLength = 0;

        for (int num : nums) {
            // Check if it's the start of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                // Count the length of the current sequence
                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentLength += 1;
                }

                // Update the maximum length
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;  // Return the maximum length of consecutive elements sequence
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums1));  // Output: 4

        // Example 2
        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(longestConsecutive(nums2));  // Output: 9
    }
}

