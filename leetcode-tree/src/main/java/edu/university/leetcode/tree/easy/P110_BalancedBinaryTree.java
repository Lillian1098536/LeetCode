package edu.university.leetcode.tree.easy;

import static edu.university.leetcode.tree.easy.P100_SameTree.TreeNode;

/**
 * 110. Balanced Binary Tree
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined as:
 * a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 * Example 1: Given the following tree [3,9,20,null,null,15,7]:
 *     3
 *    / \
 *   9  20
 *  /  \
 * 15   7
 * Return true.
 * Example 2: Given the following tree [1,2,2,3,3,null,null,4,4]:
 *       1
 *      / \
 *     2   2
 *    / \
 *   3   3
 *  / \
 * 4   4
 * Return false.
 */
public class P110_BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int left = depth(root.left);
        int right = depth(root.right);
        if ((left - right) > 1 || (left - right) < -1) {
            return false;
        } else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }

    private int depth(TreeNode node) {
        if (node == null) {
            return 0;
        } else if (node.left == null && node.right == null) {
            return 1;
        } else {
            int left = depth(node.left);
            int right = depth(node.right);
            return 1 + (left > right ? left : right);
        }
    }

    private boolean result = true;

    public boolean isBalancedTree(TreeNode root) {
        maxDepth(root);
        return result;
    }

    private int maxDepth(TreeNode node) {
        if (node == null) return 0;
        int l = maxDepth(node.left);
        int r = maxDepth(node.right);
        if (Math.abs(l - r) > 1) {
            result = false;
        }
        return 1 + Math.max(l, r);
    }

}
