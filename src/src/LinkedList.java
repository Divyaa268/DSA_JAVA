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

    public static void main(String args[])
    {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
    }
}
