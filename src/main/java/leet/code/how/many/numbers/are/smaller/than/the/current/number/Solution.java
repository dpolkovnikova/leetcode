package leet.code.how.many.numbers.are.smaller.than.the.current.number;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     O(N logN) complexity
     */
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Arrays.stream(nums).mapToObj(x -> x + " ").forEach(System.out::print);
        System.out.println();
        int[] result = nums.clone();
        Arrays.sort(result);
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < result.length; i++) {
            numsMap.put(result[i], numsMap.getOrDefault(result[i], i));
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = numsMap.get(nums[i]);
        }
        Arrays.stream(nums).mapToObj(x -> x + " ").forEach(System.out::print);
        System.out.println();
        Arrays.stream(result).mapToObj(x -> x + " ").forEach(System.out::print);
        return nums;
    }

    /**
     O(N^2) complexity
     */
    public int[] smallerNumbersThanCurrentAlmostBruteSort(int[] nums) {
        Arrays.stream(nums).mapToObj(x -> x + " ").forEach(System.out::print);
        System.out.println();
        int[] result = nums.clone();
        Arrays.sort(result);
        for (int i = 0; i < nums.length; i++) {
            int j = 0;
            while (result[j] != nums[i]) {
                j++;
            }
            nums[i] = j;
        }
        Arrays.stream(nums).mapToObj(x -> x + " ").forEach(System.out::print);
        System.out.println();
        Arrays.stream(result).mapToObj(x -> x + " ").forEach(System.out::print);
        return result;
    }

    /**
    O(N^2) complexity
     */
    public int[] smallerNumbersThanCurrentBruteSort(int[] nums) {
         int[] result = new int[nums.length];
         for (int i = 0; i < nums.length; i++) {
             int counter = 0;
             for (int j = 0; j < nums.length; j++) {
                 if (nums[i] > nums[j]) {
                     counter++;
                 }
             }
             result[i] = counter;
         }
         return result;
    }

}
