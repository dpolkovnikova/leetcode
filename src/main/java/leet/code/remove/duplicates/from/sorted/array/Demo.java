package leet.code.remove.duplicates.from.sorted.array;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
//        int[] arr1 = new int[]{1,1,2};
//        System.out.println(new Solution().removeDuplicates(arr1));
//        System.out.println(Arrays.toString(arr1));


        int[] arr2 = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(new Solution().removeDuplicates(arr2));
        System.out.println(Arrays.toString(arr2));
    }
}
