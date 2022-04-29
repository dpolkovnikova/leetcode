package leet.code.missing.number;

import java.util.Arrays;

public class Solution {

    /**
     * with sort
     * complexity O(NlogN) because of the quick sort and extra space O(1)
     */
    public int missingNumber(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) return i;
        }
        return nums.length;
    }

    /**
     * complexity O(N) and extra space O(1)
     */
    public int missingNumberSum(int[] nums) {
        if (nums.length == 0) return 0;
        int actualSum = 0;
        int sum0N = nums.length*(nums.length + 1) / 2;
        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }
        return sum0N - actualSum;
    }

    /**
     * Example 1:
     * Input: nums = [3,0,1]
     * Output: 2
     *
     * Example 2:
     * Input: nums = [0,1]
     * Output: 2
     *
     * Example 3:
     * Input: nums = [9,6,4,2,3,5,7,0,1]
     * Output: 8
     *
     * Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.missingNumber(new int[]{3,0,1}));
        System.out.println(solution.missingNumberSum(new int[]{3,0,1}));

        System.out.println(solution.missingNumber(new int[]{0,1}));
        System.out.println(solution.missingNumberSum(new int[]{0,1}));

        System.out.println(solution.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
        System.out.println(solution.missingNumberSum(new int[]{9,6,4,2,3,5,7,0,1}));
    }


}
