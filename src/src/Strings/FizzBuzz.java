package Strings;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {

        List<String> s = new ArrayList<>();
//        String st = "";

        for(int i=1;i<=n;i++)
        {
            if((i%3 !=0 && i%5 != 0) && i%3 !=0 && i%5 !=0)
            {
                s.add(String.valueOf(i));

                //                st += i;
//                System.out.println("stringgg " + st);
//                s.add(st);
            }
            else if( i%3 == 0 && i%5 != 0 )
            {
                s.add("Fizz");
            }
            else if( i%5 == 0  && i%3 != 0)
            {
                s.add("Buzz");
            }
            else
            {
                s.add("FizzBuzz");
            }
        }
        return s;
    }

    public static void main(String[] args) {

        int n = 5;

        List<String> s = fizzBuzz(n);
        System.out.println(s);

    }
}
