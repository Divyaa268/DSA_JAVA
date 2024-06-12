package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeUse {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int index = -1; // static because we want to update index after each recursion

        public static Node buildTree(int nodes[]) {
            index++; // we increase it to one for first node
            Node newNode = null;
            if (nodes[index] == -1) {
                return null;
            }

            newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preorder(Node root)
        {
            if(root == null)
            {
                System.out.print("-1 ");
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void postorder(Node root)
        {
            if(root == null)
            {
                System.out.print("-1 ");
                return;
            }

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        public static void inorder(Node root)
        {
            if(root == null)
            {
                return;
            }

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void levelOrder(Node root)
        {
            if(root == null)
            {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null); // for next line

            while(!q.isEmpty())
            {
                Node currNode = q.remove();
                if(currNode == null)
                {
                    System.out.println(); // LEVEL CHANGE WHEN CURR NODE IS NULL
                    if(q.isEmpty())
                    {
                        break; // if all elements have been removed from queue
                    }
                    else
                    {
                        q.add(null); // adding null so that we can go to next line for the next level
                    }
                }
                else
                {
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null)
                    {
                        q.add(currNode.left);
                    }
                    if(currNode.right != null)
                    {
                        q.add(currNode.right);
                    }
                }
            }


        }

        public static void main(String[] args) {
            int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            BinaryTree tree = new BinaryTree();

            Node root = tree.buildTree(nodes);
            System.out.println(root.data);

            System.out.println("Preorder");
            tree.preorder(root);

            System.out.println();
            System.out.println("Postorder");
            tree.postorder(root);

            System.out.println();
            System.out.println("Inorder");
            tree.inorder(root);

            System.out.println();
            System.out.println("Level order");
            tree.levelOrder(root);


        }
    }
}
