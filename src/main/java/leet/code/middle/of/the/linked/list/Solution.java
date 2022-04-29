package leet.code.middle.of.the.linked.list;

public class Solution {

    /**
     * simple solution, we go through the list 1.5 times (still 0(N))
     */
    public ListNode middleNode(ListNode head) {
        ListNode curr = head;
        int counter = 0;
        while (curr != null) {
            curr = curr.next;
            counter++;
        }
        counter = counter/2;
        while (counter != 0) {
            head = head.next;
            counter--;
        }
        return head;
    }

    /**
     * two pointers solution, we go through the list exactly one time
     */
    public ListNode middleNodeTwoPointers(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
