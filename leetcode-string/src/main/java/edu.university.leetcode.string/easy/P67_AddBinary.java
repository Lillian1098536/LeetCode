package edu.university.leetcode.string.easy;

/**
 * 67. Add Binary
 * Given two binary strings, return their sum (also a binary string).
 * Example, a = "11" b = "1" Return "100".
 */
public class P67_AddBinary {

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0, i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0) {
            int sum = 0;
            if (i >= 0 && a.charAt(i) == '1') {
                sum++;
            }
            if (j >= 0 && b.charAt(j) == '1') {
                sum++;
            }
            sum += carry;
            if (sum > 1) {
                carry = 1;
            } else {
                carry = 0;
            }
            sb.insert(0, (char) ((sum % 2) + '0'));
            i--;
            j--;
        }
        if (carry == 1) {
            sb.insert(0, '1');
        }
        return sb.toString();
    }

}
