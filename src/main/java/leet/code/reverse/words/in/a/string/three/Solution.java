package leet.code.reverse.words.in.a.string.three;

public class Solution {

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder resultSb = new StringBuilder("");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder sb = new StringBuilder("");
            for (int j = word.length() - 1; j >= 0; j--) {
                sb.append(word.charAt(j));
            }
            resultSb.append(sb);
            if (i != words.length - 1) {
                resultSb.append(" ");
            }
        }
        return resultSb.toString();
    }
}
