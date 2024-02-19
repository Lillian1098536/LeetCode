package edu.university.leetcode.tree.medium;

import edu.university.leetcode.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 298. Binary Tree Longest Consecutive Sequence
 * Given a binary tree, find the length of the longest consecutive sequence path.
 * The path refers to any sequence of nodes from some starting node to any node in the tree along the parent-child connections.
 * The longest consecutive path need to be from parent to child (cannot be the reverse).
 * For example,
 *
 *    1
 *     \
 *      3
 *     / \
 *    2   4
 *         \
 *          5
 * Longest consecutive sequence path is 3-4-5, so return 3.
 *    2
 *     \
 *      3
 *     /
 *    2
 *   /
 *  1
 * Longest consecutive sequence path is 2-3,not3-2-1, so return 2.
 */
public class P298_BinaryTreeLongestConsecutiveSequence {
    public int longestConsecutive(TreeNode root) {
        if (root == null) return 0;
        int max = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        Queue<Integer> l = new LinkedList<>();
        l.add(1);
        while (q.size() > 0) {
            TreeNode node = q.poll();
            int len = l.poll();
            max = Math.max(max, len);
            if (node.left != null) {
                if (node.left.val == node.val + 1) {
                    l.add(len + 1);
                } else {
                    l.add(1);
                }
                q.add(node.left);
            }
            if (node.right != null) {
                if (node.right.val == node.val + 1) {
                    l.add(len + 1);
                } else {
                    l.add(1);
                }
                q.add(node.right);
            }
        }
        return max;
    }
}
