package leet.code.merge.two.sorted.lists;


public class Solution {

    /**
     You are given the heads of two sorted linked lists list1 and list2.

     Merge the two lists in a one sorted list.
     The list should be made by splicing together the nodes of the first two lists.

     Return the head of the merged linked list.

     Input: list1 = [1,2,4], list2 = [1,3,4]
     Output: [1,1,2,3,4,4]
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 ==null) return null;

        ListNode temp = new ListNode();
        ListNode result = temp;
        while (l1 != null || l2 != null) {
            ListNode minNode = getMinNode(l1, l2);
            temp.val = minNode.val;

            if (l1 != null && l1 == minNode) l1 = l1.next;
            if (l2 != null && l2 == minNode) l2 = l2.next;

            temp.next = l1 != null || l2 != null ? new ListNode() : null;
            temp = temp.next;
        }
        return result;
    }

    private ListNode getMinNode(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val <= l2.val) return l1;
        else return l2;
    }
}
