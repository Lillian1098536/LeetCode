package edu.university.leetcode.number.easy;

/**
 * 367. Valid Perfect Square
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.
 * Note: Do not use any built-in library function such as sqrt.
 * Example 1: Input: 16 Output: true
 * Example 2: Input: 14 Output: false
 */
public class P367_ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        for (int i = 1; i <= num / i; i++) {
            if (i * i == num) return true;
        }
        return false;
    }

    // O(lgn)
    public boolean isSquare(int num) {
        long x = num;
        while (x * x > num) {
            x = ((x + num) / x) / 2;
        }
        return x * x == num;
     }

}
