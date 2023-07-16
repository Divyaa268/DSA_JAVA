package Arrays;

public class MajorityElement_169 {

    public static int majorityElement(int[] nums) {

        // Moore's voting algo

        int count =0;
        int majorityElement = 0;

        for(int i=0;i<nums.length;i++)
        {
            if(count ==0)
            {
                majorityElement = nums[i];
            }
            if( majorityElement == nums[i])
            {
                count += 1;
            }
            else
            {
                count -= 1;
            }
        }
        return majorityElement;
    }

    public static void main(String[] args) {

        int a[] = {2,2,1,1,1,2,2};
        int element = majorityElement(a);
        System.out.println(element);
    }
}
