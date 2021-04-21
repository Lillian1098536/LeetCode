package edu.university.leetcode.string.easy;

/**
 * 242. Valid Anagram
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * For example, s = "anagram", t = "nagaram", return true. s = "rat", t = "car", return false.
 * Note: You may assume the string contains only lowercase alphabets.
 */
public class P242_ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        int[] keyMap = new int[26];
        for (char c : s.toCharArray()) {
            keyMap[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            if (keyMap[c - 'a'] < 1) {
                return false;
            } else {
                keyMap[c - 'a']--;
            }
        }
        return true;
    }

}
