package Patterns;

public class HalfPyramid {

    public static void main(String[] args) {

        for(int r=0;r<5;r++)
        {
            for(int c=0;c<=r;c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
