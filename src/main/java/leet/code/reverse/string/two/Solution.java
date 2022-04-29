package leet.code.reverse.string.two;

public class Solution {

    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i=i+2*k) {
            int lastReversedIndex = Math.min(s.length(), i + k);
            int lastRangeIndex = Math.min(s.length(), i + 2*k);
            StringBuilder reversedSb = new StringBuilder("");
            for (int j = lastReversedIndex - 1; j >= i; j--) {
                reversedSb.append(s.charAt(j));
            }
            sb.append(reversedSb);
            sb.append(s, lastReversedIndex, lastRangeIndex);
        }
        return sb.toString();
    }
}
