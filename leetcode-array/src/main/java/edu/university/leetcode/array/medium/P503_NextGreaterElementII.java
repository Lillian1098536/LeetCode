package edu.university.leetcode.array.medium;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Stack;

/**
 * 503. Next Greater Element II
 * Given a circular array (the next element of the last element is the first element of the array), print the Next Greater
 * Number for every element. The Next Greater Number of a number x is the first greater number to its traversing-order next
 * in the array, which means you could search circularly to find its next greater number. If it doesn't exist, output -1
 * for this number.
 * Example 1: Input: [1,2,1] Output: [2,-1,2]
 * Explanation: The first 1's next greater number is 2;
 * The number 2 can't find next greater number;
 * The second 1's next greater number needs to search circularly, which is also 2.
 * Note: The length of given array won't exceed 10000.
 */
@Slf4j
public class P503_NextGreaterElementII {

    public static int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < 2 * len; i++) {
            int tmp = nums[i % len];
            log.info("i = {} tmp = {}", i, tmp);
            while (!stack.isEmpty() && nums[stack.peek()] < tmp) {
                result[stack.pop()] = tmp;
            }
            if (i < len) {
                stack.push(i);
            }
        }
        log.info("result = {}", result);
        return result;
    }

}
