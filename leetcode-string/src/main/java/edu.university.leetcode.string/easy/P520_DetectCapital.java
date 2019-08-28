package edu.university.leetcode.string.easy;

/**
 * 520. Detect Capital
 * Given a word, you need to judge whether the usage of capitals in it is right or not.
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 * All letters in this word are capitals, like "USA".
 * All letters in this word are not capitals, like "leetcode".
 * Only the first letter in this word is capital, like "Google".
 * Otherwise, we define that this word doesn't use capitals in a right way.
 * Example 1: Input: "USA" Output: True
 * Example 2: Input: "FlaG" Output: False
 * Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
 */
public class P520_DetectCapital {

    public static boolean detectCapitalUse(String word) {
        int count = 0, n = word.length();
        for (int i = 0; i < n; i++) {
            if (word.charAt(i) <= 'Z') count++;
        }
        return count == 0 || count == n || (count == 1 && word.charAt(0)  <= 'Z');
    }

}
