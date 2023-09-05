package Arrays;

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
        k = k % l;
        if(k < 0){
            k += l;
        }

//        reverse(a, 0, l - k - 1);  // first half reverse
//        reverse(a, l - k, l - 1);  // second half reverse
//        reverse(a, 0, l - 1);  // whole reverse

        reverse(a, 0, k);  // first half reverse
        reverse(a, k+1, l - 1);  // second half reverse
        reverse(a, 0, l - 1);  // whole reverse


    }

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5, 6, 7};
//        int a[] = {-1,-100,3,99};
        int k = 3;

        rotateRight(a, k);

        for(int i =0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }

    }
}

