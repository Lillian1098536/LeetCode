package edu.university.leetcode.tree.easy;

import edu.university.leetcode.tree.TreeNode;

/**
 * 270. Closest Binary Search Tree Value
 * Given a non-empty binary search tree and a target value, find the value in the BST that is closest to the target.
 * Note: Given target value is a floating point.
 * You are guaranteed to have only one unique value in the BST that is closest to the target.
 */
public class P270_ClosestBinarySearchTreeValue {
    public static int closestValue(TreeNode root, double target) {
        int min = root.val;
        while (root != null) {
            min = Math.abs(target - root.val ) < Math.abs(target - min) ? root.val : min;
            root = target < root.val ? root.left : root.right;
        }
        return min;
    }
}
