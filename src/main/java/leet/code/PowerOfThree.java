package leet.code;

public class PowerOfThree {

    /**
     * Given an integer n, return true if it is a power of three. Otherwise, return false.
     * An integer n is a power of three, if there exists an integer x such that n == 3x.
     *
     * Example 1:
     * Input: n = 27
     * Output: true
     *
     * Example 2:
     * Input: n = 0
     * Output: false
     *
     * Example 3:
     * Input: n = 9
     * Output: true
     *
     *
     * Constraints:
     * -231 <= n <= 231 - 1
     */
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
        System.out.println(isPowerOfThree(0));
        System.out.println(isPowerOfThree(9));
    }

    public static boolean isPowerOfThree(int n) {
        if (n == 1) return true;
        if (n % 3 != 0) return false;
        return n > 0 && isPowerOfThree(n / 3);
    }
}
