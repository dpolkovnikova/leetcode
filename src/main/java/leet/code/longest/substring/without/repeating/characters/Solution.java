package leet.code.longest.substring.without.repeating.characters;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    /**
     * Given a string s, find the length of the longest substring without repeating characters.
     *
     * Input: s = "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     *
     * Алгоритм: Sliding Window (Протокол скользящего окна) + бинарный поиск для выбора длины скользящего окна
     */
    public int lengthOfLongestSubstring(String s) {
        int strLength = s.length();
        int slidingWindowLength = strLength / 2;
        int newSlidingWindowLength;
        List<Integer> prevSlidingLengths = new ArrayList<>();
        int upper = strLength;
        if (strLength != 0 && (s.isEmpty() || s.equals(" "))) {
            return 0;
        }
        if (strLength == 1) {
            return 1;
        }
        if (strLength == 2) {
            if (s.substring(0, 1).equals(s.substring(1))) {
                return 1;
            }
            return 2;
        }

        while (slidingWindowLength != 0) {
            boolean allDuplicates = true;
            int differentCharsNumber = 0;
            for (int i = 0; i < strLength; ++i) {
                if (i + slidingWindowLength <= strLength && i + slidingWindowLength > 0) {
                    String tempString = s.substring(i, i + slidingWindowLength);
                    System.out.println(tempString);
                    int tempStringLength = tempString.length();
                    Set<Character> set = new HashSet<>();
                    for (int k = 0; k < tempStringLength; k++) {
                        set.add(tempString.charAt(k));
                    }
                    differentCharsNumber = set.size();
                    if (tempStringLength == differentCharsNumber) {
                        allDuplicates = false;
                    }
                }
            }
            if (allDuplicates) {
                if (slidingWindowLength == strLength && differentCharsNumber > 1) {
                    return slidingWindowLength - 1;
                }
                if (slidingWindowLength == strLength && differentCharsNumber == 1) {
                    return 1;
                }

                newSlidingWindowLength = slidingWindowLength / 2;
                upper = newSlidingWindowLength;
                if (newSlidingWindowLength == slidingWindowLength) {
                    break;
                }
                if (!prevSlidingLengths.isEmpty()
                        && newSlidingWindowLength < prevSlidingLengths.get(prevSlidingLengths.size() - 1)) {
                    return prevSlidingLengths.get(prevSlidingLengths.size() - 1);
                }
            } else {
                newSlidingWindowLength = (upper + slidingWindowLength) / 2;
                if (prevSlidingLengths.contains(newSlidingWindowLength)) {
                    return slidingWindowLength;
                }
            }
            if (slidingWindowLength == strLength) {
                return differentCharsNumber > 1 ? strLength : 1;
            }
            if (newSlidingWindowLength == slidingWindowLength) {
                break;
            }
            prevSlidingLengths.add(slidingWindowLength);
            slidingWindowLength = newSlidingWindowLength;
        }
        return slidingWindowLength;
    }
}
