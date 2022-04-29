package leet.code.reverse.linked.list;

import leet.code.structure.ListNode;

public class Solution {

    /**
         Input: head = [1,2,3,4,5]
         Output: [5,4,3,2,1]
     */
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode result = null;
        while (head != null) {
            result = new ListNode(head.val, result);
            head = head.next;
        }
        return result;
    }

    public ListNode reverseListRecursion(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newHead = reverseListRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
