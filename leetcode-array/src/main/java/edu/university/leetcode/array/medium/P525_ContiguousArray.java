package edu.university.leetcode.array.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * 525. Contiguous Array
 * Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
 * Example 1: Input: nums = [0,1] Output: 2
 * Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.
 * Example 2: Input: nums = [0,1,0] Output: 2
 * Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
 * Constraints:
 * 1 <= nums.length <= 105
 * nums[i] is either 0 or 1.
 */
public class P525_ContiguousArray {
    public int findMaxLength(int[] nums) {
        int sum = 0, max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] == 1 ? 1 : -1;
            if (map.containsKey(sum)) {
                max = Math.max(max, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        P525_ContiguousArray test = new P525_ContiguousArray();
        System.out.println(test.findMaxLength(new int[]{0, 1}));
        System.out.println(test.findMaxLength(new int[]{0, 1, 0}));
    }
}
