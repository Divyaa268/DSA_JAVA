package Arrays;

//https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

import java.util.ArrayList;
import java.util.List;

public class JumpingOnCloud {

    public static int jumpingOnClouds(List<Integer> c) { // hacker rank

        int l = c.size();

        int jump = 0;
        int i =0;

         while(i<l-1)
        {
//            if(c.get(i)==1)
//            {
//                i+=1;
//                jump+=1;
//            }
            if (c.get(i+1)==1)
            {
                i+=2;
                jump+=1;

            }
            else if(c.get(i) == 0 && c.get(i+1)==0)
            {
                i+=2;
                jump+=1;
            }
            else
            {
                i+=1;
                jump+=1;
            }
        }

        return jump;
    }

    public static void main(String[] args) {

        List<Integer> clouds = new ArrayList<>();
        clouds.add(0);
        clouds.add(1);
        clouds.add(0);
        clouds.add(0);
        clouds.add(0);
        clouds.add(1);
        clouds.add(0);

        int jumps = jumpingOnClouds(clouds);

        System.out.println(jumps);
    }
}
