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

    public static boolean palin(String s) {
        int l = s.length();

        String str = "";

        for (int i = l-1; i >= 0; i--) {
            str = str + s.charAt(i);
        }
        System.out.println(str);
        if (s.equals(str))
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    public static void main(String[] args) {
        String s = "madam";

        boolean res = checkPalin(s);
        System.out.println(res);


        boolean r = palin(s);
        System.out.println(r);
    }
}
