package Arrays;

public class BinarySearch {

    public static int binarySearch(int a[], int n)
    {

        int l = a.length;
        int s=0;
        int e=l-1;


        while(s<=e)
        {
            int mid = (s+e)/2;
            if(n == a[mid])
            {
                return mid;
            }
            if(a[mid] < n)
            {
                s = mid+1;
            }
            else
            {
                e = mid - 1;
            }
        }
        return -1;
    }



    public static void main(String[] args) {

        int a[] = {1,2,3,4,5,6,7,8};
        int n = 9;
        int bin = binarySearch(a,n);

        if(bin == -1)
        {
            System.out.println("Number not found! ");
        }
        else {
            System.out.println("Number found at index : " + bin);
        }
    }
}
