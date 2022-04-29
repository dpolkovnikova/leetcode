package leet.code;

import java.util.Arrays;

public class SetMismatch {

    /**
     * You have a set of integers s, which originally contains all the numbers from 1 to n.
     * Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set,
     * which results in repetition of one number and loss of another number.
     *
     * You are given an integer array nums representing the data status of this set after the error.
     * Find the number that occurs twice and the number that is missing and return them in the form of an array.
     *
     * Example 1:
     * Input: nums = [1,2,2,4]
     * Output: [2,3]
     *
     * Example 2:
     * Input: nums = [1,1]
     * Output: [1,2]
     *
     *
     * Constraints:
     * 2 <= nums.length <= 104
     * 1 <= nums[i] <= 104
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findErrorNums(new int[]{1,1,3,4})));
//        System.out.println(Arrays.toString(findErrorNums(new int[]{1,2,4,4})));
//        System.out.println(Arrays.toString(findErrorNums(new int[]{1,2,3,4,5,5})));
//        System.out.println(Arrays.toString(findErrorNums(new int[]{1,2,2,4,5,6})));
//        System.out.println(Arrays.toString(findErrorNums(new int[]{1,1})));
    }

    public static int[] findErrorNums(int[] nums) {
        int sum1N = nums.length*(nums.length + 1) / 2;
        int numsSum = 0;
        int numsSum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            numsSum += nums[i];
            numsSum2 ^= nums[i];
            System.out.println("numsSum2: " + numsSum2);
        }
//        System.out.println("numsSum: " + numsSum);
//        System.out.println("sum1N: " + sum1N);
        return nums;
    }
}
