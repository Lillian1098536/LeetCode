package edu.university.leetcode.tree.easy;

import edu.university.leetcode.tree.TreeNode;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * 257. Binary Tree Paths
 * Given a binary tree, return all root-to-leaf paths.
 * Note: A leaf is a node with no children.
 * Example: Input:
 *     1
 *   /   \
 *  2     3
 *   \
 *    5
 * Output: ["1->2->5", "1->3"]
 * Explanation: All root-to-leaf paths are: 1->2->5, 1->3
 */
@Slf4j
public class P257_BinaryTreePaths {

    static List<String> result = new ArrayList<>();

    public static List<String> binaryTreePaths(TreeNode root) {
        findPaths(root, new StringBuilder());
        return result;
    }

    private static void findPaths(TreeNode node, StringBuilder sb) {
        if (node == null) return;
        int len = sb.length();
        sb.append(node.val);
        if (node.left == null && node.right == null) {
            result.add(sb.toString());
        } else {
            sb.append("->");
            findPaths(node.left, sb);
            findPaths(node.right, sb);
        }
        log.info("sb = {} len = {} sb.length() = {}", sb.toString(), len, sb.length());
        sb.setLength(len);
        log.info("sb.setLength(len) = {}", sb.length());
    }

    public List<String> dfs(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root != null) dfs(root, String.valueOf(root.val), res);
        return res;
    }

    /**
     * recursive depth first search
     * @param root
     * @param path
     * @param res
     */
    private void dfs(TreeNode root, String path, List<String> res) {
        if (root.left == null && root.right == null) res.add(path);
        if (root.left != null) dfs(root.left, path + "->" + root.val, res);
        if (root.right != null) dfs(root.right, path + "->" + root.val, res);
    }

    /**
     * not recommend breadth first search
     * @param root
     * @return
     */
    public List<String> bfs(TreeNode root) {
        List<String> res = new ArrayList<>();
        return res;
    }
}
