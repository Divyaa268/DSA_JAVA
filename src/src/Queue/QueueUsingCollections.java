package Queue;

public class QueueUsingCollections {


    public static void main(String[] args) {
        QueueUsingLinkedList.Queue q = new QueueUsingLinkedList.Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
