package Strings;

public class CheckPalindrome
{


    public static boolean checkPalin(String str)
    {
        int l = str.length();

        for(int i=0;i<l/2;i++)
        {
            if(str.charAt(i) != str.charAt(l-1-i))
            {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String s = "madam";

        boolean res = checkPalin(s);
        System.out.println(res);
    }
}
