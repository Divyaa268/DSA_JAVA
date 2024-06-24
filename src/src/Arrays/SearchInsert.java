package Arrays;

public class SearchInsert {
        public int searchInsert(int[] nums, int target) {
            // Edge case: if array is empty, target should be inserted at index 0
            if (nums.length == 0) {
                return 0;
            }

            // Linear search to find the insertion index
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= target) {
                    return i;
                }
            }

            // If target is greater than all elements in nums, insert at the end
            return nums.length;
        }

    public int searchInsertOptimized(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // If target is not found, left will be the index to insert
        return left;
    }

        public static void main(String[] args) {
            SearchInsert solution = new SearchInsert();

            int[] nums1 = {1, 3, 5, 6};
            int target1 = 5;
            System.out.println(solution.searchInsert(nums1, target1));  // Output: 2

            int[] nums2 = {1, 3, 5, 6};
            int target2 = 2;
            System.out.println(solution.searchInsert(nums2, target2));  // Output: 1

            int[] nums3 = {1, 3, 5, 6};
            int target3 = 7;
            System.out.println(solution.searchInsert(nums3, target3));  // Output: 4
        }
    }
