package edu.university.leetcode.string.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 443. String Compression
 * Given an array of characters, compress it in-place.
 * The length after compression must always be smaller than or equal to the original array.
 * Every element of the array should be a character (not int) of length 1.
 * After you are done modifying the input array in-place, return the new length of the array.
 * Follow up: Could you solve it using only O(1) extra space?
 * Example 1: Input: ["a","a","b","b","c","c","c"]
 * Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
 * Explanation: "aa" is replaced by "a2". "bb" is replaced by "b2". "ccc" is replaced by "c3".
 * Example 2: Input: ["a"]
 * Output: Return 1, and the first 1 characters of the input array should be: ["a"]
 * Explanation: Nothing is replaced.
 */
@Slf4j
public class P443_StringCompression {

    public static int compress(char[] chars) {
        int len = chars.length, cur = 0;
        for (int i = 0, j = 0; i < len; i = j) {
            log.info("i = {} j = {}", i, j);
            while (j < len && chars[j] == chars[i]) j++;
            log.info("j++ = {}", j);
            chars[cur++] = chars[i];
            log.info("         chars[{}] = {}",cur - 1, chars[cur - 1]);
            if (j - i == 1) continue;
            for (char c :  ("" + (j - i)).toCharArray()) chars[cur++] = c;
            log.info("         chars[{}] = {}",cur - 1, chars[cur - 1]);
        }
        log.info("chars = {}",chars);
        return cur;
    }

}
