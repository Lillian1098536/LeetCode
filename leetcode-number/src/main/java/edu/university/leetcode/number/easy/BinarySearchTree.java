package edu.university.leetcode.number.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Binary Search Tree Traversal
 * pre-order: current node -> left child -> right child
 * in-order: left child -> current node -> right child
 * post-order: left child -> right child -> current node
 */
public class BinarySearchTree {

    /**
     * Time complexity O(n)
     */
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

    /**
     * Time complexity O(n^2)
     */
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        } else if (Math.abs(maxDepth(root.left) - maxDepth(root.right)) > 1) {
            return false;
        } else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    /**
     * Time complexity O(n)
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }
    public TreeNode sortedArrayToBST(int[] nums, int l, int r) {
        if (l > r) return null;
        int m = (l + r) / 2;
        TreeNode node = new TreeNode(nums[m]);
        node.left = sortedArrayToBST(nums, l, m - 1);
        node.right = sortedArrayToBST(nums, m + 1, r);
        return node;
    }
    
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            this.val = x;
            this.left = this.right = null;
        }
    }
}
