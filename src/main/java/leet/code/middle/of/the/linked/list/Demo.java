package leet.code.middle.of.the.linked.list;

public class Demo {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(5)))));
        ListNode listNode2 = new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(5, new ListNode(6))))));

        System.out.println(new Solution().middleNode(listNode1));
        System.out.println(new Solution().middleNode(listNode2));

        System.out.println(new Solution().middleNodeTwoPointers(listNode1));
        System.out.println(new Solution().middleNodeTwoPointers(listNode2));
    }
}
