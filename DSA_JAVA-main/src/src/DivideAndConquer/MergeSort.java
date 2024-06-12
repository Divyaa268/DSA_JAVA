package DivideAndConquer;

public class MergeSort {

    public static void merge(int a[], int si, int mid, int ei)
    {
        int t[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while (i <= mid && j <= ei)
        {
            if(a[i] < a[j])
            {
                t[k++] = a[i++];
            }
            else
            {
                t[k++] = a[j++];
            }
        }

        // remaining elements from left
        while(i <= mid)
        {
            t[k++] = a[i++];
        }

        while(j <= ei)
        {
            t[k++] = a[j++];
        }

        // copy temp to original array
        for(k=0, i=si; k<t.length;k++, i++)
        {
            a[i] = t[k];
        }
    }

    public static void mergeSort(int a[], int si, int ei)
    {
        if(si >= ei)
        {
            return;
        }

        int mid = si + (ei - si)/2;

        // left
        mergeSort(a, si, mid);

        // right
        mergeSort(a, mid+1, ei);

        merge(a, si, mid, ei);

    }

    public static void main(String[] args) {

        int a[] = {6,3,9,8,5,4,1};
        mergeSort(a,0,a.length-1);

        for(int i =0;i<a.length;i++)
        {
            System.out.print(a[i]+ " ");
        }

    }
}
