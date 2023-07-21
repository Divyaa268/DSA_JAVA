package Recursion;

public class PrintPermutations {

    public static void permute(String s , String permutation)
    {
        if(s.length() == 0)
        {
            System.out.println(permutation);
            return;
        }

        for(int i =0;i<s.length();i++)
        {
            char currChar = s.charAt(i);
            // "abc" -> "ab"
            String newStr = s.substring(0,i) + s.substring(i+1);
            permute(newStr, permutation+currChar);
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        permute(s, "");

    }
}
