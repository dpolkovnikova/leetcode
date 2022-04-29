package leet.code;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    /**
     *
     * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
     *
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II.
     * The number 27 is written as XXVII, which is XX + V + II.
     *
     * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
     * Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
     * The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
     *
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     * Given a roman numeral, convert it to an integer.
     *
     * Example 1:
     * Input: s = "III"
     * Output: 3
     * Explanation: III = 3.
     *
     * Example 2:
     * Input: s = "LVIII"
     * Output: 58
     * Explanation: L = 50, V= 5, III = 3.
     *
     * Example 3:
     * Input: s = "MCMXCIV"
     * Output: 1994
     * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     *
     *
     * Constraints:
     * 1 <= s.length <= 15
     * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
     * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
     */
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));

        System.out.println(romanToIntSimplierSolution("III"));
        System.out.println(romanToIntSimplierSolution("LVIII"));
        System.out.println(romanToIntSimplierSolution("MCMXCIV"));
    }

    public static int romanToIntSimplierSolution(String s) {
        Map<Character, Integer> numbers = new HashMap<>();
        numbers.put('I', 1);
        numbers.put('V', 5);
        numbers.put('X', 10);
        numbers.put('L', 50);
        numbers.put('C', 100);
        numbers.put('D', 500);
        numbers.put('M', 1000);

        int counter = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int iValue = numbers.get(s.charAt(i));
            int i1Value = numbers.get(s.charAt(i + 1));
            if (iValue < i1Value) counter -= iValue;
            else counter += iValue;
        }
        counter += numbers.get(s.charAt(s.length() - 1));
        return counter;
    }

    public static int romanToInt(String s) {
        int i = s.length() - 1;
        int counter = 0;
        while (i >= 0) {
            String twoS = i - 1 >= 0 ? s.substring(i - 1, i + 1) : s.substring(i, i + 1);
            if (getNumbersMap().containsKey(twoS) && i - 1 >= 0) {
                counter += getNumbersMap().get(twoS);
                i--;
            }
            else counter += getNumbersMap().get(s.substring(i, i + 1));
            i--;
        }
        return counter;
    }

    public static Map<String, Integer> getNumbersMap() {
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("I", 1);
        numbers.put("V", 5);
        numbers.put("X", 10);
        numbers.put("L", 50);
        numbers.put("C", 100);
        numbers.put("D", 500);
        numbers.put("M", 1000);
        numbers.put("IV", 4);
        numbers.put("IX", 9);
        numbers.put("XL", 40);
        numbers.put("XC", 90);
        numbers.put("CD", 400);
        numbers.put("CM", 900);
        return numbers;
    }
}
