package leet.code.find.first.palindromic.string.in.the.array;

public class Solution {

    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            for (int j = 0; j < str.length(); j++) {
                if (j >= (str.length() - j - 1)) return str;
                if (str.charAt(j) != str.charAt(str.length() - j - 1)) break;
            }
        }
        return "";
    }
}
