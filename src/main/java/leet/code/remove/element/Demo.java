package leet.code.remove.element;


import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        int[] arr1 = new int[]{3,2,2,3};
        System.out.println(new Solution().removeElement(arr1, 3));
        System.out.println(Arrays.toString(arr1));

        int[] arr3 = new int[]{4, 5};
        System.out.println(new Solution().removeElement(arr3, 5));
        System.out.println(Arrays.toString(arr3));


        int[] arr2 = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(new Solution().removeElement(arr2, 1));
        System.out.println(Arrays.toString(arr2));
    }
}
