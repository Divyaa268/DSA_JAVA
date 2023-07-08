package Patterns;

public class Triangle01 {

    public static void main(String[] args) {

        for(int r=1;r<=5;r++)
        {
            for(int c=1;c<=r;c++)
            {
                if((r+c)%2 != 0)
                {
                    System.out.print("0");
                }
                else
                {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
