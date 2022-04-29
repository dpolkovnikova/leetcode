package leet.code.longest.substring.without.repeating.characters;

import java.time.LocalDate;

public class Demo {

    public static void main(String[] args) {
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
//        System.out.println(solution.lengthOfLongestSubstring("au"));
//        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
//        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(solution.lengthOfLongestSubstring("bfw"));
        long end = System.currentTimeMillis();
        long totalTime = end - start;
        System.out.println("Execution time in milliseconds: " + totalTime);


//        System.out.println("----------------------------------");
//        System.out.println(solution.lengthOfLongestSubstring("abc"));
//        System.out.println("----------------------------------");
//        System.out.println(solution.lengthOfLongestSubstring("ae"));
//        System.out.println("----------------------------------");
//        System.out.println(solution.lengthOfLongestSubstring("aaaa"));
    }
}
