package LinkedList;

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

//    public void printElementAtIndex(int index) {
//        if (head == null) {
//            System.out.println("List is empty");
//            return;
//        }
//
//        Node current = head;
//        int count = 0;
//
//        while (current != null) {
//            if (count == index) {
//                System.out.println("Element at index " + index + " is " + current.data);
//                return;
//            }
//            count++;
//            current = current.next;
//        }
//
//        System.out.println("Index out of bounds");
//    }


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

    public int removeLast()
    {
        if(length == 0)
        {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(length == 1)
        {
            int val = head.data;
            head = tail = null;
            length = 0;
            return val;
        }

        Node prev = head;
        for(int i=0;i<length-2;i++)
        {
            prev = prev.next;
        }
        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        length--;
        return val;
    }

    public void removeLast1() {
        if (head == null) {
            // List is empty, nothing to remove
            return;
        }

        if (head.next == null) {
            // List has only one node, remove it
            head = null;
            return;
        }

        // Find the second-to-last node
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        // Remove the last node
        current.next = null;
    }

    public int searchIterative(int key)  // TC - O(N)
    {
        Node temp = head;
        int i = 0;

        while(temp != null)
        {
            if(temp.data == key)
            {
                return i;
            }
            else
            {
                temp = temp.next;
                i++;
            }
        }
        return -1;
    }

    public int searchHelper(Node head, int key)
    {
        if(head == null)
        {
            return -1;
        }
        if(head.data == key)
        {
            return 0;
        }
        int index = searchHelper(head.next, key);
        if(index == -1)
        {
            return -1;
        }
        return index + 1;
    }

    public int searchRecursive(int key)
    {
        return searchHelper(head, key);
    }

    public void reverse()
    {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
         head = prev;
    }

    public void deleteNthFromEnd(int n)
    {
        // calculate size of LL
        Node temp = head;
        int size = 0;

        while (temp != null)
        {
            temp = temp.next;
            size++;
        }

        // Check if n is the head to be deleted
        if(n == size)
        {
            head = head.next; // remove first
            return;
        }

        // size - n + 1
        int i = 1;
        int iToFind = size - n; // n from end = size - n + 1 from beginning
        Node prev = head;

        // go till one node before nth node to be deleted i.e. size - n
        while (i < iToFind)
        {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head)
    {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // slow is at my midpoint

    }

    public boolean checkPalindrome()
    {
        // base case
        if(head == null || head.next == null)
        {
            return true;
        }

        // find mid
        Node midNode = findMid(head);

        // Reverse second half of LL
        Node prev = null;
        Node curr = midNode;
        Node next = null;

        while (curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // Right half's head
        Node left = head;

        // Check if left and right LL are equal
        while(right != null)
        {
            if(left.data != right.data)
            {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    // USING ARRAY LIST
//    public boolean isPalindrome() {
//        ArrayList<Integer> list = new ArrayList<>();
//        Node current = head;
//
//        // Traverse the linked list and add elements to the ArrayList
//        while (current != null) {
//            list.add(current.data);
//            current = current.next;
//        }
//
//        // Check if the ArrayList is a palindrome
//        int left = 0;
//        int right = list.size() - 1;
//        while (left < right) {
//            if (!list.get(left).equals(list.get(right))) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//
//        return true;
//    }

    public boolean isCycle()
    {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow)
            {
                return true;
            }
        }
        return false;
    }

    public void removeCycle()
    {
        // Detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
            {
                cycle = true;
                break;
            }
        }
        if(cycle == false)
        {
            return;
        }

        // Find meeting point
        slow = head;
        Node prev = null;

        while (slow != fast) // meet at cycle creation point
        {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Remove cycle WHEN FAST == SLOW (THAT IS THE MEETING POINT)
        prev.next = null;
    }

    private Node getMid(Node head)
    {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid

    }

    public Node merge(Node head1, Node head2)
    {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while( head1 != null && head2 != null)
        {
            if(head1.data <= head2.data)
            {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else
            {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        // Remaining elements
        while(head1 != null)
        {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null)
        {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public Node mergeSort(Node head)
    {
        if(head == null || head.next == null) // already sorted if empty or one node
        {
            return head;
        }

        // Find mid
        Node mid = getMid(head);

        // left & right MS
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // Merge
        return merge(newLeft, newRight);
    }

    public void zigZag()
    {
        // Find mid
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // Divide into two LL and Reverse 2nd half of LL
        Node curr = mid.next;
        mid.next = null;

        Node prev = null;
        Node next = null;

        while (curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Alternate merging
        Node leftH = head;
        Node rightH = prev;
        Node nextL, nextR;

        while (leftH != null && rightH != null)
        {
            nextL = leftH.next;
            leftH.next = rightH;
            nextR = rightH.next;
            rightH.next = nextL;

            // updating LH AND RH
            leftH = nextL;
            rightH = nextR;
        }
    }

    // Helper method to get the length of a linked list
    private static int getLength(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }


    // Find the intersection node of two linked lists
    public static Node getIntersectionNode(Node headA, Node headB) {
        if (headA == null || headB == null) return null;

        // Get the lengths of both linked lists
        int lengthA = getLength(headA);
        int lengthB = getLength(headB);

        // Align the starting points
        while (lengthA > lengthB) {
            headA = headA.next;
            lengthA--;
        }
        while (lengthB > lengthA) {
            headB = headB.next;
            lengthB--;
        }

        // Traverse both lists to find the intersection
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;  // Intersection found
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null;  // No intersection
    }


    public static void main(String args[])
    {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addAtIndex(8, 1);
        ll.printLL();
//        System.out.println("Length of LL is: " + length );

//        ll.removeFirst();
//        ll.printLL();
//        ll.removeLast();
//        ll.printLL();
//        System.out.println("Length of LL is: " + length );

//        int index = ll.searchIterative(8);
//        System.out.println("Key found at index (Iterative) : " + index);
//
//        int index1 = ll.searchRecursive(8);
//        System.out.println("Key found at index (Recursive) : " + index1);
//
//        ll.reverse();
//        ll.printLL();

//        ll.deleteNthFromEnd(3);
//        ll.printLL();

//        boolean palin = ll.checkPalindrome();
//        System.out.println(palin);

        // For loop detection  1 -> 2 -> 3 -> 2
//        head = new Node(1);
//        Node temp = new Node(2);
//        head.next = temp;
//        head.next.next = new Node(3);
//        head.next.next.next = temp;
//        boolean cycle = ll.isCycle();
//        System.out.println(cycle);
//
//
//        ll.removeCycle();
//        boolean cycle1 = ll.isCycle();
//        System.out.println(cycle1);

//        head = ll.mergeSort(head);
//        ll.printLL();

        ll.zigZag();
        ll.printLL();







    }
}
