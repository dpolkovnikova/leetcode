package leet.code.delete.the.middle.node.of.a.linked.list;

public class Solution {

    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;
        ListNode beforeSlow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            beforeSlow = slow;
            slow = slow.next;
        }
        beforeSlow.next = slow.next;

        return head;
    }
}
