package ArrayString;

public class ReverseString {

    public static String reverseWords(String s) {

        s = s.trim();
        String words[] = s.split("\\s+");
        // System.out.println(s);

        int l = words.length;
        String rev="";

        for (int i = l - 1; i >= 0; i--)
        {
            rev += words[i];

            if (i > 0)
            {
                rev += " ";
            }
        }
        return rev;
    }

    public static void main(String args[])
    {
        String s = "a good girl";
        System.out.println(reverseWords(s));
    }
}
