package leet.code;

public class PowerOfFour {

    /**
     * Given an integer n, return true if it is a power of four. Otherwise, return false.
     * An integer n is a power of four, if there exists an integer x such that n == 4x.
     *
     * Example 1:
     * Input: n = 16
     * Output: true
     *
     * Example 2:
     * Input: n = 5
     * Output: false
     *
     * Example 3:
     * Input: n = 1
     * Output: true
     */
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFour(5));
        System.out.println(isPowerOfFour(1));

        System.out.println(isPowerOfFourWithRecursion(16));
        System.out.println(isPowerOfFourWithRecursion(5));
        System.out.println(isPowerOfFourWithRecursion(1));
    }

    public static boolean isPowerOfFour(int n) {
        return n > 0
                && Integer.bitCount(n) == 1
                && Integer.toBinaryString(n).length() % 2 == 1;
    }

    public static boolean isPowerOfFourWithRecursion(int n) {
        if (n == 1) return true;
        if (n % 4 != 0) return false;
        return n > 0 && isPowerOfFourWithRecursion(n / 4);
    }

    /**
     * https://leetcode.com/problems/power-of-four/discuss/1129623/JAVA-SIMPLE-SOLUTION
     * explanation
     * 1. num>0 then only it can be power of 4 . 4^0=1 , 4^1=4 ..
     * 2. only 1 bit is on then number is power of 2 .
     * 3. therefore in every power of 4 number will have only 1 set bit.
     * (4^n - 1) % 3 == 0
     * Mathematical proof:
     * 3.1 4^n - 1 = (2^n + 1) * (2^n - 1)
     * 3.2 among any 3 consecutive numbers, there must be one that is a multiple of 3
     * among (2^n-1), (2^n), (2^n+1), one of them must be a multiple of 3, and (2^n) cannot be the one,
     * therefore either (2^n-1) or (2^n+1) must be a multiple of 3, and 4^n-1 must be a multiple of 3 as well
     */
    public static boolean isPowerOfFourWithDivideBy3(int n) {
        return n > 0
                && (n & (n -1)) == 0
                && (n - 1) % 3 == 0;
    }
}
