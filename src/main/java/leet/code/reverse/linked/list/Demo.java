package leet.code.reverse.linked.list;

import leet.code.structure.ListNode;

public class Demo {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(5)))));
//        ListNode listNode2 = new ListNode(1, new ListNode(2, new ListNode(3,
//                new ListNode(4, new ListNode(5, new ListNode(6))))));

        System.out.println(new Solution().reverseListRecursion(listNode1));
//        System.out.println(new Solution().reverseList(listNode2));
    }

}
