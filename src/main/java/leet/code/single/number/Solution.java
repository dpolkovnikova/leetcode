package leet.code.single.number;

public class Solution {

    public int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];

        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
//            System.out.println("nums[i]: " + nums[i]);
//            System.out.println("xor: " + xor);
        }
        return xor;
    }

    /**
     * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
     * You must implement a solution with a linear runtime complexity and use only constant extra space.
     *
     * Example 1:
     * Input: nums = [2,2,1]
     * Output: 1
     *
     * Example 2:
     * Input: nums = [4,1,2,1,2]
     * Output: 4
     *
     * Example 3:
     * Input: nums = [1]
     * Output: 1
     */
    public static void main(String[] args) {
        Solution solution = new Solution();

//        System.out.println(solution.singleNumber(new int[]{1}));
//        System.out.println(solution.singleNumber(new int[]{2,2,1}));
        System.out.println(solution.singleNumber(new int[]{4,1,2,1,2}));
    }
}
