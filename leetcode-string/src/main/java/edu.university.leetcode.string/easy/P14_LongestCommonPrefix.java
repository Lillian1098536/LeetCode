package edu.university.leetcode.string.easy;

/**
 * 14. Longest Common Prefix
 * Write a function to find the longest common prefix string amongst an array of strings.
 * To solve this problem, we need to find the two loop conditions. One is the length of the shortest string.
 * The other is iteration over every element of the string array.
 */
public class P14_LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        int minLen = Integer.MAX_VALUE;
        String shortest = null;
        for (String str : strs) {
            if (minLen > str.length()) {
                minLen = str.length();
                shortest = str;
            }
        }

        for (int i = 0; i < minLen; i++) {
            char ch = shortest.charAt(i);
            for (String s : strs) {
                if (s.charAt(i) != ch) {
                    return shortest.substring(0, i);
                }
            }
        }
        return shortest;
    }

}
