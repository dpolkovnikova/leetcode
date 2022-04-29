package leet.code;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

    /**
     * A self-dividing number is a number that is divisible by every digit it contains.
     * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
     * A self-dividing number is not allowed to contain the digit zero.
     * Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right].
     *
     * Example 1:
     * Input: left = 1, right = 22
     * Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]
     *
     * Example 2:
     * Input: left = 47, right = 85
     * Output: [48,55,66,77]
     *
     *
     * Constraints:
     * 1 <= left <= right <= 104
     */
    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1, 22));
        System.out.println(selfDividingNumbers(47, 85));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDivide(i)) result.add(i);
        }
        return result;
    }

    public static boolean isSelfDivide(int number) {
        int current = number;
        while (current > 0) {
            int lastDigit = current % 10;
            if (lastDigit == 0 || number % lastDigit != 0) return false;
            current /= 10;
        }
        return true;
    }
}
