package Arrays;

import java.util.Arrays;

public class SecondLargestNum {

    public static int secondLargestNum(int a[]) {
        int l = a.length;
        int secondLar = Integer.MIN_VALUE;

        if (l < 2) {
            return -1;
        }

        Arrays.sort(a);

        for (int i = l - 2; i >= 0; i--) {

            if (a[l - 1] != a[i]) {
                return a[i];
            }

        }
        return -1;
    }

    public static void main(String[] args) {

//        int a[] = {2, 4, 7, 8, 9, 3};
        int a[] = {1,2};

        int largest = secondLargestNum(a);

        System.out.println("Second Largest Number is: " + largest);
    }
    }
