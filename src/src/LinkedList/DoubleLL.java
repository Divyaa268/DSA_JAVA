package LinkedList;

public class DoubleLL {
    public class Node
    {
        int data;
        Node next;
        Node prev;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;

    }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // Add
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Remove
    public int removeFirst()
    {
        if(head == null)
        {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }


    public void printDLL()
    {
        Node temp = head;

        while (temp != null)
        {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
            size++;
        }
        System.out.println("null");
    }

    public static void main(String args[])
    {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.printDLL();
        System.out.println(dll.size);

        dll.removeFirst();
        dll.printDLL();
    }
}
