package edu.university.leetcode.dynamicprogramming.easy;

import java.util.LinkedList;

public class ShortestPath {
    public static int findShortestPath(int[][] m) {
        int[][] dp = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] == 1) {
                    dp[i][j] = -1;
                } else {
                    dp[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        // start point
        dp[0][0] = 0;
        LinkedList<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        while (!queue.isEmpty()) {
            int[] tmp = queue.pop();
            int x = tmp[0];
            int y = tmp[1];
            int value = dp[x][y];
            findNext(queue, dp, x + 1, y, value);
            findNext(queue, dp, x - 1, y, value);
            findNext(queue, dp, x, y + 1, value);
            findNext(queue, dp, x, y - 1, value);
        }
        return dp[m.length - 1][m[0].length - 1];
    }

    private static void findNext(LinkedList<int[]> queue, int[][] dp, int x, int y, int value) {
        if (reachable(dp, x, y) && dp[x][y] > value + 1) {
            dp[x][y] = value + 1;
            queue.add(new int[]{x, y});
        }
    }

    private static boolean reachable(int[][] m, int x, int y) {
        if (x < 0 || y < 0 || x >= m.length || y >= m[0].length || m[x][y] == -1) {
            return false;
        }
        return true;
    }


}
