public class SumRootToLeafNumbers129 {
    public static class TreeNode {
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
    public static int sumNumbers(TreeNode root) {
        //if the tree has both children
        if(root.left != null && root.right != null) {
            int leftValue = concat(root.val, root.left.val);
            int rightValue = concat(root.val, root.right.val);
            TreeNode left = new TreeNode(leftValue, root.left.left, root.left.right);
            TreeNode right = new TreeNode(rightValue, root.right.left, root.right.right);
            return sumNumbers(left) + sumNumbers(right);
        }
        //if the tree has no children
        else if(root.left == null && root.right == null) {
            return root.val;
        }
        //if there is a right child but not a left child
        else if(root.right != null) {
            TreeNode tree = new TreeNode(concat(root.val, root.right.val), root.right.left, root.right.right);
            return sumNumbers(tree);
        }
        //if there is a left child but not a right
        else  {
            TreeNode newLeft = null;
            TreeNode tree = new TreeNode(concat(root.val, root.left.val), root.left.left, root.left.right);
            return sumNumbers(tree);
        }
    }
    //method for concating 2 numbers
    public static int concat(int a, int b) {
        int value = (a * 10) + b;
        return value;

    }
}
