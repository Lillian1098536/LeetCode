package edu.university.leetcode.tree.easy;

import java.util.Stack;
import static edu.university.leetcode.tree.easy.P100_SameTree.TreeNode;

/**
 * 530. Minimum Absolute Difference in BST
 * Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.
 * Example: Input:
 *    1
 *     \
 *      3
 *     /
 *    2
 * Output: 1
 * Explanation:
 * The minimum absolute difference is 1, which is the difference between 2 and 1 (or between 2 and 3).
 * Note: There are at least two nodes in this BST.
 */
public class P530_MinimumAbsoluteDifferenceInBST {

    public int getMinimumDifference(TreeNode root) {
        int min = Integer.MAX_VALUE;
        Stack<TreeNode> stack = new Stack<>();
        Integer prev = null;
        while (root != null || !stack.empty()) {
            if (root!= null) {
                stack.add(root);
                root = root.left;
            } else {
                TreeNode node = stack.pop();
                if (prev != null) {
                    min = Math.min(min, node.val - prev);
                }
                prev = node.val;
                root = node.right;
            }
        }
        return min;
    }

}
