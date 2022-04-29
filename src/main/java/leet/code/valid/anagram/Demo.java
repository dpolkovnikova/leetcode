package leet.code.valid.anagram;

public class Demo {

    public static void main(String[] args) {
//        System.out.println(new Solution().isAnagram("anagram", "nagaram"));
//        System.out.println(new Solution().isAnagram("rat", "car"));


        System.out.println(new Solution().isAnagramWithMap("anagram", "nagaram"));
        System.out.println(new Solution().isAnagramWithMap("rat", "car"));
    }
}
