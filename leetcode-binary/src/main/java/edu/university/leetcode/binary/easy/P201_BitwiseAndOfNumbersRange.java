package edu.university.leetcode.binary.easy;

/**
 * 201. Bitwise AND of Numbers Range
 * Given two integers left and right that represent the range [left, right], return the bitwise AND of all numbers in this range, inclusive.
 * Example 1: Input: left = 5, right = 7 Output: 4
 * Example 2: Input: left = 0, right = 0 Output: 0
 * Example 3: Input: left = 1, right = 2147483647 Output: 0
 * Constraints:
 * 0 <= left <= right <= 231 - 1
 */
public class P201_BitwiseAndOfNumbersRange {
    public int rangeBitwiseAnd(int left, int right) {
        int cnt = 0;
        while (left != right) {
            left >>= 1;
            right >>= 1;
            cnt++;
        }
        return left << cnt;
    }

    public static void main(String[] args) {
        P201_BitwiseAndOfNumbersRange test = new P201_BitwiseAndOfNumbersRange();
        System.out.println(test.rangeBitwiseAnd(5, 7));
    }
}
