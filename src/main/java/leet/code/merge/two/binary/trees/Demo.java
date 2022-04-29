package leet.code.merge.two.binary.trees;

public class Demo {

    public static void main(String[] args) {
        TreeNode first = new TreeNode(
                1,
                new TreeNode(3, new TreeNode(5, null, null), null),
                new TreeNode(2, null, null));
        TreeNode second = new TreeNode(
                2,
                new TreeNode(1, null, new TreeNode(4, null, null)),
                new TreeNode(3, null, new TreeNode(7, null, null)));

        System.out.println(new Solution().mergeTrees(first, second));
    }
}
