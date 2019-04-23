package edu.university.leetcode.dynamicprogramming.easy;

/**
 * 256. Paint House
 * There are a row of n houses, each house can be painted with one of the three colors: red, blue or green.
 * The cost of painting each house with a certain color is different.
 * You have to paint all the houses such that no two adjacent houses have the same color.
 * The cost of painting each house with a certain color is represented by a n x 3 cost matrix.
 * For example, costs[0][0] is the cost of painting house 0 with color red;
 * costs[1][2] is the cost of painting house 1 with color green, and so on... Find the minimum cost to paint all houses.
 * Note: All costs are positive integers.
 */
public class P256_PaintHouse {

    public int minCost(int[][] costs) {
        if (costs == null || costs.length == 0) return 0;
        int red = 0, blue = 0, green = 0;
        for (int[] cost : costs) {
            int tmpRed = red, tmpBlue = blue, tmpGreen = green;
            red = cost[0] + Math.min(tmpBlue, tmpGreen);
            blue = cost[1] + Math.min(tmpRed, tmpGreen);
            green = cost[2] + Math.min(tmpRed, tmpBlue);
        }
        return Math.min(red, Math.min(blue, green));
    }
}
