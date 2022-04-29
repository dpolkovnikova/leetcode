package leet.code.merge.two.binary.trees;

public class Solution {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode mergedTreeNode = new TreeNode();
        if (root1 == null && root2 == null) return null;
        if (root1 == null) return root2;
        if (root2 == null) return root1;

        mergedTreeNode.val = root1.val + root2.val;
        mergedTreeNode.left = mergeTrees(root1.left, root2.left);
        mergedTreeNode.right = mergeTrees(root1.right, root2.right);
        return mergedTreeNode;
    }
}
