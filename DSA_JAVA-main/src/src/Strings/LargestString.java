package Strings;

// Compare lexicographically

public class LargestString {

    public static void main(String[] args) {
        String s[] = {"apple" , "banana", "orange", "mango"};

        String largest = s[0];
        int l = s.length;

        for(int i=1;i<l;i++)
        {
            if(largest.compareTo(s[i]) < 0 )
            {
                largest = s[i];
            }
        }
        System.out.println(largest);
    }
}
