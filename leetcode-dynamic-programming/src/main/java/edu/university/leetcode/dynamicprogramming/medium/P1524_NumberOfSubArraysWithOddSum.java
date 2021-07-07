package edu.university.leetcode.dynamicprogramming.medium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * 1524. Number of Sub-arrays With Odd Sum
 * Given an array of integers arr. Return the number of sub-arrays with odd sum.
 * As the answer may grow large, the answer must be computed modulo 10^9 + 7.
 * Example 1: Input: arr = [1,3,5] Output: 4
 * Explanation: All sub-arrays are [[1],[1,3],[1,3,5],[3],[3,5],[5]]
 * All sub-arrays sum are [1,4,9,3,8,5].
 * Odd sums are [1,9,3,5] so the answer is 4.
 * Example 2: Input: arr = [2,4,6] Output: 0
 * Explanation: All sub-arrays are [[2],[2,4],[2,4,6],[4],[4,6],[6]]
 * All sub-arrays sum are [2,6,12,4,10,6].
 * All sub-arrays have even sum and the answer is 0.
 * Example 3: Input: arr = [1,2,3,4,5,6,7] Output: 16
 * Example 4: Input: arr = [100,100,99,99] Output: 4
 * Example 5: Input: arr = [7] Output: 1
 * Constraints:
 * 1 <= arr.length <= 10^5
 * 1 <= arr[i] <= 100
 */
public class P1524_NumberOfSubArraysWithOddSum {
    public static Logger LOG = LoggerFactory.getLogger(P1524_NumberOfSubArraysWithOddSum.class);
    public int numOfSubarrays(int[] arr) {
        int dp = arr[0] % 2 == 0 ? 0 : 1, result = dp;
        for (int i = 1; i < arr.length; i++) {
            boolean odd = arr[i] % 2 == 1;
            dp =  (odd ? 1 : 0) + (!odd ? dp : i - dp);
            result = (result + dp) % 1000000007;
        }
        return result;
    }
    public int numOfSubarrays2(int[] arr) {
        int curSum = 0;
        long subOddSum = 0, even = 1, odd = 0;
        for (int i = 0; i < arr.length; i++) {
            curSum = (curSum + arr[i]) % 2;
            if (curSum % 2 == 0) {
                subOddSum = (subOddSum + odd) % 1000000007;
                even++;
            } else {
                subOddSum = (subOddSum + even) % 1000000007;
                odd++;
            }
        }
        return (int)subOddSum;
    }
    public int numOfSubarrays3(int[] arr) {
        int oddSum = 0, len = arr.length;
        List<List<Integer>> subArrays = new ArrayList<>();
        // pick starting point
        for (int i = 0; i < len; i++) {
            // pick ending point
            for (int j = i; j < len; j++) {
                List<Integer> sub = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    sub.add(arr[k]);
                }
                if (oddSum(sub)) {
                    oddSum++;
                }
                subArrays.add(sub);
            }
        }
        LOG.info("Sub-arrays: \n {}", subArrays);
        return oddSum;
    }
    private boolean oddSum(List<Integer> arr) {
        int sum = 0;
        for (Integer n : arr) {
            sum += n;
        }
        return sum % 2 != 0;
    }
}
