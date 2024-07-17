package TwoPointer;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            // Calculate the width
            int width = right - left;

            // Calculate the height
            int h = Math.min(height[left], height[right]);

            // Calculate the area
            int area = width * h;

            // Update maxArea if the current area is greater
            maxArea = Math.max(maxArea, area);

            // Move the pointers
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
public static void main(String args[])
{
    int h[] = {1,8,6,2,5,4,8,3,7};

    int m = maxArea(h);
    System.out.println(m);
}
}
