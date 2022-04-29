package leet.code.reverse.integer;

import java.util.LinkedList;

public class Solution {

    /**
     Given a signed 32-bit integer x, return x with its digits reversed.
     If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.

     Example 1:
     Input: x = 123
     Output: 321

     Example 2:
     Input: x = -123
     Output: -321

     Example 3:
     Input: x = 120
     Output: 21

     Example 4:
     Input: x = 0
     Output: 0
     */
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            result = result * 10 + pop;
        }
        return result;
    }
}
