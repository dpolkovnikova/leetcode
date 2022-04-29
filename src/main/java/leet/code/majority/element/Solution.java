package leet.code.majority.element;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     Given an array nums of size n, return the majority element.

     The majority element is the element that appears more than ⌊n / 2⌋ times.
     You may assume that the majority element always exists in the array.
     */
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> majMap = new HashMap<>();
        for (int num : nums) {
            majMap.put(num, majMap.getOrDefault(num, 0) + 1);
        }
        int maj = 0;
        int currentMax = 0;
        for (Map.Entry<Integer, Integer> entry : majMap.entrySet()) {
            if (entry.getValue() > currentMax) {
                currentMax = entry.getValue();
                maj = entry.getKey();
            }
        }
        return maj;
    }
}
