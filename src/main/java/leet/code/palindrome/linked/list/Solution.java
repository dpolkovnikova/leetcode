package leet.code.palindrome.linked.list;

import java.util.Stack;

public class Solution {

    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode current = head;
        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }
        current = head;
        while (!stack.isEmpty() && current != null) {
            if (current.val == stack.pop()) current = current.next;
            else return false;
        }
        return true;
    }

    /**
     Follow up: Could you do it in O(n) time and O(1) space?
     */
    public boolean isPalindromeWithReverse(ListNode head) {
        ListNode middle = head;
        ListNode end = head;
        while (end != null && end.next != null) {
            end = end.next.next;
            middle = middle.next;
        }
        ListNode reversedEnd = reverse(middle);
        while(reversedEnd != null) {
            if(reversedEnd.val != head.val) return false;
            head = head.next;
            reversedEnd = reversedEnd.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode tempNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tempNext;
        }
        return prev;
    }
}
