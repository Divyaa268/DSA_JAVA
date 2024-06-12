package Problems151.src.Arrays;

public class RotateArray_189 {

    // left rotate
//    private static void rotate(int[] a, int k) {
//        int l = a.length;
//        int t[] = new int[l];
//
//        int c = 0;
//
//        for (int i = 0; i < k; i++) {
//            t[i] = a[i];
//        }
//
//        for (int d = k; d < l; d++) {
//            a[d - k] = a[d];
//        }
//
//        for (int j = l - k; j < l; j++) {
//            a[j] = t[c++];
//        }
//
//        for (int i = 0; i < l; i++) {
//            System.out.print(a[i]);
//        }
//    }

    public static void rotate(int[] arr, int d) {

        int l=arr.length;
        int t[]=new  int[l];
        int k=0;
        for(int i=0;i<d;i++)
        {
            t[i]=arr[i];

        }
        for(int i=d;i<l;i++)
        {
            arr[i-d]=arr[i];
        }
        for(int i=l-d;i<l;i++)
        {
            arr[i]=t[k++];
        }
    }

    // Right rotate

    public static void reverse(int a[], int s, int e) {

        int si = s;
        int ei = e;
        while (si < ei )
        {
            int t = a[si];
            a[si] = a[ei];
            a[ei] = t;

            si++;
            ei--;
        }
    }

    public static void rotateRight(int a[], int k) {
        int l = a.length;

        System.out.println("right ");
        k = k % l;
        if(k < 0){
            k += l;
        }

//        reverse(a, 0, l - k - 1);  // first half reverse
//        reverse(a, l - k, l - 1);  // second half reverse
//        reverse(a, 0, l - 1);  // whole reverse

        reverse(a, 0, k-1);  // first half reverse
        reverse(a, k, l - 1);  // second half reverse
        reverse(a, 0, l - 1);  // whole reverse


    }

    public static void rotateLeft(int a[], int k) {  // rotate by k from last to first
        int l = a.length;

        System.out.println("Left rotatte");
        k = k % l;
        if(k < 0){
            k += l;
        }
//
//        reverse(a, 0, l - 1);  // whole reverse
//        reverse(a, 0, k);  // first half reverse
//        reverse(a,k+1 , l - 1);  // second half reverse
        reverse(a, 0, l - 1);  // Reverse the entire array
        reverse(a, 0, l - k - 1);  // Reverse the first part
        reverse(a, l - k, l - 1);  // Reverse the second part
    }

    public static void main(String[] args) {

//        int a[] = {1, 2, 3, 4, 5, 6, 7};
//        int a[] = {-1,-100,3,99};

//        int a[] = {1,2,3,4,5};
//        int k = 2;

        int a[] = {4,1,6,9,2,4,7,8,3};
        int k = 6;
//
//        rotateRight(a, k);
//
//        for(int i =0;i<a.length;i++)
//        {
//            System.out.print(a[i]);
//        }
//        System.out.println();
//
        rotateLeft(a, k);
        for(int i =0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }

//        System.out.println();
//        rotate(a, k);
//        for(int i =0;i<a.length;i++)
//        {
//            System.out.print(a[i]);
//        }


    }
}

