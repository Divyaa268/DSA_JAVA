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

    public static int length;

    public void addFirst(int data)  // TC = O(1)
    {
        // create a new node
        Node newNode = new Node(data);
        length++;

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
        length++;

        if(head == null)
        {
            head = tail = newNode;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void printLL()  // TC - O(N)
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

    public void addAtIndex(int data, int index)
    {
        if(index == 0)
        {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        length++;

        int pos = 0;
        Node temp = head;

        while(pos < index - 1 && temp != null)
        {
            temp = temp.next;
            pos++;
        }

        if(temp != null) {
            // pos = index - 1 (temp -> prev)
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public int removeFirst()
    {
        if(length == 0)
        {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(length == 1)
        {
            int val = head.data;
            head = tail = null; // After removing one node, both head and tail are null
            length = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        length--;
        return val;
    }

    public static void main(String args[])
    {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addAtIndex(8, 3);
        ll.printLL();
        System.out.println("Length of LL is: " + length );
        ll.removeFirst();
        ll.printLL();
    }
}
