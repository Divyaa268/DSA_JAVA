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

    public void printDLL()
    {
        Node temp = head;

        while (temp != null)
        {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
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
    }
}
