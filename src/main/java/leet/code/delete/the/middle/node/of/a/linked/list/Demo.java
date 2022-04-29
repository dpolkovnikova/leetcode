package leet.code.delete.the.middle.node.of.a.linked.list;

public class Demo {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(7,
                new ListNode(1, new ListNode(2, new ListNode(6)))))));
        ListNode listNode2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode listNode3 = new ListNode(1, new ListNode(3));
        ListNode listNode4 = new ListNode(1);

        System.out.println(new Solution().deleteMiddle(listNode1));
        System.out.println(new Solution().deleteMiddle(listNode2));
        System.out.println(new Solution().deleteMiddle(listNode3));
        System.out.println(new Solution().deleteMiddle(listNode4));
    }

}
