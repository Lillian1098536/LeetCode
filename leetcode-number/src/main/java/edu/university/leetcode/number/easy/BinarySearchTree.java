package edu.university.leetcode.number.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Binary Search Tree Traversal
 * pre-order
 * in-order
 * post-order
 */
public class BinarySearchTree {

    public List<Integer> orderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preOrder(root, result);
        inOrder(root, result);
        postOrder(root, result);
        return result;
    }

    /**
     * visit current node, left child, and right child recursively
     */
    public void preOrder(TreeNode node, List<Integer> result) {
        if (node == null) return;
        result.add(node.val);
        preOrder(node.left, result);
        preOrder(node.right, result);
        return;
    }

    /**
     * visit left child, current node, and right child recursively
     */
    public void inOrder(TreeNode node, List<Integer> result) {
        if (node == null) return;
        inOrder(node.left, result);
        result.add(node.val);
        inOrder(node.right, result);
        return;
    }

    /**
     * visit left child, right child, and curent node recursively
     */
    public void postOrder(TreeNode node, List<Integer> result) {
        if (node == null) return;
        postOrder(node.left, result);
        postOrder(node.right, result);
        result.add(node.val);
        return;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            this.val = x;
        }
    }
}
