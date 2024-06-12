package Queue;

public class CircularQueueUsingArray {

    static class QueueUsingArray {

        static class Queue {
            static int a[];
            static int size;
            static int rear;

            static int front;

            Queue(int n) {
                a = new int[n];
                size = n;
                rear = -1;
                front = -1;
            }

            public static boolean isEmpty()
            {
                // for circular queue
                return (rear == -1 && front == -1);
            }

            public static boolean isFull() {
                // queue is full if the next element of rear is front
                return (rear + 1) % size == front;
            }

            public static void enqueue(int data)  // TC - O(1)
            {
                // if circular queue is full
                if (isFull()) {
                    System.out.println("queue is full");
                    return;
                }
                // add first element
                if(front == -1)
                {
                    front = 0;
                }

                rear = (rear + 1) % size;
                a[rear] = data;
            }

            public static int dequeue()  // TC - O(1)
            {
                // if queue is empty
                if (isEmpty()) {
                    System.out.println("queue is empty");
                    return -1;
                }
                int result = a[front];

                // if you remove one last remaining element
                if(rear == front)
                {
                    rear = front = -1;
                }
                else
                {
                    front = (front + 1) % size;
                }
                return result;
            }

            public static int peek() {
                // if queue is empty
                if (isEmpty()) {
                    System.out.println("queue is empty");
                    return -1;
                }
                return a[front]; // front
            }
        }

        public static void main(String[] args) {

            Queue q = new Queue(5);

            q.enqueue(1);
            q.enqueue(2);
            q.enqueue(3);

            System.out.println(q.dequeue());

            q.enqueue(4);

            System.out.println(q.dequeue());

            q.enqueue(5);

            while (!q.isEmpty()) {
                System.out.println(q.peek());
                q.dequeue();
            }
        }
    }
}

