package leet.code;

import java.util.*;

public class IntersectionOfTwoArrays {

    /**
     Given two integer arrays nums1 and nums2, return an array of their intersection.
     Each element in the result must be unique and you may return the result in any order.

     Example 1:
     Input: nums1 = [1,2,2,1], nums2 = [2,2]
     Output: [2]

     Example 2:
     Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     Output: [9,4]
     Explanation: [4,9] is also accepted.
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{1,2,2,1}, new int[]{2,2})));
        System.out.println(Arrays.toString(intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }

    /**
     * complexity O(N*logN)
     */
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int pointer = 0, current = 0, k = 0;
        while (pointer < nums2.length && current < nums1.length) {
            if (nums1[current] < nums2[pointer]) current++;
            else if (nums1[current] > nums2[pointer]) pointer++;
            else {
                if ((k == 0 || nums1[current] != nums1[k-1])) nums1[k++] = nums1[current];
                pointer++;
                current++;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }
}
