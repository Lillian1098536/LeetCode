package edu.university.leetcode.string.easy;

/**
 * 387. First Unique Character in a String
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * Examples: s = "leetcode" return 0. s = "loveleetcode", return 2.
 */
public class P387_FirstUniqueCharacterInAString {

    public static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.lastIndexOf(s.charAt(i)) == s.indexOf(s.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqCharacter(String s) {
        int[] charMap = new int[26];
        for (char c : s.toCharArray()) {
            charMap[c - 'a']++;
        }

        for (int i = 0, len = s.length(); i < len; i++) {
            if (charMap[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

}
