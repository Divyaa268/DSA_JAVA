package Arrays;

public class PairsInArray {

    public static void pairs(int a[])
    {
        int l = a.length;

        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                System.out.println(a[i] + " , " + a[j]);
            }
        }
    }

    public static void main(String[] args) {

        int a[] = {2,4,5,6,7,8};

        pairs(a);
    }
}
