package Arrays;

import java.util.*;

public class EquilibriumIndex {

    public static void leftRightSum(int[] arr)
    {
        int[] totalTillIndex = new int[arr.length];
        int total = 0;

        for(int i=0; i<arr.length; i++)
        {
            total += arr[i];
            totalTillIndex[i] = total;
        }

        int resultIndexValue = -1;

        for(int i=1; i<arr.length; i++)
        {
            int leftSum = totalTillIndex[i-1];
            int rightSum = totalTillIndex[arr.length-1] - totalTillIndex[i];

//            System.out.println("left " + leftSum);
//            System.out.println("right"  + rightSum);

            if(leftSum == rightSum)
            {
                resultIndexValue = i;
                break;
            }
        }

        if(resultIndexValue == -1)
        {
            System.out.println("No Solution Exists; returning -1");
        }
        else
        {
            System.out.println("Solution Exists at Index " + resultIndexValue);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sizeOfArr = sc.nextInt();
        int[] arr = new int[sizeOfArr];

        for(int i=0; i<sizeOfArr; i++)
        {
            arr[i] = sc.nextInt();
        }

        leftRightSum(arr);

        sc.close();
    }

}
