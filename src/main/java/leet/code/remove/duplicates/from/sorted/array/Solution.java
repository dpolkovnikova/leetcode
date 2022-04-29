package leet.code.remove.duplicates.from.sorted.array;

public class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) return nums.length;
        int pointer = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) nums[++pointer] = nums[i];
        }
        return pointer+1;
    }
}
