package edu.university.leetcode.string.hard;

/**
 * Regular Expression
 * Implement a simple regex parser which, given a string and a pattern, returns a boolean indicating whether the input matches the pattern.
 * By simple, we mean that the regex can only contain special character:
 * * (star), . (dot), + (plus).
 * The star means what you'd expect, that there will be zero or more of previous character in that place in the pattern.
 * The dot means any character for that position.
 * The plus means one or more of previous character in that place in the pattern.
 */
public class RegularExpression {
    public boolean regMatch(String source, String pattern) {
        if (pattern.length() == 0) return source.length() == 0;
        if (pattern.length() == 1) {
            if (source.length() > 1 || source.length() == 0) return false;
            return source.charAt(0) == pattern.charAt(0);
        }
        if (source.length() != 0 && (pattern.charAt(0) == '.' || pattern.charAt(0) == source.charAt(0))) {
            if (pattern.charAt(1) == '*') {
                return regMatch(source.substring(1), pattern) || regMatch(source, pattern.substring(2));
            } else if (pattern.charAt(1) == '+') {
                return regMatch(source.substring(1), pattern) || regMatch(source.substring(1), pattern.substring(2));
            } else {
                return regMatch(source.substring(1), pattern.substring(1));
            }
        }
        return pattern.charAt(1) == '*' && regMatch(source, pattern.substring(2));
    }

    public static void main(String[] args) {
        RegularExpression test = new RegularExpression();
        System.out.println("Regular Expression match " + test.regMatch("aab", "a"));
        System.out.println("Regular Expression match " + test.regMatch("aa", "aa"));
        System.out.println("Regular Expression match " + test.regMatch("aaa", "aa"));
        System.out.println("Regular Expression match " + test.regMatch("aa", "a*"));
        System.out.println("Regular Expression match " + test.regMatch("aa", ".*"));
        System.out.println("Regular Expression match " + test.regMatch("ab", ".*"));
        System.out.println("Regular Expression match " + test.regMatch("aab", "c*a*b"));
    }
}
