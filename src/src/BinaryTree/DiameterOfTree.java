package BinaryTree;

import java.net.PortUnreachableException;

public class DiameterOfTree {

    static class Node
    {
        int data;
        Node left;
        Node right;

        public Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        int height = Math.max(lh, rh) + 1;
        return height;
    }

    public static int diameter(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int leftDiam = diameter(root.left);  // case for diam from left subtree
        int rightDiam = diameter(root.right); // case for diam from right subtree

        int lh = height(root.left);
        int rh = height(root.right);

        int selfDiam = lh + rh + 1; // case including root

        int diameter = Math.max(selfDiam, Math.max(rightDiam, leftDiam));

        return diameter;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Diameter of tree - " + diameter(root));

    }
}
