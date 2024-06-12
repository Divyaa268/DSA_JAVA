package Queue;
import java.util.*;

public class QueueUsingCollections {

    public static void main(String[] args) {  // TC - O(1) in all three operations
        Queue<Integer> q = new LinkedList<>(); // we can also make queue using ArrayDeque
        Queue<Integer> q1 = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
