package HashMap;//package HashMap;
//
//import java.util.*;
//
//public class BasketBallRanking {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int rank = sc.nextInt();
//        String name ="";
//        int fouls =0;
//        int goals=0;
//        int threePoints=0;
//        int minsPlayed=0;
//
//        for (int i = 0; i < n; i++) {
//            name = sc.next().toUpperCase();
//            fouls = sc.nextInt();
//            goals = sc.nextInt();
//            threePoints = sc.nextInt();
//            minsPlayed = sc.nextInt();
//        }
//            ballRanking(name, fouls, goals, threePoints, minsPlayed, rank, n);
//    }
//
//    public static void ballRanking(String name, int fouls, int goals, int threePoints, int minsPlayed, int rank, int n)
//    {
//        List<Double> ppmScores = new ArrayList<>();
//        List<String> names = new ArrayList<>();
//        HashMap<String, Double> map = new HashMap<>();
//
//        for (int i = 0; i < n; i++)
//        {
//
//            double ppm = (fouls + (goals * 2) + (threePoints * 3)) / (double) minsPlayed * 1000;
//
//            names.add(name);
//
//            ppmScores.add(ppm);
//
//            map.put(name, ppm);
//        }
//
//            Collections.sort(ppmScores, Collections.reverseOrder());
//
//            double ppmAtRank = ppmScores.get(rank - 1);
//
//            int ppmmm =0;
//            for (String nm : map.keySet())
//            {
//                if (ppmAtRank == map.get(nm))
//                {
////                    System.out.println(nm + " " + Math.round(ppmAtRank));
//                    name = nm;
//                    ppmmm = (int) Math.round(ppmAtRank);
//                }
//            }
//
//        System.out.println(name + ppmmm);
//        }
//    }

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class BasketBallRanking {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int rank = scanner.nextInt();

        List<Double> ppmIntegers = new ArrayList<>();

        List<String> nameStrings = new ArrayList<>();

        HashMap<String, Double> map = new HashMap<>();


        for(int i=0;i<n;i++)
        {
            String name = scanner.next().toUpperCase();
            int foul = scanner.nextInt();
            int goals = scanner.nextInt();
            int threePoint = scanner.nextInt();
            int minutesPlayed = scanner.nextInt();

            double ppm = (foul + (goals * 2) + (threePoint * 3)) / (double)minutesPlayed * 1000;

            ppmIntegers.add(ppm);

            nameStrings.add(name);

            map.put(name, ppm);

        }

        Collections.sort(ppmIntegers, Collections.reverseOrder());

        double ppmAtRank = ppmIntegers.get(rank - 1);

        for(String nm : map.keySet())
        {
            if(ppmAtRank == map.get(nm))
            {
                System.out.println(nm + " " + Math.round(ppmAtRank));
            }

        }
    }
}

