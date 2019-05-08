package edu.university.leetcode.string.easy;

/**
 * 459. Repeated Substring Pattern
 * Given a non-empty string check if it can be constructed by taking a substring of it
 * and appending multiple copies of the substring together.
 * You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.
 * Example 1: Input: "abab" Output: True
 * Explanation: It's the substring "ab" twice.
 * Example 2: Input: "aba" Output: False
 * Example 3: Input: "abcabcabcabc" Output: True
 * Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
 */
public class P459_RepeatedSubstringPattern {

    public static boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        boolean allRepeated = false;
        char[] chars = s.toCharArray();
        for (int interval = 1; interval <= len / 2; interval++) {
            if (len % interval == 0) {
                boolean oneRepeated = true;
                int count = len / interval;
                for (int i = 0; i < interval; i++) {
                    for (int j = 0; j < count; j++) {
                        oneRepeated = oneRepeated && (chars[i] == chars[i + j * interval]);
                    }
                }
                allRepeated = allRepeated || oneRepeated;
            }
        }
        return allRepeated;
    }

}
