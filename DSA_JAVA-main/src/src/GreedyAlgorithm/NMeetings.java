package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NMeetings {

    static class pair{
        int start;
        int end;

        pair(int start, int end){
            this.start = start;
            this.end = end;
        }

        int comparingFunction(){ // For Comparison in sorting
            return this.end;
        }
    }
    public static int maxMeetings(int start[], int end[], int n)
    {

        ArrayList<pair> meetings = new ArrayList<>();

        // add all the start and end pairs to the List
        for (int i = 0; i < n; i++) {

            pair newPair = new pair(start[i], end[i]);

            meetings.add(newPair);
        }

        // Sorting According to the Values of the endMeetingTime Value, Like Basketball Problem
        Collections.sort(meetings, Comparator.comparingInt(pair::comparingFunction));

        // Counting the Number of Meetings

        int count = 1; // Count of the Feasible meetings
        int prevMeetingEndTime = meetings.get(0).end; // Getting the First Meeting End Time

        // We always consider the first one by default and start the count from 1
        for (int i = 1; i < n; i++) {

            int currentMeetingStartTime = meetings.get(i).start;

            // If this Condition meets then only Meeting is Feasible
            if(currentMeetingStartTime > prevMeetingEndTime){
                count++;

                //Update the prevMeetingEndTimeVariable
                prevMeetingEndTime = meetings.get(i).end;
                // ** Remember only Update if we are considering current meeting

            }

        }
        return count; // Return the Feasible Meeting Count
    }

    public static void main(String[] args) {

        int s[] = {1,3,0,5,8,5};
        int e[] = {2,4,6,7,9,9};
        int c = maxMeetings(s,e,6);
        System.out.println(c);
    }
}
