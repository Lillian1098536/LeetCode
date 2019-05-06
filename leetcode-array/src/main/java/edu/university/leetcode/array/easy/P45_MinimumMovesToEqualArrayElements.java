package edu.university.leetcode.array.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 453. Minimum Moves to Equal Array Elements
 * Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal,
 * where a move is incrementing n - 1 elements by 1.
 * Example: Input: [1,2,3] Output: 3
 * Explanation: Only three moves are needed (remember each move increments two elements):
 * [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 */
@Slf4j
public class P45_MinimumMovesToEqualArrayElements {

    public static int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE, sum = 0;
        for (int num : nums) {
            min = Math.min(min, num);
            log.info("num = {} min = {}", num, min);
            sum += num;
        }
        return sum - min * nums.length;
    }

}
