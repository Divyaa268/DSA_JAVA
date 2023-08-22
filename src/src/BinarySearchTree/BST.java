package BinarySearchTree;

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

    public static void main(String[] args) {

//        int values[] = {5,1,3,4,2,7};
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for (int i =0;i<values.length;i++)
        {
            root = insert(root,values[i]);
        }

        inorder(root);
        System.out.println();

        if(search(root, 11))
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not found!");
        }

//        root = delete(root, 1);
//        System.out.println();
//
//        inorder(root);

        printInRange(root, 5,12);
    }
}
