package edu.university.leetcode.array.medium;

import lombok.extern.slf4j.Slf4j;

/**
 * 1004. Max Consecutive Ones III
 * Given an array A of 0s and 1s, we may change up to K values from 0 to 1.
 * Return the length of the longest (contiguous) subarray that contains only 1s.
 * Example 1: Input: A = [1,1,1,0,0,0,1,1,1,1,0], K = 2 Output: 6
 * Explanation: [1,1,1,0,0,1,1,1,1,1,1]
 * Bolded numbers were flipped from 0 to 1.  The longest subarray is underlined.
 * Example 2: Input: A = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], K = 3 Output: 10
 * Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
 * Bolded numbers were flipped from 0 to 1.  The longest subarray is underlined.
 * Note:
 * 1 <= A.length <= 20000
 * 0 <= K <= A.length
 * A[i] is 0 or 1
 */
@Slf4j
public class P1004_MaxConsecutiveOnesIII {

    public int longestOnes(int[] A, int K) {
        int cur = 0, count = 0, result = 0;
        for (int i = 0; i < A.length; i++) {
            log.info("");
            if (A[i] == 0) count++;
            while (count > K)
                if (A[cur++] == 0) count--;
            result = Math.max(result, i - cur + 1);
        }
        return result;
    }

}
