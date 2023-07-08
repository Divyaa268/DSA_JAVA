package Patterns;

public class InvertedHalfPyramid {

    public static void main(String[] args) {

        int n = 5;

        for(int r=n;r>0;r--)
        {
            for(int c=0;c<r;c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
