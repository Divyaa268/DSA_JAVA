package Patterns;

public class InvertedHalf180Deg {

    public static void main(String[] args) {

        int n = 5;

        for(int r=1;r<=n;r++)
        {
            for(int s=n-r;s>0;s--)
            {
                System.out.print(" ");
            }
            for (int c=1;c<=r;c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
