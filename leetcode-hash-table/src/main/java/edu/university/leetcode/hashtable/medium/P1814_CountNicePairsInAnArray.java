package edu.university.leetcode.hashtable.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * 1814. Count Nice Pairs in an Array
 * You are given an array nums that consists of non-negative integers. Let us define rev(x) as the reverse of the non-negative integer x.
 * For example, rev(123) = 321, and rev(120) = 21. A pair of indices (i, j) is nice if it satisfies all of the following conditions:
 * 0 <= i < j < nums.length
 * nums[i] + rev(nums[j]) == nums[j] + rev(nums[i]) // -> nums[i] - rev(nums[i]) == nums[j] - rev(nums[j])
 * Return the number of nice pairs of indices. Since that number can be too large, return it modulo 109 + 7.
 * Example 1: Input: nums = [42,11,1,97] Output: 2
 * Explanation: The two pairs are:
 * - (0,3) : 42 + rev(97) = 42 + 79 = 121, 97 + rev(42) = 97 + 24 = 121.
 * - (1,2) : 11 + rev(1) = 11 + 1 = 12, 1 + rev(11) = 1 + 11 = 12.
 * Example 2: Input: nums = [13,10,35,24,76] Output: 4
 * Constraints:
 * 1 <= nums.length <= 105
 * 0 <= nums[i] <= 109
 */
public class P1814_CountNicePairsInAnArray {
    public int countNicePairs(int[] nums) {
        int result = 0, mod = 1000000000 + 7;
        Map<Integer, Integer> count = new HashMap<>();
        count.put(nums[0] - rev(nums[0]), 1);
        for (int i = 1; i < nums.length; i++) {
            // nums[i] + rev(nums[j]) == nums[j] + rev(nums[i])
            // nums[i] - rev(nums[i]) == nums[j] - rev(nums[j])
            int key = nums[i] - rev(nums[i]);
            int times = count.getOrDefault(key, 0);
            result += times;
            if (result >= mod) {
                result %= mod;
            }
            count.put(key, times + 1);
        }
        return result;
    }

    private int rev(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }
}
