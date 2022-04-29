package leet.code.shuffle.the.array;

public class Solution {

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int resultIndex = 0;
        int currentNumsIndex = 0;
        while(resultIndex != nums.length) {
            result[resultIndex] = nums[currentNumsIndex];
            currentNumsIndex+=n;
            if (currentNumsIndex >= nums.length) {
                currentNumsIndex = currentNumsIndex%n + 1;
            }
            resultIndex++;
        }
        return result;
    }
}
