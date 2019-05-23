package edu.university.leetcode.binary.easy;

/**
 * 504. Base 7
 * Given an integer, return its base 7 string representation.
 * Example 1: Input: 100 Output: "202"
 * Example 2: Input: -7 Output: "-10"
 * Note: The input will be in range of [-1e7, 1e7].
 */
public class P504_Base7 {

    public static String convertToBase7(int num) {
        if (num == 0) return "0";
        boolean sign = num < 0 ? false : true;
        StringBuilder sb = new StringBuilder();
        num = num < 0 ? -num : num;
        while (num > 0) {
            sb.insert(0, num % 7);
            num /= 7;
        }
        if (!sign) {
            sb.insert(0, '-');
        }
        return sb.toString();
    }

}
