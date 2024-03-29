package edu.university.leetcode.array.easy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 453. Minimum Moves to Equal Array Elements
 * Given a non-empty integer array of size n,
 * find the minimum number of moves required to make all array elements equal,
 * where a move is incrementing n - 1 elements by 1.
 * Example: Input: [1,2,3] Output: 3
 * Explanation: Only three moves are needed (remember each move increments two elements):
 * [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 */
public class P45_MinimumMovesToEqualArrayElements {
    private final static Logger LOG = LoggerFactory.getLogger(P45_MinimumMovesToEqualArrayElements.class);
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE, sum = 0;
        for (int num : nums) {
            min = Math.min(min, num);
            sum += num;
            LOG.info("num = {} min = {} sum={}", num, min, sum);
        }
        return sum - min * nums.length;
    }

}
