package Recursion;

public class DoesSContainT {

    public static boolean checkSeq(String a, String b) {



        int m=a.length();

        int n=b.length();

        return checkSequence(a,b,m,n);

    }



    public static boolean checkSequence(String a, String b, int m, int n)

    {
        if(m==0)
        {
            return false;
        }

        if(n==0)
        {
            return true;
        }

        // If last characters of two strings are matching
        if(a.charAt(m-1)==b.charAt(n-1))
        {
            return checkSequence(a,b, m-1, n-1);
        }

        // If last characters of two strings are not matching
        return  checkSequence(a,b, m,n-1);
    }

    public static void main(String[] args) {
        String a ="aakkodliwnkgdc";
        String b = "coding";

        boolean r=checkSeq(a,b);
        System.out.println(r);
    }
}