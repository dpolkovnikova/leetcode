package leet.code;

public class PowerOfTwo {

    /**
     * Given an integer n, return true if it is a power of two. Otherwise, return false.
     * An integer n is a power of two, if there exists an integer x such that n == 2x.
     *
     * Example 1:
     * Input: n = 1
     * Output: true
     * Explanation: 20 = 1
     *
     * Example 2:
     * Input: n = 16
     * Output: true
     * Explanation: 24 = 16
     *
     * Example 3:
     * Input: n = 3
     * Output: false
     *
     * Constraints:
     * -231 <= n <= 231 - 1
     */
    public static void main(String[] args) {
//        System.out.println(isPowerOfTwo(1));
//        System.out.println(isPowerOfTwo(16));
//        System.out.println(isPowerOfTwo(3));
//
//        System.out.println(isPowerOfTwoElegant(1));
//        System.out.println(isPowerOfTwoElegant(16));
//        System.out.println(isPowerOfTwoElegant(3));

        System.out.println(isPowerOfTwoBitCount(1));
        System.out.println(isPowerOfTwoBitCount(16));
        System.out.println(isPowerOfTwoBitCount(3));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n < 1) return false;
        if (n == 1) return true;
        return Integer.toBinaryString(n).replaceAll("0", "").length() == 1;
    }

    public static boolean isPowerOfTwoBitCount(int n) {
        return n > 0 && Integer.bitCount(n) == 1;
    }

    /**
     * https://bits.stephan-brumme.com/isPowerOfTwo.html
     * explanation
     * The binary representation of a power-of-two 2y is a 1 followed only by 0s.
     * In such a case, x − 1 generates a binary number where the 1s turn into 0s and the former 0s turn into 1s.
     * For example, 8 = 1000b and 8 − 1 = 7 = 0111b.
     *
     * If x and x − 1 are binary ANDed then the result is only 0 if x is a power of two (line 3).
     *
     * restriction
     *  the algorithm returns true for x = 0 and x = 1, i.e. they are considered to be a power of two
     */
    public static boolean isPowerOfTwoElegant(int n) {
        return ((n & (n-1)) == 0 && n > 0);
    }
}
