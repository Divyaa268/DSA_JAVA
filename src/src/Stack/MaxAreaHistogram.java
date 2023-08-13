package Stack;

import java.util.Stack;

public class MaxAreaHistogram {

    public static void maxArea(int heights[]) {
        int maxArea = 0;
        int nsl[] = new int[heights.length];
        int nsr[] = new int[heights.length];

        // next small right
        Stack<Integer> s = new Stack<>();

        for (int i = heights.length - 1; i > -0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = heights.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // Next smaller left
        s = new Stack<>();

        for (int i = 0; i < heights.length; i++)
        {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // current area
        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }
        System.out.println("Max area is : " + maxArea);
    }


    public static void main(String[] args) {
        int heights[] = {2,1,5,6,2,3};
        maxArea(heights);
    }
}
