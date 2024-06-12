package Arrays;

public class TrappingRainwater_42 {

    // Time Complexity - O(N)
    public static int trappedRainwater(int height[])
    {
        int l = height.length;

        // calculate left max boundary array
        int leftMax[] = new int[l];

        leftMax[0] = height[0];

        for(int i=1;i<l;i++)
        {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // calculate right max boundary array
        int rightMax[] = new int[l];

        rightMax[l-1] = height[l-1];

        for(int j=l-2;j>=0;j--)
        {
            rightMax[j] =   Math.max(height[j], rightMax[j+1]);
        }

        // loop
        int trappedWater = 0;

        for (int i=0;i<l;i++)
        {
            // Calculate the water level
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // calculate the trapped water
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {

        // Array contains height of the bars
        int a[] = {4,2,0,6,3,2,5};

        int result = trappedRainwater(a);
        System.out.println("Total trapped rainwater is : "+ result);
    }
}
