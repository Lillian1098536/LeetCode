package edu.university.leetcode.array.medium;

/**
 * 487. Max Consecutive Ones II
 * Given a binary array, find the maximum number of consecutive 1s in this array if you can flip at most one 0.
 * Example 1: Input: [1,0,1,1,0] Output: 4
 * Explanation: Flip the first zero will get the the maximum number of consecutive 1s.
 * Note:
 * The input array will only contain 0 and 1.
 * The length of input array is a positive integer and will not exceed 10,000
 * Follow up:
 * What if the input numbers come in one by one as an infinite stream?
 * In other words, you can't store all numbers coming from the stream as it's too large to hold in memory.
 * Could you solve it efficiently?
 */
public class P487_MaxConsecutiveOnesII {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int result = 0, cur = 0, count = 0;
        for (int n : nums) {
            ++count;
            if (n == 0) {
                cur = count;
                count = 0;
            }
            result = Math.max(result, cur + count);
        }
        return result;
    }
}
