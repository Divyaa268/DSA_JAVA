public class LinkedList {

    public static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data)  // TC = O(1)
    {
        // create a new node
        Node newNode = new Node(data);

        // if LL is empty
        if(head == null)
        {
            head = tail = newNode;
        }

        // point newNode's next to head
        newNode.next = head;

        // make newNode as the head
        head = newNode;
    }

    public void addLast(int data)  // TC O(1)
    {
        Node newNode = new Node(data);

        if(head == null)
        {
            head = tail = newNode;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void printLL()
    {
        if(head == null)
        {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[])
    {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.printLL();
    }
}
