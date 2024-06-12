package Recursion;

public class CountPaths {

    public static int countPaths(int i, int j, int n, int m)
    {
        if (i == n || j == m)
        {
            return 0;
        }
        if(i == n-1 && j == m-1)
        {
            return 1;
        }

        int down = countPaths(i+1, j, n,m);

        int right = countPaths(i,j+1,n,m);

        int totalPaths = down + right;

        return totalPaths;
    }

    public static void main(String[] args) {
        int n = 3;
        int m =3;

        int total = countPaths(0,0,n,m);
        System.out.println(total);
    }
}
