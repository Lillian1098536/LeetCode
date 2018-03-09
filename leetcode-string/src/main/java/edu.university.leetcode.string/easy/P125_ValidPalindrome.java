package edu.university.leetcode.string.easy;

/**
 * 125. Valid Palindrome
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 * Note:
 * Have you consider that the string might be empty? This is a good question to ask during an interview.
 * For the purpose of this problem, we define empty string as valid palindrome.
 */
public class P125_ValidPalindrome {

    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        s = s.toLowerCase();
        int lo = 0, hi = s.length() - 1;
        while (lo < hi) {
            if (!isAlphanumeric(s.charAt(lo))) {
                lo++;
                continue;
            }
            if (!isAlphanumeric(s.charAt(hi))) {
                hi--;
                continue;
            }
            if (s.charAt(lo) != s.charAt(hi)) {
                return false;
            } else {
                lo++;
                hi--;
            }
        }
        return true;
    }

    private boolean isAlphanumeric(char c) {
        if (Character.isDigit(c) || Character.isLetter(c)) {
            return true;
        } else {
            return false;
        }
    }
}
