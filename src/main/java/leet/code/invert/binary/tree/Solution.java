package leet.code.invert.binary.tree;

public class Solution {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode inverted = new TreeNode();
        TreeNode tempLeft = root.left;
        inverted.val = root.val;
        inverted.left = invertTree(root.right);
        inverted.right = invertTree(tempLeft);
        return inverted;
    }
}
