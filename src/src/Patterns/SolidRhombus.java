package Patterns;

public class SolidRhombus {

    public static void main(String[] args) {

        int n= 5;

        for(int i=n;i>=1;i--)
        {
            for(int s = 1;s<=i-1;s++)
            {
                System.out.print("-");
            }
            for (int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
