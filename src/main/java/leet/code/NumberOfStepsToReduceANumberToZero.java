package leet.code;

public class NumberOfStepsToReduceANumberToZero {

    /**
     * Given an integer num, return the number of steps to reduce it to zero.
     * In one step, if the current number is even, you have to divide it by 2,
     * otherwise, you have to subtract 1 from it.
     *
     * Example 1:
     * Input: num = 14
     * Output: 6
     * Explanation:
     * Step 1) 14 is even; divide by 2 and obtain 7.
     * Step 2) 7 is odd; subtract 1 and obtain 6.
     * Step 3) 6 is even; divide by 2 and obtain 3.
     * Step 4) 3 is odd; subtract 1 and obtain 2.
     * Step 5) 2 is even; divide by 2 and obtain 1.
     * Step 6) 1 is odd; subtract 1 and obtain 0.
     *
     * Example 2:
     * Input: num = 8
     * Output: 4
     * Explanation:
     * Step 1) 8 is even; divide by 2 and obtain 4.
     * Step 2) 4 is even; divide by 2 and obtain 2.
     * Step 3) 2 is even; divide by 2 and obtain 1.
     * Step 4) 1 is odd; subtract 1 and obtain 0.
     *
     * Example 3:
     * Input: num = 123
     * Output: 12
     *
     * Constraints:
     * 0 <= num <= 106
     */
    public static void main(String[] args) {
//        System.out.println("using brute simple decision: ");
//        System.out.println(numberOfStepsBrute(14));
//        System.out.println(numberOfStepsBrute(8));
//        System.out.println(numberOfStepsBrute(123));
//
//        System.out.println("using Integer.toBinaryString(n): ");
//        System.out.println(numberOfSteps(14));
//        System.out.println(numberOfSteps(8));
//        System.out.println(numberOfSteps(123));

        System.out.println("using right shift: ");
        System.out.println(numberOfStepsWithRightShift(14));
        System.out.println(numberOfStepsWithRightShift(8));
        System.out.println(numberOfStepsWithRightShift(123));
    }

    /**
     * brute decision using while
     */
    public static int numberOfStepsBrute(int num) {
        int counter = 0;
        while (num > 0) {
            if (num % 2 == 0) num /= 2;
            else num -= 1;
            counter++;
        }
        return counter;
    }

    /**
     * using Integer.toBinaryString(n)
     */
    public static int numberOfSteps(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;
        String binaryNum = Integer.toBinaryString(num);
        return binaryNum.length() + binaryNum.substring(1).replaceAll("0", "").length();
    }

    /**
     * using right shift
     */
    public static int numberOfStepsWithRightShift(int num) {
        if (num == 0) return 0;
        int counter = 0;
        while (num > 0) {
            counter += ((num & 1) == 0 ? 1 : 2);
            num >>= 1;
        }
        return counter - 1;
    }
}
