package edu.university.leetcode.string.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 58. Length of Last Word
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * If the last word does not exist, return 0.
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * Example: Input: "Hello World" Output: 5
 */
@Slf4j
public class P58_LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int result = 0;
        boolean falg = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                falg = true;
                result++;
            } else {
                if (falg) {
                    return result;
                }
            }
        }
        return result;
    }

}
