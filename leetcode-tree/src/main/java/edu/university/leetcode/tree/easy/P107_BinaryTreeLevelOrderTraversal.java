package edu.university.leetcode.tree.easy;

import edu.university.leetcode.tree.easy.P100_SameTree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 107. Binary Tree Level Order Traversal II
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values.
 * (ie, from left to right, level by level from leaf to root).
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *       3
 *      / \
 *     9  20
 *    /  \
 *  15   7
 * return its bottom-up level order traversal as:
 * [
 *    [15,7],
 *    [9,20],
 *    [3]
 * ]
 */
public class P107_BinaryTreeLevelOrderTraversal {

    /**
     * BFS: breadth first search
     * @return
     */
    public static List<List<Integer>> levelOrderBottomBFS(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> sub = new LinkedList<>();
            for (int i = 0; i < levelSize; i++) {
                if (queue.peek().left != null) queue.offer(queue.peek().left);
                if (queue.peek().right != null) queue.offer(queue.peek().right);
                sub.add(queue.poll().val);
            }
            result.add(sub);
        }
        return result;
    }

    /**
     * DFS: depth first search
     * @return
     */
    public static List<List<Integer>> levelOrderBottomDFS(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        levelMarker(result, root, 0);
        return result;
    }

    public static void levelMarker(List<List<Integer>> list, TreeNode root, int level) {
        if (root == null) return;
        if (level >= list.size()) {
            list.add(0, new LinkedList<>());
        }
        levelMarker(list, root.left, level + 1);
        levelMarker(list, root.right, level + 1);
        list.get(list.size() - level - 1).add(root.val);
    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> tree = new ArrayList<>();
        if (root == null) {
            return tree;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int curLevelCnt = 1, nextLevelCnt = 0;
        List<Integer> levelTree = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            curLevelCnt--;
            levelTree.add(cur.val);
            if (cur.left != null) {
                queue.add(cur.left);
                nextLevelCnt++;
            }
            if (cur.right != null) {
                queue.add(cur.right);
                nextLevelCnt++;
            }
            if (curLevelCnt == 0) {
                curLevelCnt = nextLevelCnt;
                nextLevelCnt = 0;
                //add one tree node as index 0 in the beginning
                tree.add(0, levelTree);
                levelTree = new ArrayList<>();
            }
        }
        return tree;
    }

}
