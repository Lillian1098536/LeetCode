package edu.university.leetcode.string.medium;

import lombok.extern.slf4j.Slf4j;

/**
 * 151. Reverse Words in a String
 * Given an input string, reverse the string word by word.
 * Example: Input: "the sky is blue", Output: "blue is sky the".
 * Note:
 * A word is defined as a sequence of non-space characters.
 * Input string may contain leading or trailing spaces. However, your reversed string should not contain leading or trailing spaces.
 * You need to reduce multiple spaces between two words to a single space in the reversed string.
 *  Follow up: For C programmers, try to solve it in-place in O(1) space.
 */
@Slf4j
public class P151_ReverseWordsInAString {

    public static String reverseWords(String s) {
        String result = "";
        String words[] = s.trim().split("\\s+");
        for (int i = words.length - 1; i > 0; --i) {
            result += words[i] + " ";
        }
        return result + words[0];
    }

    public static String reverseWords2(String s) {
        StringBuilder sb = new StringBuilder();
        String words[] = s.trim().split(" ");
        for (int i = words.length - 1; i > 0; --i) {
            sb.append(words[i]).append(" ");
        }
        sb.append(words[0]);
        return sb.toString();
    }

}
