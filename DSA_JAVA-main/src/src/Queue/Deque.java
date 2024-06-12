package Queue;

import java.util.*;
//import java.util.LinkedList;

public class Deque {

    public static void main(String[] args) {

        java.util.Deque<Integer>  dq = new LinkedList<>();

        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);

        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);

        System.out.println( "First " + dq.getFirst());
        System.out.println("Last " + dq.getLast());


    }
}
