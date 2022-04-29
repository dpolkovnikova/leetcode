package leet.code.shuffle.the.array;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Arrays.stream(new Solution().shuffle(new int[]{2,5,1,3,4,7}, 3))
                .forEach(System.out::println);
    }
}
