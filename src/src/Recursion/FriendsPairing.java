package Recursion;

public class FriendsPairing {

    public static int friendsPair(int n)
    {
        if(n==1 || n==2)
        {
            return n;
        }

        // single
        int single = friendsPair(n-1);

        // pair
        int fnm2 = friendsPair(n-2);
        int pairWays = (n-1) * fnm2;

        // Total ways
        int totalWays = single + pairWays;
        return totalWays;
    }

    public static void main(String[] args) {
       int res =  friendsPair(3);
        System.out.println(res + " ways");
    }
}
