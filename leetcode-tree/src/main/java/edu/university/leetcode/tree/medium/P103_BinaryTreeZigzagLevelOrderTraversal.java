package edu.university.leetcode.tree.medium;

import edu.university.leetcode.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 103. Binary Tree Zigzag Level Order Traversal
 * Given the root of a binary tree, return the zigzag level order traversal of its nodes' values.
 * (i.e., from left to right, then right to left for the next level and alternate between).
 * Example 1:
 *   3
 *  / \
 * 9 20
 *   / \
 *  15 7
 * Input: root = [3,9,20,null,null,15,7] Output: [[3],[20,9],[15,7]]
 * Example 2: Input: root = [1] Output: [[1]]
 * Example 3: Input: root = [] Output: []
 * Constraints:
 * The number of nodes in the tree is in the range [0, 2000].
 * -100 <= Node.val <= 100
 */
public class P103_BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(root, res, 0);
        return res;
    }

    /**
     *
     * @param root
     * @param res
     * @param height
     */
    public void dfs(TreeNode root, List<List<Integer>> res, int height) {
        if (root == null) return;
        if (res.size() <= height)
            res.add(new ArrayList<>());
        if (height % 2 == 0) { //even level, zig
            res.get(height).add(root.val);
        } else { //odd level, zag
            res.get(height).add(0, root.val);
        }
        dfs(root.left, res, height + 1);
        dfs(root.right, res, height + 1);
    }

    public List<List<Integer>> bfs(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root != null) q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                if (res.size() % 2 == 0) {
                    level.add(cur.val);
                } else { //odd level reverse
                    level.add(0, cur.val);
                }
                if (cur.left != null) q.offer(cur.left);
                if (cur.right != null) q.offer(cur.right);
            }
            res.add(level);
        }
        return res;
    }

    public static void main(String[] args) {
        P103_BinaryTreeZigzagLevelOrderTraversal test = new P103_BinaryTreeZigzagLevelOrderTraversal();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println("res=[[3], [20, 9], [15, 7]]\nbfs=" + test.bfs(root));
        System.out.println("dfs=" + test.zigzagLevelOrder(root));
    }
}
