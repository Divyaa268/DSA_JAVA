package Arrays;

import java.util.*;

public class PDFViewer {

    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here

        char carr[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        List<Integer> list = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();

        int l = word.length();

        for(int i=0;i<l;i++)
        {
            char c= word.charAt(i);

            for(int j=0;j<carr.length;j++)
            {
                if(c == carr[j])
                {
                    list.add(j);
                }
            }
        }

        for(int q=0;q<list.size();q++)
        {
            ll.add(h.get((list.get(q))));
        }
        int max = 0;
        for(int p=0;p<ll.size();p++)
        {
            if(ll.get(p) > max)
            {
                max = ll.get(p);
            }
        }

        return l * max;

    }


//    import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//import java.lang.*;
//
//    class Result {
//
//        /*
//         * Complete the 'designerPdfViewer' function below.
//         *
//         * The function is expected to return an INTEGER.
//         * The function accepts following parameters:
//         *  1. INTEGER_ARRAY h
//         *  2. STRING word
//         */
//
//        public static int designerPdfViewer(List<Integer> h, String word) {
//            // Write your code here
//
//            int length = word.length();
//
//            // Index of the Letters of the Words are 'character' - 'a'
//
//            int maxHeight = -1;
//
//            for (char letter:
//                    word.toCharArray()) {
//                int IndexValue = letter - 'a';
//                System.out.println("Index "+IndexValue);
//
//                int heightValue = h.get(IndexValue);
//                System.out.println("Height Value At Index is "+heightValue);
//
//                maxHeight = Math.max(maxHeight, heightValue);
//            }
//
//
//
//
//            return maxHeight * length;
//        }
//
//    }

    public static void main(String[] args) {

        List<Integer> h = List.of(1,3,1,3,1,4,1,3,2,5,5,5,5,1,1,5,5,1,5,2,5,5,5,5,5,5);
        String w = "torn";
        int res = designerPdfViewer(h,w);
        System.out.println(res);
    }

}
