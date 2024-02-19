package edu.university.leetcode.tree.medium;

import edu.university.leetcode.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 102. Binary Tree Level Order Traversal
 * Given the root of a binary tree, return the level order traversal of its nodes' values.
 * (i.e., from left to right, level by level).
 * Example 1:
 *   3
 *  / \
 * 9 20
 *   / \
 *  15 7
 * Input: root = [3,9,20,null,null,15,7] Output: [[3],[9,20],[15,7]]
 * Example 2: Input: root = [1] Output: [[1]]
 * Example 3: Input: root = [] Output: []
 * Constraints:
 * The number of nodes in the tree is in the range [0, 2000].
 * -1000 <= Node.val <= 1000
 */
public class P102_BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(root, res, 0);
        return res;
    }

    /**
     * depth first search - recursive - Stack
     * @param root
     * @param res
     * @param height
     */
    public void dfs(TreeNode root, List<List<Integer>> res, int height) {
        if (root == null) return;
        if (res.size() <= height)
            res.add(new ArrayList<>());
        res.get(height).add(root.val);
        dfs(root.left, res, height + 1);
        dfs(root.right, res, height + 1);
    }

    /**
     * breadth first search - Queue
     * @param root
     * @return
     */
    public List<List<Integer>> bfs(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root != null) q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                level.add(cur.val);
                if (cur.left != null) q.offer(cur.left);
                if (cur.right != null) q.offer(cur.right);
            }
            res.add(level);
        }
        return res;
    }

        public static void main(String[] args) {
        P102_BinaryTreeLevelOrderTraversal test = new P102_BinaryTreeLevelOrderTraversal();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println("res=[[3], [9, 20], [15, 7]]\nbfs=" + test.bfs(root));
        System.out.println("dfs=" + test.levelOrder(root));
    }
}
