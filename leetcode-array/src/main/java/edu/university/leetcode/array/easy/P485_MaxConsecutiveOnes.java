package edu.university.leetcode.array.easy;

/**
 * 485. Max Consecutive Ones
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 * Example 1: Input: [1,1,0,1,1,1] Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 * The maximum number of consecutive 1s is 3.
 * Note:
 * The input array will only contain 0 and 1.
 * The length of input array is a positive integer and will not exceed 10,000
 */
public class P485_MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0, max = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n == 1) {
                sum++;
            } else {
                max = Math.max(max, sum);
                sum = 0;
            }
        }
        return Math.max(max, sum);
    }

}
