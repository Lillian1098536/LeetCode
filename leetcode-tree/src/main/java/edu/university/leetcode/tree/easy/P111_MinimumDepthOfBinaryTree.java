package edu.university.leetcode.tree.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 111. Minimum Depth of Binary Tree
 * Given a binary tree, find its minimum depth.
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 */
import static edu.university.leetcode.tree.easy.P100_SameTree.TreeNode;
public class P111_MinimumDepthOfBinaryTree {

    /**
     * DFS
     */
    public int minDepthDFS(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null) {
            return 1 + minDepthDFS(root.right);
        } else if (root.right == null) {
            return 1 + minDepthDFS(root.left);
        } else {
            return 1 + Math.min(minDepthDFS(root.left), minDepthDFS(root.right));
        }
    }

    /**
     * BFS
     */
    public int minDepthBFS(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int curLevel = 1; int nextLevel = 0, depth = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            curLevel--;
            if (node.left == null && node.right == null) {
                return depth;
            }
            if (node.left != null) {
                queue.offer(node.left);
                nextLevel++;
            }
            if (node.right != null) {
                queue.offer(node.right);
                nextLevel++;
            }
            if (curLevel == 0) {
                curLevel = nextLevel;
                nextLevel = 0;
                depth++;
            }
        }
        return depth;
    }
}
