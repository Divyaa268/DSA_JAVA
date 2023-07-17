package Strings;

public class ValidPalindrom {

    public static boolean isPalindrome(String str) {

        if(str == " ")
        {
            return true;
        }

        int l = str.length();
        String st = "";
        String s = str.toLowerCase();
        String rev = "";


        for (int i = 0; i < l; i++)
        {
            char c = s.charAt(i);
            if( (c >= 'a' && c<= 'z') || c >=48 && c <= 57)
            {
                st = st + c;
            }
//            System.out.println(st);
        }

        for(int j = 0;j<st.length();j++)
        {
            rev = st.charAt(j) + rev;
        }
//        System.out.println( "reverse - " + rev);

        if(st.equals(rev))
        {
            return true;
        }

        return false;
    }

//

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
//        String s = "race a car";
//        String s = "0P";
        boolean b = isPalindrome(s);
        System.out.println(b);

    }
}
