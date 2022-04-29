package leet.code.longest.common.prefix;

public class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int lastIndex = 0;
            for (int j = 0; j < Math.min(result.length(), strs[i].length()); j++) {
                if (strs[i].charAt(j) == result.charAt(j)) {
                    lastIndex++;
                } else {
                    break;
                }
            }
            result = result.substring(0, lastIndex);
        }
        return result;
    }
}
