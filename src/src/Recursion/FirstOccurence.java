package Recursion;

public class FirstOccurence {

    public static int firstOccur(int a[], int i,int n)
    {
        if(i == a.length - 1)
        {
            return -1;
        }
        if(a[i] == n )
        {
            return i;
        }
       return firstOccur(a, i+1,n);
    }

    public static void main(String[] args) {
        int a[] = {1,2,5,7,8,4};
        int n = 3;
        int i = firstOccur(a,0, n);
        System.out.println(i);
    }
}
