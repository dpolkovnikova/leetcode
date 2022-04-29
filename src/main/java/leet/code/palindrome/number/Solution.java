package leet.code.palindrome.number;

public class Solution {

    /**
     Given an integer x, return true if x is palindrome integer.
     An integer is a palindrome when it reads the same backward as forward.
     For example, 121 is palindrome while 123 is not.

     Example 1:
     Input: x = 121
     Output: true

     Follow up: Could you solve it without converting the integer to a string?
     */
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
        int result = 0;
        while (temp != 0) {
            int pop = temp % 10;
            temp /= 10;
            result = result * 10 + pop;
        }
        return result == x;
    }
}
