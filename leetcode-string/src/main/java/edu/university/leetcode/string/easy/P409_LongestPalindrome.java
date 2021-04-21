package edu.university.leetcode.string.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 409. Longest Palindrome
 * Given a string which consists of lowercase or uppercase letters,
 * find the length of the longest palindromes that can be built with those letters.
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 * Note: Assume the length of given string will not exceed 1,010.
 * Example: Input: "abccccdd" Output: 7
 * Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
 */
@Slf4j
public class P409_LongestPalindrome {

    public static int longestPalindrome2(String s) {
        int result = 0;
        int[] chars = new int[128];
        for (int i = 0; i < s.length(); i++) {
            log.info("s.charAt(i) = {} s.charAt(i) - A = {}", s.charAt(i), s.charAt(i) - 'A');
            chars[s.charAt(i) - 'A']++;
        }
        log.info("int[] char = {}", chars);
        boolean flag = false;
        for (int i : chars) {
            if (i % 2 == 1) {
                if (!flag) {
                    flag = true;
                    result += i;
                } else {
                    result += i - 1;
                }
            } else {
                result += i;
            }
        }
        return result;
    }

    public static int longestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int result = 0;
        boolean[] chars = new boolean[128];
        for (char c : s.toCharArray()) {
           if(!(chars[c] = !chars[c])){
               result += 2;
           }
        }
        return s.length() > result ? result + 1 : result;
    }

}
