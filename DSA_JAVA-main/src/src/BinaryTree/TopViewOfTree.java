package BinaryTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopViewOfTree {

    static class Node
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

    static class Info
    {
        Node node;
        int hd;

        public  Info( Node node, int hd)
        {
            this.hd = hd;
            this.node = node;
        }
    }

    public static void topView(Node root)
    {
        HashMap<Integer, Node> map = new HashMap<>(); // stores hd and node value
        Queue<Info> q = new LinkedList<>(); // for level order traversal

        int min= 0;
        int max = 0;

        q.add(new Info(root, 0));
        q.add(null);

        while(!q.isEmpty())
        {
            Info currNode = q.remove();

            if (currNode == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                // check if key (HD) already exists in map
                if (!map.containsKey(currNode.hd)) {
                    map.put(currNode.hd, currNode.node);
                }

                if (currNode.node.left != null) {
                    q.add(new Info(currNode.node.left, currNode.hd - 1));
                    min = Math.min(min, currNode.hd - 1);

                }

                if (currNode.node.right != null) {
                    q.add(new Info(currNode.node.right, currNode.hd + 1));
                    max = Math.max(max, currNode.hd + 1);
                }
            }
        }

            for(int i=min;i<=max;i++) {
                System.out.print(map.get(i).data + " ");
            }
            System.out.println();
        }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        topView(root);
    }

}
