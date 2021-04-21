package edu.university.leetcode.string.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * 438. Find All Anagrams in a String
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
 * Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
 * The order of output does not matter.
 * Example 1: Input: s: "cbaebabacd" p: "abc" Output: [0, 6]
 * Explanation:
 * The substring with start index = 0 is "cba", which is an anagram of "abc".
 * The substring with start index = 6 is "bac", which is an anagram of "abc".
 * Example 2: Input: s: "abab" p: "ab" Output:
 * [0, 1, 2]
 *
 * Explanation:
 * The substring with start index = 0 is "ab", which is an anagram of "ab".
 * The substring with start index = 1 is "ba", which is an anagram of "ab".
 * The substring with start index = 2 is "ab", which is an anagram of "ab".
 */
@Slf4j
public class P438_FindAllAnagramsInAString {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || p.length() > s.length() ) return result;
        char[] sChars = s.toCharArray(), pChars = p.toCharArray();
        int[] count = new int[256];
        for (char c : pChars) count[c]++;
        int l = 0, r = 0;
        while (r < s.length()) {
            if (count[sChars[r]] > 0) {
                count[sChars[r]]--;
                r++;
            } else {
                count[sChars[l]]++;
                l++;
            }
            if ((r-l) == p.length()) result.add(l);
        }
        return result;
    }

}
