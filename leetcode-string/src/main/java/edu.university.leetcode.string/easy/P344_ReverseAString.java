package edu.university.leetcode.string.easy;

/**
 * 344. Reverse a String
 * Write a function that takes a string as input and returns the string reversed.
 * Example 1: Input: "hello" Output: "olleh"
 * Example 2: Input: "A man, a plan, a canal: Panama" Output: "amanaP :lanac a ,nalp a ,nam A"
 */
public class P344_ReverseAString {

    public static String reverseString(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            char tmp = ch[i];
            ch[i] = ch[j];
            ch[j] = tmp;
        }
        return new String(ch);
    }

}
