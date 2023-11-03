package Arrays;
import java.util.Scanner;

public class Split {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);

        String str = "(a,b),(v,b),(c,v)";

//        str = str.replaceAll("[^a-z]"," ");

        str = str.replaceAll("\\),"," ");
        System.out.println(str);


        str = str.replaceAll("\\(","");
        System.out.println(str);

        str = str.replaceAll("\\)","");
        System.out.println(str);

        str = str.replaceAll("\\s+"," ");

        System.out.println(str);

        for (String s:
                str.split(" ")) {
            System.out.println("Pair String "+s);

            String pairX = s.split(",")[0];
            String pairY = s.split(",")[1];
            System.out.println("x ->"+pairX+" y->"+pairY);

        }

    }
}