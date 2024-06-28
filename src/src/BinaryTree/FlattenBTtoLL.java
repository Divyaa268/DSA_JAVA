package BinaryTree;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }

public class FlattenBTtoLL {

        public void flatten(TreeNode root)
        {
            flattn(root);
        }
        public TreeNode flattn(TreeNode root)
        {
            if(root == null) return null;

            TreeNode lt = flattn(root.left);
            TreeNode rt = flattn(root.right);

            if(lt == null && rt == null)
                return root;

            else if(lt == null && rt != null)
                return rt;

            else if(lt != null && rt == null)
            {
                TreeNode lc = root.left;
                root.right = lc;
                root.left = null;
                return lt;
            }
            else
            {
                TreeNode lc = root.left;
                TreeNode rc = root.right;
                root.right = lc;
                root.left = null;
                lt.right = rc;
                return rt;
            }

        }

        public static void main(String[] args) {
            FlattenBTtoLL solution = new FlattenBTtoLL();

            // Test case: Tree construction
            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.left.right = new TreeNode(3);
            root.left.right.right = new TreeNode(4);
            root.left.right.right.right = new TreeNode(5);
            root.left.right.right.right.right = new TreeNode(6);

            solution.flatten(root);

            // Print the flattened tree
            TreeNode current = root;
            while (current != null) {
                System.out.print(current.val + " ");
                current = current.right;
            }
            // Expected output: 1 2 3 4 5 6
        }
    }
