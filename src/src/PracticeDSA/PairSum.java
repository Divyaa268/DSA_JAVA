package PracticeDSA;

import java.util.HashMap;
import java.util.Map;

public class PairSum {
        public static int[] findTwoSum(int[] nums, int target) {
            // Create a hash map to store the numbers and their indices
            Map<Integer, Integer> map = new HashMap<>();

            // Iterate through the array
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];

                // Check if the complement exists in the map
                if (map.containsKey(complement)) {
                    // Return the indices of the two numbers that add up to the target
                    return new int[] {map.get(complement), i};
                }

                // Add the current number and its index to the map
                map.put(nums[i], i);
            }

            // If no such pair exists, return an empty array
            return new int[0];
        }

        public static void main(String[] args) {
            int[] nums = {2, 7, 11, 15};
            int target = 9;

            int[] result = findTwoSum(nums, target);

            if (result.length == 0) {
                System.out.println("No pair found that adds up to the target sum.");
            } else {
                System.out.println("Pair found at indices: " + result[0] + " and " + result[1]);
                System.out.println("Numbers are: " + nums[result[0]] + " and " + nums[result[1]]);
            }
        }
    }

