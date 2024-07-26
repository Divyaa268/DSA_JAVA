package BinaryTree;

import java.util.*;

public class ReverseLevelOrder {

    public static class Node
    {
        int data;
        Node right;
        Node left;

        public Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> reverseLevel(Node root)
    {
        List<Integer> res = new ArrayList<>();

        if(root == null)
        {
            return res;
        }

        Queue<Node> q = new LinkedList<>();

        Stack<Node> s = new Stack<>();

        q.add(root);

        while(!q.isEmpty())
        {
            Node curr = q.poll();

            s.push(curr);

            // now move from right to left and enqueue children
            if(curr.right != null)
            {
                q.add(curr.right);
            }

            if(curr.left != null)
            {
                q.add(curr.left);
            }
        }

        while(!s.isEmpty())
        {
            res.add(s.pop().data);
        }
        return res;
    }


    public static void main(String[] args) {

       Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<Integer> r = reverseLevel(root);
        System.out.println(r);
    }
}
