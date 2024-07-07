package ArrayString;

public class IncreasingTripletSubseq {

    public boolean increasingTriplet(int[] nums) {

//         int l = nums.length;

//         for(int i=0;i<l-2;i++)
//         {
//             for(int j=i+1;j<l-1;j++)
//             {
//                 for(int k=j+1;k<l;k++)
//                 {
//                     if ((i < j) && (j < k) && (i < k) && (nums[i] < nums[j]) && (nums[j] < nums[k]) && (nums[i] < nums[k])) {
//     return true;
// }

//                 }
//             }
//         }
//         return false;
//     }
// }
        if (nums.length < 3) {
            return false;
        }

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {
                return true; // Found a number greater than both 'first' and 'second'
            }
        }

        return false; // No increasing triplet found
    }

    public static void main(String[] args) {
        IncreasingTripletSubseq solution = new IncreasingTripletSubseq();

        int[] nums1 = {1, 2, 3, 4, 5};
        System.out.println(solution.increasingTriplet(nums1)); // Output: true

        int[] nums2 = {5, 4, 3, 2, 1};
        System.out.println(solution.increasingTriplet(nums2)); // Output: false

        int[] nums3 = {2, 1, 5, 0, 4, 6};
        System.out.println(solution.increasingTriplet(nums3)); // Output: true
    }
}

