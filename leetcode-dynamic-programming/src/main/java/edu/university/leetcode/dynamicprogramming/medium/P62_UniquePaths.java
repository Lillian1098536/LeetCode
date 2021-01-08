package edu.university.leetcode.dynamicprogramming.medium;

/**
 * 62. Unique Paths
 * Example 1: Input: m = 3, n = 2 Output: 3
 * Explanation:
 * From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
 * 1. Right -> Right -> Down
 * 2. Right -> Down -> Right
 * 3. Down -> Right -> Right
 * Example 2: Input: m = 7, n = 3 Output: 28
 */
public class P62_UniquePaths {

    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1];
    }

    public static int uniquePathsDfs(int m, int n) {
        return dfs(0, 0, m, n);
    }

    public static int dfs(int i, int j, int m, int n) {
        if (i == m - 1 || j == n - 1) return 1;
        if (i < m - 1 && j < n - 1) {
            return dfs(i + 1, j , m, n) + dfs(j, j + 1, m, n);
        }
        if (i < m - 1) return dfs(i + 1, j, m, n);
        if (j < n - 1) return dfs(i, j  + 1, m, n);
        return 0;
    }
}
