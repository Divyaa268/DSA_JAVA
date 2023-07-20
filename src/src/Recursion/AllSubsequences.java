package Recursion;

public class AllSubsequences {

    public static void subsequences(String s, int i, String newStr)
    {
        if(s.length() == i)
        {
            System.out.println(newStr);
            return;
        }

        // To add currChar to new string
        subsequences(s,i+1, newStr + s.charAt(i));


        // to not add currChar to new String
        subsequences(s,i+1, newStr);
    }

    public static void main(String[] args) {
        String s = "abc";
        subsequences(s, 0, "");
    }
}
