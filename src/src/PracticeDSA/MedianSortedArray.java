package PracticeDSA;

public class MedianSortedArray {

        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int[] mergedArray = mergeArrays(nums1, nums2);
            int totalLength = mergedArray.length;

            if (totalLength % 2 == 0) {
                return ((double) mergedArray[totalLength / 2 - 1] + mergedArray[totalLength / 2]) / 2;
            } else {
                return mergedArray[totalLength / 2];
            }
        }

        private static int[] mergeArrays(int[] nums1, int[] nums2) {
            int[] mergedArray = new int[nums1.length + nums2.length];
            int i = 0, j = 0, k = 0;

            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] < nums2[j]) {
                    mergedArray[k++] = nums1[i++];
                } else {
                    mergedArray[k++] = nums2[j++];
                }
            }

            while (i < nums1.length) {
                mergedArray[k++] = nums1[i++];
            }

            while (j < nums2.length) {
                mergedArray[k++] = nums2[j++];
            }

            return mergedArray;
        }

        public static void main(String[] args) {
            int[] nums1 = {1, 3};
            int[] nums2 = {2};
            System.out.println("The median is: " + findMedianSortedArrays(nums1, nums2));

            int[] nums3 = {1, 2};
            int[] nums4 = {3, 4};
            System.out.println("The median is: " + findMedianSortedArrays(nums3, nums4));
        }
    }

