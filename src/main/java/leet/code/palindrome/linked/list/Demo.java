package leet.code.palindrome.linked.list;

public class Demo {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(
                1,
                new ListNode(2,
                        new ListNode(3,
                                        new ListNode(3,
                                                new ListNode(2,
                                                        new ListNode(1))))));

//        System.out.println(new Solution().isPalindrome(listNode));
        System.out.println(new Solution().isPalindromeWithReverse(listNode));
    }
}
