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
            size++;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;
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

    public void addLast(int data)
    {
        Node newNode =  new Node(data);
        if(head == null)
        {
            head = tail = newNode;
            size++;
            return;
        }
        Node temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = null;
        size++;
    }

    public int removeLast()
    {
        if(head == null)
        {
            System.out.println("DLL is empty");
            return  Integer.MIN_VALUE;
        }
        if(head.next == null)
        {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        Node temp = head;
        while (temp.next.next != null) // go till second last node
        {
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        size--;
        return val;
    }

    public void reverseDLL()
    {
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null)
        {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
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

//        dll.printDLL();
//        System.out.println(dll.size);

//        dll.removeFirst();
//        dll.printDLL();
//
//        dll.addLast(4);
//        dll.addLast(5);
        dll.printDLL();
        System.out.println(dll.size);

//        dll.removeLast();
//        dll.printDLL();
//        System.out.println(dll.size);

        dll.reverseDLL();
        dll.printDLL();

    }
}
