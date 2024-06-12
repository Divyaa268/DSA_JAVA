package Recursion;

public class FindAllOccurences {

    public static void findOccurences(int a[], int key, int i)
    {
        int l = a.length;
        int t[] = new int[l];

        if(l==0)
        {
            System.out.println("Array is empty");
        }
        if(i == l)
        {
            return;
        }
        if(a[i] == key)
        {
            System.out.println(i+ " ");
        }
        findOccurences(a,key, i+1);

    }

    public static void main(String[] args) {
        int a[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        findOccurences(a,key, 0);

    }
}
