package Recursion;

public class LastOccurence {

    public static int lastOccur(int a[], int i, int n) {
//        if(i < 0)
//        {
//            return -1;
//        }
//        if(a[i] == n )
//        {
//            return i;
//        }
//        return lastOccur(a, i-1,n);
//    }

        for (int j = a.length - 1; j >= 0; j--) {
            if (a[j] == n)
            {
                return j;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        int a[] = {1,2,5,7,8,4,2};
        int n = 2;
        int i = lastOccur(a,a.length-1, n);
        System.out.println(i);
    }
}
