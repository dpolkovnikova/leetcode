package leet.code.move.zeroes;


import java.util.Arrays;

public class Demo {

    /**
     Input: nums = [0,1,0,3,12]
     Output: [1,3,12,0,0]
     */
    public static void main(String[] args) {
        int[] arr2 = new int[]{0,1,0,3,12};
        new Solution().moveZeroes(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
