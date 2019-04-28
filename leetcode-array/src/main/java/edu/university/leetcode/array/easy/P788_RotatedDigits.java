package edu.university.leetcode.array.easy;

/**
 * 788. Rotated Digits
 * X is a good number if after rotating each digit individually by 180 degrees,
 * we get a valid number that is different from X.  Each digit must be rotated - we cannot choose to leave it alone.
 * A number is valid if each digit remains a digit after rotation. 0, 1, and 8 rotate to themselves;
 * 2 and 5 rotate to each other; 6 and 9 rotate to each other,
 * and the rest of the numbers do not rotate to any other number and become invalid.
 * Now given a positive number N, how many numbers X from 1 to N are good?
 * Example: Input: 10 Output: 4
 * Explanation:
 * There are four good numbers in the range [1, 10] : 2, 5, 6, 9.
 * Note that 1 and 10 are not good numbers, since they remain unchanged after rotating.
 */
public class P788_RotatedDigits {

    public static int rotatedDigits(int N) {
        if (N < 2) return 0;
        int good = 0, n = 2;
        while (n <= N) {
            if (check(n++)) good++;
        }
        return good;
    }

    private static boolean check(int n) {
        String s = Integer.toString(n);
        boolean flag = false;
        for (char c : s.toCharArray()) {
            if (c == '2' || c == '5' || c == '6' || c == '9') {
                flag = true;
            }
            if (c == '3' || c == '4' || c == '7') {
                return false;
            }
        }
        return flag;
    }

}
