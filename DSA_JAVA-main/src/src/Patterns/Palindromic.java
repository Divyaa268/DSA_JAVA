package Patterns;

public class Palindromic {

    public static void main(String[] args) {

        int n=5;

        for(int i=1;i<=n;i++)
        {
            for(int s=1;s<=n-i;s++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }

            // right side of triangle
            for(int k=2;k<=i;k++)
            {
                    System.out.print(k);
            }
            System.out.println();
        }
    }
}
