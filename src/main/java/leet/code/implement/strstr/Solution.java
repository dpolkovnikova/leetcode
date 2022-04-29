package leet.code.implement.strstr;

//потом, я заебалась
public class Solution {

    /**
     Implement strStr().
     Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
     Clarification:
     What should we return when needle is an empty string?
     This is a great question to ask during an interview.

     For the purpose of this problem, we will return 0 when needle is an empty string.
     This is consistent to C's strstr() and Java's indexOf().

     Example 1:
     Input: haystack = "hello", needle = "ll"
     Output: 2

     Example 2:
     Input: haystack = "aaaaa", needle = "bba"
     Output: -1

     Example 3:
     Input: haystack = "", needle = ""
     Output: 0
     */
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (haystack.length() == 0) return -1;
        if (needle.length() > haystack.length()) return -1;

        int lph = 0; // left point haystack
        int rph = haystack.length() - 1;
        int lpn = -1; // left point needle
        int rpn = needle.length();

        while (lph != haystack.length() - 1 && rph != -1) {
            if (haystack.charAt(lph) == needle.charAt(lpn + 1)) lpn++;
            else {
                lph -= lpn + 1;
                lpn = -1;
            }

            if (haystack.charAt(rph) == needle.charAt(rpn - 1)) rpn--;
            else {
                rph += needle.length() - rpn;
                rpn = needle.length();
            }

            lph++;
            rph--;

//            System.out.println("while lph " + lph);
//            System.out.println("while lpn " + lpn);
//            System.out.println("while rph " + rph);
//            System.out.println("while rpn " + rpn);
//            System.out.println("------------------");


            if (lpn == needle.length() - 1) return lph - lpn -1;
            if (rpn == 0) rpn = needle.length();
        }
        if (lph == -1 || rpn == needle.length()) return -1;
        if (lpn >= rpn) return lph - lpn - 1;
        return  -1;
    }
}
