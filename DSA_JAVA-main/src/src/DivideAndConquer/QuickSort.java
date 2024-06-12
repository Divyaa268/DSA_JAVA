package DivideAndConquer;

public class QuickSort {

    public static void quick(int a[], int si, int ei)
    {
        // base case
        if(si >= ei)
        {
            return;
        }
        int pivotIndex = partition(a,si,ei);
        quick(a, si, pivotIndex -1);
        quick(a,pivotIndex+1, ei);
     }

     public static int partition(int a[], int si, int ei)
     {
         int pivotEle = a[si];
         int countSmallerNum = 0;

         for (int i = si+1;i<=ei;i++)
         {
             if(pivotEle > a[i])
             {
                 countSmallerNum++;
             }
         }
         int t = a[si+countSmallerNum];
         a[si+countSmallerNum] = pivotEle;
         a[si] = t;

         int i=si;
         int j=ei;

         while(i<j)
         {
             if(a[i] < pivotEle)
             {
                 i++;
             }
             else if(a[j] >= pivotEle)
             {
                 j--;
             }
             else
             {
                 int temp = a[i];
                 a[i] = a[j];
                 a[j] = temp;
                 i++;
                 j--;
             }
         }
         return si+countSmallerNum;
     }


    public static void main(String[] args) {

        int a[] = {2,5,1,6,3,9,8,7};
        quick(a,0, a.length-1);
        for (int i =0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }

    }
}
