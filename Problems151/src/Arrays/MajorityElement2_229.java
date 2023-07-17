package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2_229 {

    public static List<Integer> majorityElement2(int[] nums) {

        int num1 = -1;
        int num2 = -1;
        int count1 = 0;
        int count2 = 0;
        int l = nums.length;

        for(int i=0;i<l;i++)
        {
            if(nums[i] == num1)
            {
                count1++;
            }
            else if (nums[i] == num2)
            {
                count2++;
            }
            else if (count1 == 0)
            {
                num1 = nums[i];
                count1 = 1;

            }
            else if (count2 == 0)
            {
                num2 = nums[i];
                count2 = 1;
            }
            else
            {
                count1--;
                count2--;
            }
        }

        List<Integer> result = new ArrayList<>();
        count1 = 0;
        count2 = 0;

        for (int i =0;i<l;i++)
        {
            if(nums[i] == num1)
                count1++;
            if (nums[i] == num2)
                count2++;
        }
        if(count1 > l/3 && num1!=num2)
        {
            result.add(num1);
        }
        if(count2 > l/3 )
        {
            result.add(num2);
        }

        return result;
    }
    public static void main(String[] args) {

//        int a[] = {2,2,1,1,1,2,2};
        int a[] = {-1,-1,-1};
        List<Integer> element = majorityElement2(a);
        System.out.println(element);
    }


}
