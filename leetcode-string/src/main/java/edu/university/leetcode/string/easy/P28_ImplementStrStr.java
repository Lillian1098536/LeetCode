package edu.university.leetcode.string.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 28. Implement strStr()
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * Example 1: Input: haystack = "hello", needle = "ll" Output: 2
 * Example 2: Input: haystack = "aaaaa", needle = "bba" Output: -1
 */
@Slf4j
public class P28_ImplementStrStr {

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        if (needle.length() > haystack.length() || needle == null) {
            return -1;
        }
        for (int start = 0; start < (haystack.length() - needle.length() + 1); start++) {
            for (int i = 0; i < needle.length(); i++) {
                if (haystack.charAt(i + start) != needle.charAt(i)) {
                    break;
                }
                if (i == needle.length() - 1) {
                    return start;
                }
            }
        }
        return -1;
    }
}

