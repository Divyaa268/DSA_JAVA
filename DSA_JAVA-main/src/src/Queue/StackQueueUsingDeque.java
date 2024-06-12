package Queue;

//import java.util.Deque;
import java.util.LinkedList;

public class StackQueueUsingDeque {

    static class Stack
    {
         java.util.Deque<Integer> dq = new LinkedList<>();

        public void push(int data)
        {
            dq.addLast(data);
        }

        public int pop()
        {
           return dq.removeLast();
        }

        public int peek()
        {
            return dq.getLast();
        }
    }

    static class Queue
    {
        java.util.Deque<Integer> dq = new LinkedList<>();

        public void add(int data)
        {
            dq.addLast(data);
        }

        public int remove()
        {
            return dq.removeFirst();
        }

        public int peek() {
            return dq.getFirst();
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Stack");
        System.out.println("Peek - " + s.peek());
        System.out.println("Pop - " + s.pop());
        System.out.println("Pop - " + s.pop());
        System.out.println("Pop - " + s.pop());


        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Queue ");
        System.out.println("Peek - " + q.peek());
        System.out.println("Remove - " + q.remove());
        System.out.println("Remove - " + q.remove());
        System.out.println("Remove - " + q.remove());
    }
}
