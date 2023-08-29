package Arrays;

// https://www.hackerrank.com/challenges/counting-valleys/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

public class CountingValleys {

    public static int countvalley(int steps, String path)
    {
        int l = path.length();
        int level = 0;
        int valley = 0;

        for (int i=0;i<l;i++)
        {
            if(path.charAt(i) == 'U')
            {
                level++;

                if(level == 0)
                {
                    valley++;
                }
            }
            else
            {
                level--;
            }
        }
        return valley;

    }

    public static void main(String[] args) {

        String path = "UDDDUDUU";
        int steps = 8;

        int valleys = countvalley(steps, path);
        System.out.println("No. of valleys traversed : " + valleys);

    }
}
