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

    public static int diameter(Node root)  // TC - O(N^2)
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

    static class Info
    {
        int diam;
        int ht;

        public Info(int diam, int ht)
        {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameterOptimized(Node root) // TC - O(N)
    {
        if(root == null)
        {
            return new Info(0,0);
        }
        Info leftInfo = diameterOptimized(root.left);
        Info rightInfo = diameterOptimized(root.right);

        int diam = Math.max(leftInfo.ht + rightInfo.ht + 1, Math.max(leftInfo.diam, rightInfo.diam));

        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
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

        System.out.println(("Diameter of tree (optimized) - " + diameterOptimized(root).diam));
    }
}
