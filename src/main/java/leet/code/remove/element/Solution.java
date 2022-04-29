package leet.code.remove.element;

public class Solution {

    /**
     * simple solution
     */
    public int removeElement(int[] nums, int val) {
        int pointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[pointer] = nums[i];
                pointer++;
            }
        }
        return pointer;
    }

    /**
     * realization of two pointers algorithms. looks hard
     */
    public int removeElement2(int[] nums, int val) {
        int pointer = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (i >= pointer) break;
            if (nums[i] == val) {
                int temp = nums[--pointer];
                while (temp == val) {
                    if (pointer == 0 || i == pointer) break;
                    temp = nums[--pointer];
                }
                nums[pointer] = nums[i];
                nums[i] = temp;
            }
        }
        return pointer;
    }


}
