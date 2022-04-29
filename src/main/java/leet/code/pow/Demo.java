package leet.code.pow;

import javax.management.relation.InvalidRelationTypeException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.myPow(
//                0.999999999,
//                        -2147483648));

        LinkedList<Integer> ints = new LinkedList<>();
        List<Integer> ints2 = new ArrayList<>();

        for (int i = 0; i< 5; i++) {
            ints.add(i);
            ints2.add(i);
        }

        for (Integer link: ints) {
            System.out.print(link);
        }
        System.out.println();
        for (Integer link: ints2) {
            System.out.print(link);
        }
    }
}
