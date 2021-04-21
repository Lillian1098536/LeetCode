package edu.university.leetcode.string.hard;

import lombok.extern.slf4j.Slf4j;

/**
 * 44. Wildcard Matching
 * Implement wildcard pattern matching with support for '?' and '*'.
 * '?' Matches any single character.
 * '*' Matches any sequence of characters (including the empty sequence).
 * The matching should cover the entire input string (not partial).
 * The function prototype should be:bool isMatch(const char *s, const char *p)
 * Some examples:
 * isMatch("aa","a") → false
 * isMatch("aa","aa") → true
 * isMatch("aaa","aa") → false
 * isMatch("aa", "*") → true
 * isMatch("aa", "a*") → true
 * isMatch("ab", "?*") → true
 * isMatch("aab", "c*a*b") → false
 */
@Slf4j
public class P44_WildcardMatching {
    public static boolean isMatch(String s, String p) {
        if (p.isEmpty()) {
            return s.isEmpty();
        }
        int i = 0, j = 0, m = s.length(), n = p.length(),  match = 0, star = -1;
        while (i < m) {
            if (j < n && (p.charAt(j) == '?' || (p.charAt(j) == s.charAt(i)))) {
                i++;
                j++;
                log.debug(">> ?  =  >> i={} j={} match={} star={}", i, j, match, star);
            } else if (j < n && p.charAt(j) == '*') {
                star = j++;
                match = i;
                log.debug(">>     * >> i={} j={} match={} star={}", i, j, match, star);
            } else if (star != -1) {
                j = star + 1;
                i = ++match;
                log.debug(">> != -1 >> i={} j={} match={} star={} ", i, j, match, star);
            } else {
                return false;
            }
        }
        while (j < n) {
            j++;
        }
        return j == n;
    }
}
