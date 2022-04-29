package leet.code.valid.parentheses;

public class Demo {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("{}{}()"));
        System.out.println(solution.isValid("{}[{}()"));
    }
}
