package leet.code.merge.two.sorted.lists;


public class Demo {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(
                1,
                new ListNode(2,
                        new ListNode(4)));
        ListNode listNode2 = new ListNode(
                1,
                new ListNode(3,
                        new ListNode(4)));

        ListNode emptyListNode1 = new ListNode();
        ListNode emptyListNode2 = new ListNode();

        System.out.println(new Solution().mergeTwoLists(listNode1, listNode2).toString());
        System.out.println(new Solution().mergeTwoLists(emptyListNode1, emptyListNode2).toString());
    }
}
