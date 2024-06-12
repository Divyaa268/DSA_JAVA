package Strings;

public class RepeatedString {

//    public static long repeatedString(String s, long n) { // exceeds time limit
//
//        String str = "";
//
//        System.out.println(str.length());
//
//        while(str.length() < n)
//        {
//            str = str + s;
//        }
//        long c = 0;
//        for(int i=0;i < str.length(); i++)
//        {
//            if(str.charAt(i) == 'a')
//            {
//                c++;
//            }
//        }
//
//        return c;
//
//    }

//    public static long repeatedString(String s, long n) // does not pass all test cases on hacker rank
//    {
//        int c = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == 'a') {
//                c++;
//            }
//        }
//        long c1 = c * n / s.length(); // gives no. of a's in string of len n perfectly div by s.len
//
//        long c2 = 0;
//
//        for (int i = 0; i < n % s.length(); i++) // for remaining string with a's with rem of s.len
//        {
//            if (s.charAt(i) == 'a') {
//                c2++;
//            }
//        }
//        return c1 + c2;
//
//    }

    public static long repeatedString(String s, long n) {

        long strLength = s.length();

        //count of the number of 'a' in the given string
        int count = 0;

        for (int i = 0; i < strLength; i++)
        {
            if (s.charAt(i) == 'a')
            {
                count++;

            }
        }

        long repeatedTimes = n / strLength;

        //find the length of string left after repetitions
        long stringLeftLength = n - (strLength * repeatedTimes);

        //count remaining repetitions
        int extra = 0;

        for (int i = 0; i < stringLeftLength; i++)
        {
            if (s.charAt(i) == 'a')
            {
                extra++;
            }
        }

        long totalCount = (repeatedTimes * count) + extra;

        return totalCount;
    }


        public static void main(String[] args) {

        String s = "aba";
        long n = 10;
        long ans = repeatedString(s,n);
        System.out.println(ans);
    }
}
