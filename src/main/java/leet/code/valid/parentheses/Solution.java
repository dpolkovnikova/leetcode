package leet.code.valid.parentheses;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution {

    /**
     Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
     determine if the input string is valid.

     An input string is valid if:
     Open brackets must be closed by the same type of brackets.
     Open brackets must be closed in the correct order.

     Constraints:
     1 <= s.length <= 104
     s consists of parentheses only '()[]{}'.

     Example 1:
     Input: s = "()"
     Output: true

     Example 2:
     Input: s = "()[]{}"
     Output: true

     Example 3:
     Input: s = "(]"
     Output: false

     Example 4:
     Input: s = "([)]"
     Output: false

     Example 5:
     Input: s = "{[]}"
     Output: true
     */
    public boolean isValid(String s) {
        Stack<String> brackets = new Stack<>();
        List<String> leftBrackets = Arrays.asList("{", "[", "(");
        List<String> rightBrackets = Arrays.asList("}", "]", ")");
        for (int i = 0; i < s.length(); i++) {
            String current = s.substring(i, i + 1);
            if (leftBrackets.contains(current)) {
                brackets.add(current);
            }
            if (rightBrackets.contains(current)) {
                if (brackets.isEmpty()) {
                    return false;
                }
                if (current.equals("}") && "{".equals(brackets.peek())
                        || current.equals("]") && "[".equals(brackets.peek())
                        || current.equals(")") && "(".equals(brackets.peek())) {
                    brackets.pop();
                } else {
                    return false;
                }
            }
        }
        return brackets.isEmpty();
    }
}
