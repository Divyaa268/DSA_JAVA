package Arrays;

public class MajorityElement_169 {

    public static int majorityElement(int[] nums) {

        // Moore's voting algo

        int count = 0;
        int majorityElement = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                majorityElement = nums[i];
            }
            if (majorityElement == nums[i]) {
                count += 1;
            } else {
                count -= 1;
            }
        }
        return majorityElement;
    }

    // Brute force -
//    public static int majorityElement(int[] nums) {
//    int majorityCount = nums.length / 2;
//        for (int i = 0; i < nums.length; i++) {
//        int num = nums[i];
//        int count = 0;
//        for (int j = 0; j < nums.length; j++) {
//            int elem = nums[j];
//            if (elem == num) {
//                count += 1;
//            }
//        }
//        if (count > majorityCount) {
//            return num;
//        }
//    }
//        return -1;
//}
    public static void main(String[] args) {

        int a[] = {2,2,1,1,1,2,2};
        int element = majorityElement(a);
        System.out.println(element);
    }
}
