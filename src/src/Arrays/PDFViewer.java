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

    public static void main(String[] args) {

        List<Integer> h = List.of(1,3,1,3,1,4,1,3,2,5,5,5,5,1,1,5,5,1,5,2,5,5,5,5,5,5);
        String w = "torn";
        int res = designerPdfViewer(h,w);
        System.out.println(res);
    }

}
