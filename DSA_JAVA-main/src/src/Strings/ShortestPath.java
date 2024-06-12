package Strings;

public class ShortestPath {

    public static double shortestPath(String directions)
    {
        int l = directions.length();
        int x = 0;
        int y = 0;
        int x2 = 0;
        int y2 =0;

        for(int i=0;i<l;i++)
        {
            if(directions.charAt(i) == 'N')
            {
                y2+=1;
            }
            else if (directions.charAt(i) == 'S' )
            {
                y2-=1;
            }
            else if(directions.charAt(i) == 'E')
            {
                x2+=1;
            }
            else if(directions.charAt(i) == 'W')
            {
                x2-=1;
            }
        }

        double displacement = Math.sqrt(((x2-x)*(x2-x) + (y2-y)*(y2-y)));
        return displacement;


    }

    public static void main(String[] args) {

//        String directions = "WNEENESENNN";
        String directions = "NS";
        double pathDisplacement = shortestPath(directions);
        System.out.println(pathDisplacement);
    }
}
