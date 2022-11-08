package edu.university.leetcode.hashtable.hard;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * 76. Minimum Window Substring
 * Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such
 * that every character in t (including duplicates) is included in the window.
 * If there is no such substring, return the empty string "".
 * The testcases will be generated such that the answer is unique.
 * Example 1: Input: s = "ADOBECODEBANC", t = "ABC" Output: "BANC"
 * Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
 * Example 2: Input: s = "a", t = "a" Output: "a"
 * Explanation: The entire string s is the minimum window.
 * Example 3: Input: s = "a", t = "aa" Output: ""
 * Explanation: Both 'a's from t must be included in the window.
 * Since the largest window of s only has one 'a', return empty string.
 * Constraints:
 * m == s.length
 * n == t.length
 * 1 <= m, n <= 105
 * s and t consist of uppercase and lowercase English letters.
 * Follow up: Could you find an algorithm that runs in O(m + n) time?
 */
public class P76_MinimumWindowSubstring {
    private final static Logger LOG = LogManager.getLogger(P76_MinimumWindowSubstring.class);

    public String minWindow(String s, String t) {
        int m = s.length(), n = t.length();
        String result = "";
        if (m < n) {
            return result;
        }
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> cnt = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        int l = 0, r = 0, p = 0, min = m;
        while (r < m) {
            char right = s.charAt(r);
            if (need.containsKey(right)) {
                cnt.put(right, cnt.getOrDefault(right, 0) + 1);
                if (need.get(right).equals(cnt.get(right))) {
                    p++;
                }
            }
            r++;
            while (p == need.size()) {
                char left = s.charAt(l);
                if (cnt.containsKey(left) && cnt.get(left) >= need.get(left)) {
                    String tmp = s.substring(l, r);
                    if (tmp.length() < min) {
                        result = tmp;
                        min = tmp.length();
                    }
                    cnt.put(left, cnt.get(left) - 1);
                    if (cnt.get(left) < need.get(left)) {
                        p--;
                    }
                }
                l++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        P76_MinimumWindowSubstring test = new P76_MinimumWindowSubstring();
        System.out.println("BANC >>> " + test.minWindow("ADOBECODEBANC", "ABC"));
    }
}
