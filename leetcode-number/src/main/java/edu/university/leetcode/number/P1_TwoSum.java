package edu.university.leetcode.number;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.HashMap;

/**
 * 1. Two Sum
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example: Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 */
@Slf4j
public class P1_TwoSum {

    /**
     * Approach: One-pass Hash Table
     * Complexity Analysis
     * Time complexity : O(n). Traverse the list containing n elements only once. Each look up in the table costs only O(1) time.
     * Space complexity : O(n). The extra space required depends on the number of items stored in the hash table, which stores at most n elements.
     *
     * @param numbers
     * @param target
     * @return result
     */
    public static int[] getTwoSumNumbers(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(numbers[0], 1);
        int[] result = new int[2];
        for (int i = 1; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i + 1;
                result[0] = map.get(target - numbers[i]);
                log.debug("The numbers are at postion= {}, {} and values = {}, {}", result[0], result[1], target - numbers[i], numbers[i]);
                return result;
            }
            map.put(numbers[i], i + 1);
        }
        throw new IllegalArgumentException("No two sum solution");

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 0);
        int[] result = new int[2];
        for (int i = 1; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                log.debug("The numbers are at postion= {}, {} and values = {}, {}", result[0], result[1], target - nums[i], nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
