package BinaryTree;

public class SubtreeOfTree {

    static class Node {
        int data;
        Node left;

        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // to check whether subtree is identical in main tree
    public static boolean isIdentical(Node node, Node subRoot) // here node is where we found the subtree from isSubtree
    {
        if (node == null && subRoot == null) {
            return true;
        } else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }

        if (!isIdentical(node.left, subRoot.left)) {
            return false;
        }
        if (!isIdentical(node.right, subRoot.right)) {
            return false;
        }
        return true;
    }

    // to check where the subtree lies in the main tree
    public static boolean isSubTree(Node root, Node subRoot) {

        if(root == null)
        {
            return false;
        }
        // check if subtree lies at root itself
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }

        // otherwise check if subtree lies in left or right subtree of main tree
        boolean leftAns = isSubTree(root.left, subRoot);
        boolean rightAns = isSubTree(root.right, subRoot);

        return leftAns || rightAns;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);

        System.out.println(isSubTree(root, subroot));
    }
}

