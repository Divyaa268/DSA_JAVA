package BinaryTree;

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
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void main(String[] args) {
            int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            BinaryTree tree = new BinaryTree();

            Node root = tree.buildTree(nodes);
            System.out.println(root.data);

            tree.preorder(root);
        }
    }
}
