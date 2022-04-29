package leet.code.search.insert.position;

public class Solution {

    /**
     Given a sorted array of distinct integers and a target value,
     return the index if the target is found.
     If not, return the index where it would be if it were inserted in order.

     You must write an algorithm with O(log n) runtime complexity.

     Examples:
     Input: nums = [1,3,5,6], target = 5
     Output: 2

     Input: nums = [1,3,5,6], target = 2
     Output: 1

     Input: nums = [1,3,5,6], target = 7
     Output: 4
     */
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int middle = 0;
        int lastIndex = 0;
        while(start <= end) {
            middle = (start + end) / 2;
            if (nums[middle] == target) return middle;
            if (target > nums[middle]) {
                start = middle + 1;
                lastIndex = 1;
            }
            else {
                end = middle - 1;
                lastIndex = 0;
            }
        }
        return middle + lastIndex;
    }
}
