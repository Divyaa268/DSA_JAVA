package Queue;

public class QueueUsingArray {

    static class Queue
    {
        static int a[];
        static int size;
        static int rear;

        Queue(int n)
        {
            a =  new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty()
        {
            return rear == -1;
        }

        public static void enqueue(int data)  // TC - O(1)
        {
            // if queue is full
            if(rear == size-1)
            {
                System.out.println("queue is full");
                return;
            }
            rear = rear + 1;
            a[rear] = data;
        }

        public static int dequeue()  // TC - O(N)
        {
            // if queue is empty
            if(isEmpty())
            {
                System.out.println("queue is empty");
                return -1;
            }
            int front = a[0];
            // shifting all other element by 1 position to left
            for(int i=0;i<rear;i++)
            {
                a[i] = a[i+1];
            }
            rear = rear - 1;
            return front;
        }

        public static int peek()
        {
            // if queue is empty
            if(isEmpty())
            {
                System.out.println("queue is empty");
                return -1;
            }
            return a[0]; // front
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        while (!q.isEmpty())
        {
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}
