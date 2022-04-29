package leet.code.implement.strstr;

public class Demo {

    /**
     *      Example 1:
     *      Input: haystack = "hello", needle = "ll"
     *      Output: 2
     *
     *      Example 2:
     *      Input: haystack = "aaaaa", needle = "bba"
     *      Output: -1
     *
     *      Example 3:
     *      Input: haystack = "", needle = ""
     *      Output: 0
     *
     *      "mississippi"
     *      "a"
     *
     *      Input
     *      "mississippi"
     *      "issip"
     *      Output
     *
     *      "aabaaabaaac"
     *      "aabaaac"
     */
    public static void main(String[] args) {
        System.out.println(new Solution().strStr("bbaa", "aab"));

//        System.out.println(new Solution().strStr("aabaaabaaac", "aabaaac"));
//        System.out.println(new Solution().strStr("mississippi", "issipi"));
//        System.out.println(new Solution().strStr("mississippi", "a"));
//        System.out.println(new Solution().strStr("hdellllllogd", "llllll"));

//        System.out.println(new Solution().strStr("hello", "ll"));
//        System.out.println(new Solution().strStr("aaaaa", "bba"));
//        System.out.println(new Solution().strStr("", ""));
    }
}
