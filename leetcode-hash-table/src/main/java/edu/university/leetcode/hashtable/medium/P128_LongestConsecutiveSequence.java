package edu.university.leetcode.hashtable.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * 128. Longest Consecutive Sequence
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 * You must write an algorithm that runs in O(n) time.
 * Example 1: Input: nums = [100,4,200,1,3,2] Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore, its length is 4.
 * Example 2: Input: nums = [0,3,7,2,5,8,4,6,0,1] Output: 9
 * Constraints:
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 */
public class P128_LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int max_len = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (!map.containsKey(n)) {
                int left = map.getOrDefault(n - 1, 0);
                int right = map.getOrDefault(n + 1, 0);
                int cur_len = 1 + left + right;
                if (cur_len > max_len) {
                    max_len = cur_len;
                }
                map.put(n, cur_len);
                map.put(n - left, cur_len);
                map.put(n + right, cur_len);
            }
        }
        return max_len;
    }

    public static void main(String[] args) {
        P128_LongestConsecutiveSequence test = new P128_LongestConsecutiveSequence();
        System.out.println("4 >>> " + test.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        System.out.println("9 >>> " + test.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }
}
