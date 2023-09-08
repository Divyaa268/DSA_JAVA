package Arrays;

public class RemoveElement {

    public static void main(String[] args) {

        int k = 3;
        int a[] = {3,2,2,3};
         int c = removeElement(a,k);
        System.out.println(c);
    }

    public static int removeElement(int[] nums, int val) {

        int l = nums.length;
        int c = 0;

        for(int i=0;i<l;i++)
        {
            if(nums[i] !=  val)
            {
                nums[c++] = nums[i];
            }
        }
        return c;
    }
}
