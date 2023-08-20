package BinaryTree;

import java.util.ArrayList;

public class LowestCommonAncestor {

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

    public static boolean getPath(Node root, int n, ArrayList<Node> path)
    {
        if(root == null)
        {
            return false;
        }

        path.add(root);

        if(root.data == n)  // when n is present at root itself
        {
            return true;
        }

        // otherwise check for n in left and right subtree
        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if(foundLeft || foundRight)
        {
            return true;
        }

        // if n not found in path, remove the element present in arraylist path
        path.remove(path.size() - 1);
        return false;

    }

    public static Node lca(Node root, int n1, int n2) {  // TC - O(N)

        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        // Traverse in arrayList to find Last common ancestor
        int i=0;
        for(; i<path1.size() && i< path2.size(); i++)
        {
            if(path1.get(i) != path2.get(i))
            {
                break;
            }
        }

        // last equal node is lca
        Node lca = path1.get(i-1);
        return lca;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node lca = lca(root, 4,7);
        System.out.println(lca.data);
    }
}
