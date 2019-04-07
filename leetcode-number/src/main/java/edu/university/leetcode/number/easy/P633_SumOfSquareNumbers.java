package edu.university.leetcode.number.easy;

/**
 * 633. Sum of Square Numbers
 * Given a non-negative integer c, your task is to decide whether there're two integers a and b such that a2 + b2 = c.
 * Example 1:
 * Input: 5 Output: True Explanation: 1 * 1 + 2 * 2 = 5
 * Example 2: Input: 3 Output: False
 */
public class P633_SumOfSquareNumbers {

    public boolean judgeSquareSum(int c) {
        int start = 0, end = (int)Math.sqrt(c);
        while (start <= end) {
            int target = start * start + end * end;
            if (target > c) {
                end--;
            } else if (target < c) {
                start++;
            } else {
                return true;
            }
        }
        return false;
    }
}
