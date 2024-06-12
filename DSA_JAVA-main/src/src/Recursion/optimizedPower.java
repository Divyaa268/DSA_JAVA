package Recursion;

public class optimizedPower {

    public static int optPower(int x, int n)
    {
        if(n == 0)
        {
            return 1;
        }

        int halfPower = optPower(x,n/2) * optPower(x,n/2);


        // if n is odd
        if(n%2 != 0)
        {
            halfPower = x * halfPower;
        }
        return halfPower;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int p = optPower(x,n);
        System.out.println(p);
    }
}
