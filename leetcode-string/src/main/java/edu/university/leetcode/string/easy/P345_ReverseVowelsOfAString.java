package edu.university.leetcode.string.easy;

/**
 * 345. Reverse Vowels of a String
 * Write a function that takes a string as input and reverse only the vowels of a string.
 * Example 1: Input: "hello" Output: "holle"
 * Example 2: Input: "leetcode" Output: "leotcede"
 * Note: The vowels does not include the letter "y".
 */
public class P345_ReverseVowelsOfAString {

    public static String reverseVowels(String s) {
        int start = 0, end = s.length() - 1;
        char[] ch = s.toCharArray();
        char tmp;
        while (start < end) {
            if (isVowel(ch[start]) && isVowel(ch[end])) {
                tmp = ch[start];
                ch[start] = ch[end];
                ch[end] = tmp;
                start++;
                end--;
            } else if (!isVowel(ch[start])) {
                start++;
            } else if (!isVowel(ch[end])) {
                end--;
            }
        }
        return new String(ch);
    }

    public static boolean isVowel(char c) {
        if ("aouieAOUIE".indexOf(c) != -1) {
            return true;
        }
        return false;
    }
}
