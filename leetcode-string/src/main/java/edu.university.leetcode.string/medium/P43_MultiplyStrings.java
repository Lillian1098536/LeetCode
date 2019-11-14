package edu.university.leetcode.string.medium;

import lombok.extern.slf4j.Slf4j;

/**
 * 43. Multiply Strings
 * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2,
 * also represented as a string.
 * Example 1: Input: num1 = "2", num2 = "3" Output: "6"
 * Example 2: Input: num1 = "123", num2 = "456" Output: "56088"
 * Note:
 * The length of both num1 and num2 is < 110.
 * Both num1 and num2 contain only digits 0-9.
 * Both num1 and num2 do not contain any leading zero, except the number 0 itself.
 * You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
@Slf4j
public class P43_MultiplyStrings {

    public static String multiply(String num1, String num2) {
        String n1 = new StringBuffer(num1).reverse().toString();
        String n2 = new StringBuffer(num2).reverse().toString();

        int[] digits = new int[num1.length() + num2.length()];

        for (int i = 0; i < n1.length(); i++) {
            for (int j = 0; j < n2.length(); j++) {
                digits[i + j] += (n1.charAt(i) - '0') * (n2.charAt(j) - '0');
                log.info("i + j = {} digits[{}] = {}", i + j, i + j, digits[i + j]);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < digits.length; i++) {
            int mod = digits[i] % 10;
            int carry = digits[i] / 10;
            if (i < digits.length - 1) {
                digits[i + 1] += carry;
            }
            sb.insert(0, mod);
        }

        while (sb.charAt(0) == '0' && sb.length() > 1) {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }

    public static int multiplyWithoutOperater(int m, int n) {
        int ans = 0, count = 0;
        while (m > 0) {
            log.info("m = {} n = {}  count = {}", m, n, count);
            if (m % 2 == 1) {
                log.info("n << count = {}", n << count);
                ans += n << count;
                log.info("ans = {}", ans);
            }
            count++;
            m /= 2;
        }
        return ans;
    }

}
