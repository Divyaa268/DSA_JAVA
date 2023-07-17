package Strings;

public class Compression {

    public static String compression(String s)
    {
        int l = s.length();
        String str = "";

        for(int i=0;i<l;i++)
        {
            int count =1;
            while( i<l-1 && s.charAt(i) == s.charAt(i+1) )
            {
                count++;
                i++;
            }
            if(count == 1)
            {
                str = str + s.charAt(i);
            }
            else
            {
                str = str + s.charAt(i) + count;
            }
        }
        return str;
    }

    public static void main(String[] args) {

        String s = "aaabbcccdddde";

        String res = compression(s);
        System.out.println(res);
    }
}
