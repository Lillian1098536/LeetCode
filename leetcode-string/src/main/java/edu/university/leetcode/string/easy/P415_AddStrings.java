package edu.university.leetcode.string.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 415. Add Strings
 * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
 * Note:
 * The length of both num1 and num2 is < 5100.
 * Both num1 and num2 contains only digits 0-9.
 * Both num1 and num2 does not contain any leading zero.
 * You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
@Slf4j
public class P415_AddStrings {

    public static String addStrings(String num1, String num2) {
        int[] sums = new int[5100];
        int i = num1.length() - 1, j = num2.length() - 1, index = 0;
        while (i >= 0 || j >= 0) {
            int sum = (i >= 0 ? num1.charAt(i) - '0' : 0) + (j >= 0 ? num2.charAt(j) - '0' : 0) + sums[index];
            sums[index] = sum % 10;
            sums[index + 1] = sum / 10;
            index++;
            i--;
            j--;
        }
        StringBuilder sb = new StringBuilder();
        for (i = index; i >= 0; i--) {
            if (sb.length() != 0 || sums[i] != 0) {
                sb.append(sums[i]);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }

}
