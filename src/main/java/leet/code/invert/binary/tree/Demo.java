package leet.code.invert.binary.tree;


public class Demo {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(
                4,
                new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null)),
                new TreeNode(7, new TreeNode(6, null, null), new TreeNode(9, null, null)));

        System.out.println(new Solution().invertTree(treeNode));
    }
}
