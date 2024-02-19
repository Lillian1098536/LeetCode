package edu.university.leetcode.tree;

import java.util.List;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(){}
    public TreeNode(int x) {
        this.val = x;
    }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    /**
     * middle -> left -> right
     * @param res
     * @param root
     */
    public static void preorder(List<Integer> res, TreeNode root) {
        if (root == null) return;
        res.add(root.val);
        preorder(res, root.left);
        preorder(res, root.right);
    }

    /**
     * dfs
     * left ->  middle -> right
     * @param res
     * @param root
     */
    public static void inorder(List<Integer> res, TreeNode root) {
        if (root == null) return;
        inorder(res, root.left);
        res.add(root.val);
        inorder(res, root.right);
    }

    /**
     * left -> right -> middle
     * @param res
     * @param root
     */
    public static void postorder(List<Integer> res, TreeNode root) {
        if (root == null) return;
        postorder(res, root.left);
        postorder(res, root.right);
        res.add(root.val);
    }

    public static String printTreeNode() {
        return null;
    }
}
