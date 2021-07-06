package edu.university.leetcode.dynamicprogramming.medium;

/**
 * 1277. Count Square Submatrices with All Ones
 * Given a m * n matrix of ones and zeros, return how many square submatrices have all ones.
 * Example 1:Input: matrix =
 * [[0,1,1,1],
 *   [1,1,1,1],
 *   [0,1,1,1]]
 * Output: 15
 * Explanation:
 * There are 10 squares of side 1.
 * There are 4 squares of side 2.
 * There is  1 square of side 3.
 * Total number of squares = 10 + 4 + 1 = 15.
 * Example 2:Input: matrix =
 * [[1,0,1],
 *   [1,1,0],
 *   [1,1,0]]
 * Output: 7
 * Explanation: There are 6 squares of side 1. There is 1 square of side 2. Total number of squares = 6 + 1 = 7.
 * Constraints:
 * 1 <= arr.length <= 300
 * 1 <= arr[0].length <= 300
 * 0 <= arr[i][j] <= 1
 * Accepted
 * 109,936
 * Submissions
 * 150,377
 */
public class P1277_CountSquareSubmatricesWithAllOnes {
    public int countSquares(int[][] matrix) {
        int count = 0, m = matrix.length, n = matrix[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = matrix[i][j];
                if (i > 0 && j > 0 && dp[i][j] > 0) {
                    dp[i][j] = min(dp[i - 1][j - 1], dp[i][j - 1], dp[i - 1][j]) + 1;
                }
                count += dp[i][j];
            }
        }
        return count;
    }
    private static int min(int a, int b, int c) {
        if (a <= b && a <= c) return a;
        if (b <= a && b <= c) return b;
        return c;
    }
}
