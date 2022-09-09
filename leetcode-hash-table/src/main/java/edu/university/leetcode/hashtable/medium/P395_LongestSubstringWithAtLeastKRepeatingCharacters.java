package edu.university.leetcode.hashtable.medium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * 395. Longest Substring with At Least K Repeating Characters
 * Given a string s and an integer k, return the length of the longest substring of s such that the frequency of each character
 * in this substring is greater than or equal to k.
 * Example 1: Input: s = "aaabb", k = 3 Output: 3
 * Explanation: The longest substring is "aaa", as 'a' is repeated 3 times.
 * Example 2: Input: s = "ababbc", k = 2 Output: 5
 * Explanation: The longest substring is "ababb", as 'a' is repeated 2 times and 'b' is repeated 3 times.
 * Constraints:
 * 1 <= s.length <= 104
 * s consists of only lowercase English letters.
 * 1 <= k <= 105
 */
public class P395_LongestSubstringWithAtLeastKRepeatingCharacters {
    private static final Logger LOG = LogManager.getLogger(P395_LongestSubstringWithAtLeastKRepeatingCharacters.class);
    public int longestSubstring(String s, int k) {
        LOG.info("<<< s={} k={} >>> ", s, k);
        if (s.length() < k) return 0;
        Map<Character, Integer> counter = new HashMap<>();
        for (char c : s.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        LOG.info("counter={}", counter);
        for (char c : counter.keySet()) {
            LOG.info("c={}", c);
            if (counter.get(c) < k) {
                int result = 0;
                for (String sub : s.split(String.valueOf(c))) {
                    result = Math.max(result, longestSubstring(sub, k));
                    LOG.info("\tsub={}\tresult={}", sub, result);
                }
                LOG.info("\t\treturn result={}", result);
                return result;
            }
        }
        LOG.info("s={}", s);
        return s.length();
    }
}
