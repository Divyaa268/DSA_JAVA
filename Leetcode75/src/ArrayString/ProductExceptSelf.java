package ArrayString;

public class ProductExceptSelf {

        public int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] result = new int[n];

            // Initialize the result array with 1s for the product calculation
            for (int i = 0; i < n; i++) {
                result[i] = 1;
            }

            // Calculate the product of elements to the left of each element
            int leftProduct = 1;
            for (int i = 0; i < n; i++) {
                result[i] = leftProduct;
                leftProduct *= nums[i];
            }

            // Calculate the product of elements to the right of each element
            int rightProduct = 1;
            for (int i = n - 1; i >= 0; i--) {
                result[i] *= rightProduct;
                rightProduct *= nums[i];
            }

            return result;
        }

        public static void main(String[] args) {
            ProductExceptSelf solution = new ProductExceptSelf();

            int[] nums1 = {1, 2, 3, 4};
            int[] result1 = solution.productExceptSelf(nums1);
            for (int num : result1) {
                System.out.print(num + " ");
            }
            // Output: 24 12 8 6

            System.out.println();

            int[] nums2 = {-1, 1, 0, -3, 3};
            int[] result2 = solution.productExceptSelf(nums2);
            for (int num : result2) {
                System.out.print(num + " ");
            }
            // Output: 0 0 9 0 0
        }
    }
