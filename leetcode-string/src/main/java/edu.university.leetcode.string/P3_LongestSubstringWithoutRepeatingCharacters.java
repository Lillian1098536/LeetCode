package edu.university.leetcode.string;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * 3. Longest Substring Without Repeating Characters
 * Given a string, find the length of the longest substring without repeating characters.
 * Examples:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
@Slf4j
public class P3_LongestSubstringWithoutRepeatingCharacters {

    static final int NO_OF_CHARS = 256;

    /**
     * Approach: Assumeing ASCII 256
     * If we know that the charset is rather small
     * we can replace the Map with an integer array as direct access table
     * Commonly used tables are:
     * int[26] for Letters 'a' - 'z' or 'A' - 'Z'
     * int[128] for ASCII
     * int[256] for Extended ASCII
     *
     * Complexity Analysis
     * Time complexity : O(n). Index i will iterate n times.
     * Space complexity (HashMap) : O(min(m, n)).
     * Space complexity (Table): O(m). m is the size of the charset.
     *
     * @param s
     * @return longest
     */
    public static int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }
        if (s.length() <= 1) {
            return s.length();
        }
        int longest = 0, start = 0;
        int[] dict = new int[NO_OF_CHARS];
        for (int i = 0; i < s.length(); i++) {
            log.debug("dict[{}]={} ", s.charAt(i), dict[s.charAt(i)]);
            start = Math.max(dict[s.charAt(i)], start);
            log.debug("start={}", start);
            longest = Math.max(longest, i - start + 1);
            dict[s.charAt(i)] = i + 1;
        }
        log.debug("lengthOfLongestSubstring={}", longest);
        return longest;
    }

    /**
     * Approach:
     *
     * @param s
     * @return longest
     */
    public static int longeseSubstring(String s) {
        int longest = 0, start = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, len = s.length(); i < len; i++) {
            if (map.containsKey(s.charAt(i))) {
                start = Math.max(map.get(s.charAt(i)), start);
            }
            map.put(s.charAt(i), i + 1);
            longest = Math.max(longest, i - start + 1);
        }
        log.debug("longeseSubstring={}", longest);
        return longest;
    }

}
