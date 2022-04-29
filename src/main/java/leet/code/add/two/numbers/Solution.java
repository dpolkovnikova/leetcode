package leet.code.add.two.numbers;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    /**
     * You are given two non-empty linked lists representing two non-negative integers.
     * The digits are stored in reverse order, and each of their nodes contains a single digit.
     * Add the two numbers and return the sum as a linked list.
     *
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     *
     * Input: l1 = [2,4,3], l2 = [5,6,4]
     * Output: [7,0,8]
     * Explanation: 342 + 465 = 807.
     *
     * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
     * Output: [8,9,9,9,0,0,0,1]
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        LinkedList<Integer> numbers = new LinkedList<>();
        ListNode currentNode1 = l1;
        ListNode currentNode2 = l2;
        int plusOne = 0;
        int val1 = 0;
        int val2 = 0;
        int newVal;
        while (currentNode1 != null || currentNode2 != null) {
            if (currentNode1 != null) {
                val1 = currentNode1.val;
                currentNode1 = currentNode1.next;
            }
            if (currentNode2 != null) {
                val2 = currentNode2.val;
                currentNode2 = currentNode2.next;
            }
            newVal = val1 + val2 + plusOne;
            numbers.addFirst(newVal % 10);

            plusOne = newVal >= 10 ? 1 : 0;
            val1 = 0;
            val2 = 0;
        }

        if (plusOne == 1) {
            numbers.addFirst(plusOne);
        }
        return getNodeFromLinkedList(numbers);
    }

    public ListNode getNodeFromLinkedList(List<Integer> numbers) {
        ListNode currentNode = new ListNode();
        for (int i = 0; i < numbers.size(); i++) {
            currentNode.val = numbers.get(i);
            ListNode tempNode = currentNode;
            if (i != numbers.size() - 1) {
                currentNode = new ListNode();
                currentNode.next = tempNode;
            }
        }
        return currentNode;
    }
}