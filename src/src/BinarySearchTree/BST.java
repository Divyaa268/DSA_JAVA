package BinarySearchTree;

import java.util.ArrayList;

public class BST {

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

    static class Info
    {
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST, int size, int min, int max)
        {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }

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

    public static Node insert(Node root, int value)
    {
        if(root == null)
        {
            root = new Node(value);
            return root;
        }

        if(root.data > value)
        {
            root.left = insert(root.left, value);
        }
        else
        {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static boolean search(Node root, int key)
    {
        if(root == null)
        {
            return false;
        }
        if(root.data == key)
        {
            return true;
        }
        if(root.data > key)
        {
            return search(root.left, key);
        }
        else
        {
            return search(root.right, key);
        }
    }

    public static Node findInorderSuccessor(Node root)
    {
        while (root.left != null)
        {
            root = root.left;
        }
        return root;
    }

    public static Node delete(Node root, int value)
    {
        // check in which subtree is the node to deleted present
        // traverse to that node
        if(root.data < value)
        {
            root.right = delete(root.right, value);
        }
        else if (root.data > value)
        {
            root.left = delete(root.left, value);
        }
        else
        {
            // case 1 - leaf node
            if(root.left == null && root.right == null)
            {
                return null;
            }

            // case 2 - single child
            if(root.left == null)
            {
                return root.right;
            }
            else if(root.right == null)
            {
                return root.left;
            }

            // case 3 - two children
            Node inorderSuccessor = findInorderSuccessor(root.right); // Find IS
            root.data = inorderSuccessor.data; // replace root with IS
            root.right = delete(root.right, inorderSuccessor.data); // delete IS
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2)
    {
        if(root == null)
        {
            return;
        }
        if(root.data >= k1 && root.data <= k2) // values lie in both sub trees
        {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1,  k2);
        }
        else if(root.data < k1)
        {
            printInRange(root.left,k1,k2);
        }
        else
        {
            printInRange(root.right,k1,k2);
        }
    }

    // correct/better version
//    public static void printInRange(Node root, int k1, int k2) {
//        if (root == null) {
//            return;
//        }
//
//        // Check if we need to explore the left subtree
//        if (root.data > k1) {
//            printInRange(root.left, k1, k2);
//        }
//
//        // Print the current node if it's within the range
//        if (root.data >= k1 && root.data <= k2) {
//            System.out.print(root.data + " ");
//        }
//
//        // Check if we need to explore the right subtree
//        if (root.data < k2) {
//            printInRange(root.right, k1, k2);
//        }
//    }

    public static void printPath(ArrayList<Integer> path)
    {
        for (int i=0;i<path.size(); i++)
        {
            System.out.print(path.get(i) + " -> ");
        }
        System.out.println("Null");
    }

    public static void printRootToLeaf(Node root, ArrayList<Integer> path)
    {
        if(root == null)
        {
            return;
        }

        path.add(root.data);

        if(root.left == null && root.right == null) // leaf node
        {
            printPath(path);
        }

        printRootToLeaf(root.left, path);
        printRootToLeaf(root.right, path);

        path.remove(path.size()-1); // delete current root from the path


    }

    public static boolean isValidBST(Node root,Node min, Node max)
    {
        if(root == null)
        {
            return true;
        }

        if(min != null && root.data <= min.data)
        {
            return false;
        }
        if(max != null && root.data >= max.data)
        {
            return false;
        }

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

//    class Solution {
//        public boolean isValidBST(TreeNode root) {
//            return isValidBST(root,Long.MIN_VALUE, Long.MAX_VALUE);
//        }
//
//        private boolean isValidBST(TreeNode node, long min, long max) {
//            if (node == null) {
//                return true;
//            }
//            if (node.val <= min || node.val >= max) {
//                return false;
//            }
//            return isValidBST(node.left, min, node.val) && isValidBST(node.right, node.val, max);
//        }
//    }

    public static Node createMirrorBST(Node root)
    {
        if(root == null)
        {
            return null;
        }

        Node leftSubtree = createMirrorBST(root.left);
        Node rightSubtree = createMirrorBST(root.right);

        root.left = rightSubtree;
        root.right = leftSubtree;

        return root;

    }

    public static void preOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node createBalancedBST(int arr[], int start, int end)
    {
        if(start > end)
        {
            return null;
        }
        int mid = (start + end)/2;

        Node root = new Node(arr[mid]);

        root.left = createBalancedBST(arr, start, mid-1);
        root.right = createBalancedBST(arr, mid+1, end);

        return root;

    }

    public static void getInorder(Node root, ArrayList<Integer> arr)
    {
        if(root == null)
        {
            return;
        }
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }

    public static Node createBST(ArrayList<Integer> arr, int start, int end)
    {
        if(start > end)
        {
            return null;
        }
        int mid = (start + end)/2;

        // create root with middle element
        Node root = new Node(arr.get(mid));

        root.left = createBST(arr, start, mid - 1);
        root.right = createBST(arr, mid + 1, end);

        return root;

    }

    public static Node convertToBalancedBST(Node root)
    {
        // find inorder sequence
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);

        // create balanced BST from inorder sequence
        root = createBST(inorder, 0, inorder.size() - 1);

        return root;

    }

    public static int maxSize = 0;

    public static Info largestBST(Node root)
    {
        if(root == null)
        {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info leftSubtree = largestBST(root.left);
        Info rightSubtree = largestBST(root.right);

        int size = leftSubtree.size + rightSubtree.size + 1;
        int min = Math.min(root.data, Math.min(leftSubtree.min, rightSubtree.min));
        int max = Math.max(root.data, Math.max(leftSubtree.max, rightSubtree.max));

        // check if root is valid bst
        if(root.data <= leftSubtree.max || root.data >= rightSubtree.max)
        {
            return new Info(false, size, min, max);
        }

        // check valid bst in left and right subtree
        if(leftSubtree.isBST && rightSubtree.isBST)
        {
            maxSize = Math.max(size, maxSize);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);
    }

    public int minDiffInBST(Node root) {

        ArrayList<Integer> l = new ArrayList<>();

        getInorder(root, l);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 1; i < l.size(); i++)
        {
            int diff = l.get(i) - l.get(i - 1);
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;

    }

    public static void main(String[] args) {

//        int values[] = {5,1,3,4,2,7};
//        int values[] = {8,5,3,1,4,6,10,11,14};
//          int values[] = {1,1,1};
//        int values[] = {3,5,6,8,10,11,12};
        int values[] = {45, 60, 65, 70 ,80 };

        Node root = null;

        for (int i =0;i<values.length;i++)
        {
            root = insert(root,values[i]);
        }

        inorder(root);
        System.out.println();

//        if(search(root, 11))
//        {
//            System.out.println("Found");
//        }
//        else
//        {
//            System.out.println("Not found!");
//        }

//        root = delete(root, 1);
//        System.out.println();
//
//        inorder(root);

//        printInRange(root, 5,12);

//        printRootToLeaf(root, new ArrayList<>());

//        if(isValidBST(root, null, null))
//        {
//            System.out.println("Valid BST");
//        }
//        else
//        {
//            System.out.println("Invalid BST");
//        }

        root = createMirrorBST(root);
        preOrder(root);

//        root = createBalancedBST(values, 0, values.length-1);
//        preOrder(root);

//        root = convertToBalancedBST(root);
//        preOrder(root);

//        Info info = largestBST(root);
//        System.out.println("Largest BST Size - " + maxSize);


    }
}
