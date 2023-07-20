package Recursion;

public class RemoveDuplicates {

    public static String duplicates(String s)
    {
        int l = s.length();

        if(l == 0)
        {
            return null;
        }
        if(l == 1)
        {
            return s;
        }
        if(s.charAt(0) == s.charAt(1))
        {
            return duplicates(s.substring(1));
        }
        return s.charAt(0) +duplicates(s.substring(1));
    }

    public static void main(String[] args) {
        String s = "dddiiiivvyaaa";
        String st = duplicates(s);
        System.out.println(st);
    }
}
