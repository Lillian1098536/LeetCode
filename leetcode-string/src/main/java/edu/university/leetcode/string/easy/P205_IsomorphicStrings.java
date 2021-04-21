package edu.university.leetcode.string.easy;

/**
 * 205. Isomorphic Strings
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character but a character may map to itself.
 * Example 1: Input: s = "egg", t = "add" Output: true
 * Example 2: Input: s = "foo", t = "bar" Output: false
 * Example 3: Input: s = "paper", t = "title" Output: true
 */
public class P205_IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] map = new char[128];
        boolean[] visited = new boolean[128];
        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i), ct = t.charAt(i);
            if (map[cs] == '\u0000') {
                map[cs] = ct;
                if (visited[ct]) {
                    return false;
                }
                visited[ct] = true;
            } else if (map[cs] != ct) {
                return false;
            }
        }
        return true;
    }
}
