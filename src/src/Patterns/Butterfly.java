package Patterns;

public class Butterfly {

    public static void main(String[] args) {
        for (int r = 1; r <= 4; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print("*");
            }
            for (int k = 4; k > r; k--) {
                System.out.print("-");
            }
            for (int s = 4 - r; s > 0; s--) {
                System.out.print("-");
            }
            for (int t = 1; t <= r; t++) {
                System.out.print("*");
            }

            System.out.println();
        }
//        ---------------------------------------------------

//        for (int r = 5; r >= 1; r--)
//        {
//            for (int c = r; c >1; c--)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for(int i=1;i<=4;i++)
//        {
//
//            for(int s=0;s<i;s++)
//            {
//                System.out.print("-");
//            }
//            for(int j=4;j>=i;j--)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        int n = 4;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            int s = 2 * (n - i);
            for (int j = 1; j <= s; j++) {
                System.out.print("-");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
