package Strings;

public class InsertDifference {

    public static void main(String[] args) {

        String s = "abdg";

        System.out.println(insertDiff(s));
    }
    public static String insertDiff(String s)
    {
        String str = "";
        for(int i=0;i<s.length()-1;i++)
        {
            char c = s.charAt(i);
            int diff = s.charAt(i+1) - s.charAt(i);
            str = str + c + diff;
        }
        str = str + s.charAt(s.length()-1);
        return str;
    }
}
