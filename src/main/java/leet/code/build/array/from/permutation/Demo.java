package leet.code.build.array.from.permutation;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        Arrays.stream(new Solution().buildArray(new int[]{0, 2, 1, 5, 3, 4}))
                .forEach(System.out::println);
//        new Solution().buildArray(new int[]{0, 2, 1, 5, 3, 4});
    }
}
