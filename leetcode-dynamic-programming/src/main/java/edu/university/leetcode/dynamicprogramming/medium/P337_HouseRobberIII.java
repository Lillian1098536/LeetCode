package edu.university.leetcode.dynamicprogramming.medium;

/**
 * 337. House Robber III
 * The thief has found himself a new place for his thievery again. There is only one entrance to this area, called root.
 * Besides the root, each house has one and only one parent house. After a tour, the smart thief realized that all houses in this place form a binary tree.
 * It will automatically contact the police if two directly-linked houses were broken into on the same night.
 * Given the root of the binary tree, return the maximum amount of money the thief can rob without alerting the police.
 * Example 1: Input: root = [3,2,3,null,3,null,1]
 *     3
 *    / \
 *   2   3
 *    \   \
 *     3   1
 * Output: 7
 * Explanation: Maximum amount of money the thief can rob = 3 + 3 + 1 = 7.
 * Example 2: Input: root = [3,4,5,1,3,null,1]
 * Output: 9
 * Explanation: Maximum amount of money the thief can rob = 4 + 5 = 9.
 */
public class P337_HouseRobberIII {
    public int rob(TreeNode root) {
        return dfs(root)[0];
    }

    private int[] dfs(TreeNode root) {
        int[] dp = new int[] {0, 0};
        if (root != null) {
            int[] dpL = dfs(root.left);
            int[] dpR = dfs(root.right);
            dp[1] = dpL[0] + dpR[0];
            dp[0] = Math.max(dp[1], dpL[1] + dpR[1] + root.val);
        }
        return dp;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() { }
        TreeNode(int val) { this.val = val; }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
