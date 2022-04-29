package leet.code.add.two.numbers;

import java.time.LocalDateTime;

public class Demo {

    /**
     * Input: l1 = [2,4,3], l2 = [5,6,4]
     * Output: [7,0,8]
     * Explanation: 342 + 465 = 807.
     * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
     * Output: [8,9,9,9,0,0,0,1]
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        LeetCodeSolution leetCodeSolution = new LeetCodeSolution();

//        ListNode ln1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
//        ListNode ln2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode ln1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode ln2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode resultNode = solution.addTwoNumbers(ln1, ln2);
        ListNode leetCodeResultNode = leetCodeSolution.addTwoNumbers(ln1, ln2);
        ln1.display();
        ln2.display();
        resultNode.display();
        leetCodeResultNode.display();
    }
}
