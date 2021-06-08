package edu.university.leetcode.dynamicprogramming.medium;

import java.util.ArrayList;
import java.util.List;

import static edu.university.leetcode.dynamicprogramming.medium.P337_HouseRobberIII.TreeNode;

/**
 * 95. Unique Binary Search Trees II
 * Given an integer n, return all the structurally unique BST's (binary search trees), which has exactly n nodes of unique
 * values from 1 to n. Return the answer in any order.
 * Example 1: Input: n = 3
 *  1   1         2         3   3
 *   \   \      /  \       /   /
 *   3    2    1    3    2    1
 *  /      \            /      \
 * 2        3          1        2
 * Output: [[1,null,2,null,3],[1,null,3,2],[2,1,3],[3,1,null,null,2],[3,2,null,1]]
 * Example 2: Input: n = 1
 * Output: [[1]]
 * Constraints:
 * 1 <= n <= 8
 *
 */
public class P95_UniqueBinarySearchTreesII {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<>();
        return generateTrees(1, n);
    }
    private List<TreeNode> generateTrees(int start, int end) {
        List<TreeNode> result = new ArrayList<>();
        if (start > end) {
            result.add(null);
            return result;
        }
        for (int i = start; i <= end; i++) {
            List<TreeNode> lefts = generateTrees(start, i - 1);
            List<TreeNode> rights = generateTrees(i + 1, end);
            for (TreeNode l : lefts) {
                for (TreeNode r : rights) {
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    result.add(root);
                } // for right
            } // for left
        } // for i
        return result;
    }
}
