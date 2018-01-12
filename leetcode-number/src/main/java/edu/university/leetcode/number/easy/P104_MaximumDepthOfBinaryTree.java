package edu.university.leetcode.number.easy;

import edu.university.leetcode.number.easy.P100_SameTree.TreeNode;
import org.springframework.security.access.method.P;

/**
 * 104. Maximum Depth of Binary Tree
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class P104_MaximumDepthOfBinaryTree {

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return findLevel(root, 0);
    }

    private static int findLevel(TreeNode node, int level) {
        if (node == null) {
            return level;
        }
        return Math.max(findLevel(node.left, level + 1), findLevel(node.right, level + 1));
    }

}
