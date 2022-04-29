package leet.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArraysII {

    /**
     * Given two integer arrays nums1 and nums2, return an array of their intersection.
     * Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
     *
     * Example 1:
     * Input: nums1 = [1,2,2,1], nums2 = [2,2]
     * Output: [2,2]
     *
     * Example 2:
     * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * Output: [4,9]
     * Explanation: [9,4] is also accepted.
     *
     * Constraints:
     * 1 <= nums1.length, nums2.length <= 1000
     * 0 <= nums1[i], nums2[i] <= 1000
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{1,2,2,1}, new int[]{2,2})));
        System.out.println(Arrays.toString(intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4})));

        System.out.println(Arrays.toString(intersectWithoutExtraSpace(new int[]{1,2,2,1}, new int[]{2,2})));
        System.out.println(Arrays.toString(intersectWithoutExtraSpace(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }

    /**
     * complexity O(N*logN)
     */
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> result = new ArrayList<>();
        int pointer = 0;
        int current = 0;
        while (pointer < nums2.length && current < nums1.length) {
            if (nums1[current] < nums2[pointer]) current++;
            else if (nums1[current] > nums2[pointer]) pointer++;
            else {
                result.add(nums1[current]);
                pointer++;
                current++;
            }
        }
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }

    public static int[] intersectWithoutExtraSpace(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int pointer = 0, current = 0, k = 0;
        while (pointer < nums2.length && current < nums1.length) {
            if (nums1[current] < nums2[pointer]) current++;
            else if (nums1[current] > nums2[pointer]) pointer++;
            else {
                nums1[k++] = nums1[current];
                pointer++;
                current++;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }
}
