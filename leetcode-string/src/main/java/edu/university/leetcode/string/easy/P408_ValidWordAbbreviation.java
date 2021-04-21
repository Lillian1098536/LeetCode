package edu.university.leetcode.string.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 408. Valid Word Abbreviation
 * Given a non-empty string s and an abbreviation abbr, return whether the string matches with the given abbreviation.
 * A string such as "word" contains only the following valid abbreviations:
 * ["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", "w1r1", "1o2", "2r1", "3d", "w3", "4"]
 * Notice that only the above abbreviations are valid abbreviations of the string "word". Any other string is not a valid abbreviation of "word".
 * Note: Assume s contains only lowercase letters and abbr contains only lowercase letters and digits.
 * Example 1: Given s = "internationalization", abbr = "i12iz4n": Return true.
 * Example 2: Given s = "apple", abbr = "a2e": Return false.
 */
@Slf4j
public class P408_ValidWordAbbreviation {

    public static boolean validWordAbbreviation(String word, String abbr) {
        int i = 0, j = 0;
        char[] w = word.toCharArray(), a = abbr.toCharArray();
        for (int k = 0; k < abbr.length(); k++) {
            if (Character.isAlphabetic(a[k])) {
                i += j;
                j = 0;
                if (i >= word.length() || w[i++] != a[k]) return false;
            } else {
                j *= 10;
                j += a[k] - '0';
            }
            log.info("i = {} j = {}", i, j);
        }
        i += j;
        if (i != word.length()) return false;
        return true;
    }
}
